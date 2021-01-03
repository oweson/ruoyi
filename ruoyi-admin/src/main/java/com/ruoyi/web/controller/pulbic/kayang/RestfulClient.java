package com.ruoyi.web.controller.pulbic.kayang;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author oweson
 * @date 2020/12/24 21:33
 */


public class RestfulClient {
    private static String post(String url, String param) {
        String date = param;
        try {
            URL testurl = new URL(url);
            //注意提交的编码 这边是需要改变的 这边默认的是 Default：系统当前编码
            byte[] postData = date.getBytes("UTF-8");
            // 设置提交的相关参数
            HttpURLConnection httpConn = (HttpURLConnection) testurl.openConnection();
            httpConn.setRequestMethod("POST");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            httpConn.setRequestProperty("Content-Type", "application/json");
            httpConn.setRequestProperty("Charset", "UTF-8");
            // 提交请求数据
            OutputStream outputStream = httpConn.getOutputStream();
            outputStream.write(postData);
            outputStream.flush();
            BufferedReader reader;
            String srcString;
            StringBuffer sb = new StringBuffer();
            reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
            while ((srcString = reader.readLine()) != null) {
                sb.append(srcString).append("\n");
            }
            reader.close();
            String result = sb.toString();
            return result;
        } catch (Exception ex) {
            return "异常！！";
        }
    }

    public static String StartPostReq(String url, String param) {
        return post(url, param);
    }
}
