package com.ruoyi.web.controller.pulbic.kayang;

/**
 * @author oweson
 * @date 2020/12/24 21:38
 */


public class CSSImportData extends BaseImportData {
    /**
     * 缴纳主体
     */
    private String BENEFITCITY; //"长沙市树童英语玖冠教育咨询有限公司",
    /**
     * 社保号
     */
    private String BENEACCOUNT; //"36467303",
    /**
     * 身份证号
     */
    private String Certno; //"360424199106121755"
    private Double SSpay_self; //653.96,
    private Double SSpay_comp; //497.46,
    private Double SSpay_all; //1151.42,

    public String getBENEFITCITY() {
        return BENEFITCITY;
    }

    public void setBENEFITCITY(String BENEFITCITY) {
        this.BENEFITCITY = BENEFITCITY;
    }

    public String getBENEACCOUNT() {
        return BENEACCOUNT;
    }

    public void setBENEACCOUNT(String BENEACCOUNT) {
        this.BENEACCOUNT = BENEACCOUNT;
    }

    public String getCertno() {
        return Certno;
    }

    public void setCertno(String certno) {
        Certno = certno;
    }

    public Double getSSpay_self() {
        return SSpay_self;
    }

    public void setSSpay_self(Double SSpay_self) {
        this.SSpay_self = SSpay_self;
    }

    public Double getSSpay_comp() {
        return SSpay_comp;
    }

    public void setSSpay_comp(Double SSpay_comp) {
        this.SSpay_comp = SSpay_comp;
    }

    public Double getSSpay_all() {
        return SSpay_all;
    }

    public void setSSpay_all(Double SSpay_all) {
        this.SSpay_all = SSpay_all;
    }
}
