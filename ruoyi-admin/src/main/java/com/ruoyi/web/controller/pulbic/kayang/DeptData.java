package com.ruoyi.web.controller.pulbic.kayang;

/**
 * @author oweson
 * @date 2020/12/24 21:49
 */


public class DeptData {
    private String Dnames; //"集团总部",
    private String dNAME1type; //"总部",
    // todo 当此值为区域的时候是五大部门！
    // todo 1 区分：（值为：区域部门，分校部门     才有部门）/（值为：区域，没有部门，仅仅是一个区域）
    private String DEPCUSTOM1; //"集团",
    private String compid; //8,
    private String DepCost; //null,
    private String dNAME4type; //null,
    private String isDisabled; //null,
    private String depcode; //"00001",
    private String deptype; //null,
    private Long dept5; //null,
    private Long dept6; //null,
    private Integer DepGrage; //0,
    private Long Depid; //34,
    private String dNAME3type; //null,
    private String Director; //null,
    private String dNAME5; //null,
    private String Title; //"集团总部",
    private String dNAME6; //null,
    private String dNAME3; //null,
    private String changedate; //"2000-01-01T00:00:00",
    private String dNAME4; //null,
    private String dNAME1; //"集团总部",
    private String dNAME2; //null,
    private String depidPath; //"34",
    private String DepProperty; //null,
    //todo 2  区分是总部还是五大区域
    private String dNAME2type; //null,
    private String adminid; //null,
    private Long dept1; //34,
    private Long dept2; //null,
    private Long dept3; //null,
    private Long dept4; //null
    /**
     * 人事系统部门名字
     */
    private String  F_ora_MulLangText_rsxt;

    public String getDnames() {
        return Dnames;
    }

    public void setDnames(String dnames) {
        Dnames = dnames;
    }

    public String getdNAME1type() {
        return dNAME1type;
    }

    public void setdNAME1type(String dNAME1type) {
        this.dNAME1type = dNAME1type;
    }

    public String getDEPCUSTOM1() {
        return DEPCUSTOM1;
    }

    public void setDEPCUSTOM1(String DEPCUSTOM1) {
        this.DEPCUSTOM1 = DEPCUSTOM1;
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }

    public String getDepCost() {
        return DepCost;
    }

    public void setDepCost(String depCost) {
        DepCost = depCost;
    }

    public String getdNAME4type() {
        return dNAME4type;
    }

    public void setdNAME4type(String dNAME4type) {
        this.dNAME4type = dNAME4type;
    }

    public String getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getDepcode() {
        return depcode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public String getDeptype() {
        return deptype;
    }

    public void setDeptype(String deptype) {
        this.deptype = deptype;
    }

    public Long getDept5() {
        return dept5;
    }

    public void setDept5(Long dept5) {
        this.dept5 = dept5;
    }

    public Long getDept6() {
        return dept6;
    }

    public void setDept6(Long dept6) {
        this.dept6 = dept6;
    }

    public Integer getDepGrage() {
        return DepGrage;
    }

    public void setDepGrage(Integer depGrage) {
        DepGrage = depGrage;
    }

    public Long getDepid() {
        return Depid;
    }

    public void setDepid(Long depid) {
        Depid = depid;
    }

    public String getdNAME3type() {
        return dNAME3type;
    }

    public void setdNAME3type(String dNAME3type) {
        this.dNAME3type = dNAME3type;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getdNAME5() {
        return dNAME5;
    }

    public void setdNAME5(String dNAME5) {
        this.dNAME5 = dNAME5;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getdNAME6() {
        return dNAME6;
    }

    public void setdNAME6(String dNAME6) {
        this.dNAME6 = dNAME6;
    }

    public String getdNAME3() {
        return dNAME3;
    }

    public void setdNAME3(String dNAME3) {
        this.dNAME3 = dNAME3;
    }

    public String getChangedate() {
        return changedate;
    }

    public void setChangedate(String changedate) {
        this.changedate = changedate;
    }

    public String getdNAME4() {
        return dNAME4;
    }

    public void setdNAME4(String dNAME4) {
        this.dNAME4 = dNAME4;
    }

    public String getdNAME1() {
        return dNAME1;
    }

    public void setdNAME1(String dNAME1) {
        this.dNAME1 = dNAME1;
    }

    public String getdNAME2() {
        return dNAME2;
    }

    public void setdNAME2(String dNAME2) {
        this.dNAME2 = dNAME2;
    }

    public String getDepidPath() {
        return depidPath;
    }

    public void setDepidPath(String depidPath) {
        this.depidPath = depidPath;
    }

    public String getDepProperty() {
        return DepProperty;
    }

    public void setDepProperty(String depProperty) {
        DepProperty = depProperty;
    }

    public String getdNAME2type() {
        return dNAME2type;
    }

    public void setdNAME2type(String dNAME2type) {
        this.dNAME2type = dNAME2type;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public Long getDept1() {
        return dept1;
    }

    public void setDept1(Long dept1) {
        this.dept1 = dept1;
    }

    public Long getDept2() {
        return dept2;
    }

    public void setDept2(Long dept2) {
        this.dept2 = dept2;
    }

    public Long getDept3() {
        return dept3;
    }

    public void setDept3(Long dept3) {
        this.dept3 = dept3;
    }

    public Long getDept4() {
        return dept4;
    }

    public void setDept4(Long dept4) {
        this.dept4 = dept4;
    }

    public String getF_ora_MulLangText_rsxt() {
        return F_ora_MulLangText_rsxt;
    }

    public void setF_ora_MulLangText_rsxt(String f_ora_MulLangText_rsxt) {
        F_ora_MulLangText_rsxt = f_ora_MulLangText_rsxt;
    }
}
