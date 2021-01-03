package com.ruoyi.web.controller.pulbic.kayang;

/**
 * @author oweson
 * @date 2020/12/24 21:36
 */


public class GetDataParam extends BaseParam {
    /**
     * 需要调用的功能编号，对应 skyDataWebAPIs.ID
     */
    private Integer funcId;
    /**
     * 定义 skyDataWebAPIs. DataSource 中 SQL 语句的参数值
     */
    private String paras;
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
    private String accessToken;

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public String getParas() {
        return paras;
    }

    public void setParas(String paras) {
        this.paras = paras;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getDataPart() {
        return dataPart;
    }

    public void setDataPart(String dataPart) {
        this.dataPart = dataPart;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
