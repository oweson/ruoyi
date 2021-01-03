package com.ruoyi.web.controller.pulbic.kayang;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class KayangApi {
    /**
     * 接口服务器的地址
     */
    private String serverUrl;
    /**
     * 用户名
     */
    private String acc;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 指定返回值 Result 的格式，两种选项：json 与 xml
     */
    private String dataFormat;
    /**
     * 指定返回值 Result 的数据范围，三种选项：D 表示只返回数据值，S
     * 表示只返回数据架构，DS 表示以上两种都返回。正常情况下都使用 DS
     */
    private String dataPart;

    /**
     * 身份令牌，通过 StartSession 获取
     */
    private String accessToken = null;

    /**
     * 登录使用path
     */
    private static final String ACCESS_TOKEN_PATH = "Data/StartSession";
    /**
     * 获取数据使用path
     */
    private static final String GET_DATA_PATH = "Data/GetData";

    public KayangApi(String serverUrl, String acc, String pwd, String dataFormat, String dataPart) {
        this.serverUrl = serverUrl;
        this.acc = acc;
        this.pwd = pwd;
        this.dataFormat = dataFormat;
        this.dataPart = dataPart;
    }

    /**
     * 发起请求
     *
     * @param path  请求路径
     * @param param 请求参数
     * @return 响应Bean
     */
    private String request(String path, BaseParam param) throws KayangException {
        String paramStr = JSONUtil.toJsonStr(param);
        String s = RestfulClient.StartPostReq(serverUrl + path, paramStr);
        if (StringUtils.isBlank(s)) {
            throw new KayangException("请求失败");
        }
        BaseResponse response = JSONUtil.toBean(s, BaseResponse.class);
        if (response == null) {
            throw new KayangException("解析失败");
        }
        Integer msgId = response.getMsgId();
        if (msgId != 0) {
            throw new KayangException(response.getMsg());
        }
        return response.getResult();
    }

    /**
     * 登录获取accessToken
     */
    private void login() throws KayangException {
        if (StringUtils.isNotBlank(this.accessToken)) {
            return;
        }
        AccessTokenParam param = new AccessTokenParam();
        param.setAcc(this.acc);
        param.setPwd(this.pwd);
        this.accessToken = request(ACCESS_TOKEN_PATH, param);
    }

    /**
     * 调用查询数据的接口
     *
     * @param funcId 需要调用的功能编号，对应 skyDataWebAPIs.ID
     */
    public String getDataStr(Integer funcId) throws KayangException {
        return getDataStr(funcId, "{}");
    }

    /**
     * 调用查询数据的接口
     *
     * @param funcId 需要调用的功能编号，对应 skyDataWebAPIs.ID
     * @param paras  定义 skyDataWebAPIs. DataSource 中 SQL 语句的参数值
     */
    public String getDataStr(Integer funcId, String paras) throws KayangException {
        login();
        GetDataParam param = new GetDataParam();
        param.setAccessToken(this.accessToken);
        param.setFuncId(funcId);
        param.setDataFormat(this.dataFormat);
        param.setParas(paras);
        param.setDataPart(this.dataPart);
        return request(GET_DATA_PATH, param);
    }

    /**
     * 获取所有员工的兼任信息
     */
    public List<PartOrg> findAllEmployeePort() throws KayangException {
        String dataStr = getDataStr(16);
        JSONObject object = JSONUtil.parseObj(dataStr);
        JSONArray rows = object.getJSONObject("Cvw_Inf_PartOrg").getJSONArray("Row");
        return rows.toList(PartOrg.class);
    }

    /**
     * 获取某个月份所有员工的社保信息
     */
    public List<CSSImportData> findAllSocialSecurity(String date) throws KayangException {
        String dataStr = getDataStr(17, "{term:'" + date + "'}");
        JSONObject object = JSONUtil.parseObj(dataStr);
        JSONArray rows = object.getJSONObject("Cvw_Inf_CSSIMPORT").getJSONArray("Row");
        return rows.toList(CSSImportData.class);
    }

    /**
     * 获取某个月份所有员工的公积金信息
     */
    public List<CGJJImportData> findAllAccumulationFund(String date) throws KayangException {
        String dataStr = getDataStr(18, "{term:'" + date + "'}");
        JSONObject object = JSONUtil.parseObj(dataStr);
        JSONArray rows = object.getJSONObject("Cvw_Inf_CGJJIMPORT").getJSONArray("Row");
        return rows.toList(CGJJImportData.class);
    }

    /**
     * 1 获取所有最新的部门信息
     */
    public List<DeptData> findAllDept() throws KayangException {
        String dataStr = getDataStr(10);
        JSONObject object = JSONUtil.parseObj(dataStr);
        JSONArray rows = object.getJSONObject("oVW_DirDep_ST").getJSONArray("Row");
        return rows.toList(DeptData.class);
    }

    /**
     * 2 获取所有员工的信息
     */
    public List<EmployeeData> findAllEmployee() throws KayangException {
        String dataStr = getDataStr(8);
        JSONObject object = JSONUtil.parseObj(dataStr);
        JSONArray rows = object.getJSONObject("eemployee").getJSONArray("Row");
        return rows.toList(EmployeeData.class);
    }

    public static final KayangApi getInstance() {
        String serverUrl = "http://172.16.12.31:81/STWebserver/KayangWebApi/";
        String acc = "WebServer_User";
        String pwd = "O5i7n4Hg/qwVkqajniJipw==";
        String dataFormat = "json";
        String dataPart = "DS";
        KayangApi kayangApi = new KayangApi(serverUrl, acc, pwd, dataFormat, dataPart);
        return kayangApi;

    }

    public static void main(String[] args) throws KayangException {
        ArrayList<EmployeeData> employeeData1 = Lists.newArrayList();
        KayangApi kayangApi = getInstance();
        List<EmployeeData> allEmployee = kayangApi.findAllEmployee();
        for (EmployeeData employeeData : allEmployee) {
            if (employeeData.getCampusName().equals("信息部")) {
                employeeData1.add(employeeData);
            }
        }
        System.out.println(JSON.toJSONString(employeeData1, true));



     /*   try {
            List<PartOrg> allEmployeePort = kayangApi.findAllEmployeePort();
            System.out.println(allEmployeePort);
        } catch (KayangException e) {
            e.printStackTrace();
        }*/
    }
}
