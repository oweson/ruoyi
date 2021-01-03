package com.ruoyi.web.controller.pulbic.kayang;

/**
 * @author oweson
 * @date 2020/12/24 21:35
 */


public class AccessTokenParam extends BaseParam {
    private String acc;
    private String pwd;

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
