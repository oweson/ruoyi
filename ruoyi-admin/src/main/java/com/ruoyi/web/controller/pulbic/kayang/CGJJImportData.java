package com.ruoyi.web.controller.pulbic.kayang;

/**
 * @author oweson
 * @date 2020/12/24 21:39
 */


public class CGJJImportData extends BaseImportData {
    private String ACCUACCOUNT; //"44162119870617242300",
    private String ACCUCITY; //"广东树童教育顾问有限公司黄边分公司",
    private String Certno; //"441621198706172423"
    private Double GJJpay_comp; //105,
    private Double GJJpay_self; //1500,
    private Double GJJpay_all; //210,

    public String getACCUACCOUNT() {
        return ACCUACCOUNT;
    }

    public void setACCUACCOUNT(String ACCUACCOUNT) {
        this.ACCUACCOUNT = ACCUACCOUNT;
    }

    public String getACCUCITY() {
        return ACCUCITY;
    }

    public void setACCUCITY(String ACCUCITY) {
        this.ACCUCITY = ACCUCITY;
    }

    public String getCertno() {
        return Certno;
    }

    public void setCertno(String certno) {
        Certno = certno;
    }

    public Double getGJJpay_comp() {
        return GJJpay_comp;
    }

    public void setGJJpay_comp(Double GJJpay_comp) {
        this.GJJpay_comp = GJJpay_comp;
    }

    public Double getGJJpay_self() {
        return GJJpay_self;
    }

    public void setGJJpay_self(Double GJJpay_self) {
        this.GJJpay_self = GJJpay_self;
    }

    public Double getGJJpay_all() {
        return GJJpay_all;
    }

    public void setGJJpay_all(Double GJJpay_all) {
        this.GJJpay_all = GJJpay_all;
    }
}
