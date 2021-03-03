package com.ruoyi.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.data.annotation.Transient;

/**
 * 员工对象 employee
 *
 * @author ruoyi
 * @date 2020-12-26
 */
public class Employee extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Transient
    private String userAddressDetail;
    @Transient
    private Integer age;

    /**
     * 身份证号码
     */
    @Excel(name = "身份证号码")
    private String idnumber;

    /**
     * 入职日期
     */
    @Excel(name = "入职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdate;

    /**
     * 姓名
     */
    @Excel(name = "姓名")
    private String name;

    /**
     * 联系电话
     */
    @Excel(name = "联系电话")
    private String smstel;

    /**
     * 职位
     */
    @Excel(name = "职位")
    private String positionname;

    /**
     * 转正日期
     */
    @Excel(name = "转正日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beemployeedate;

    /**
     * 在职状态
     */
    @Excel(name = "在职状态")
    private String status;

    /**
     * 国籍
     */
    private String teachercountry;

    /**
     * 拼音名字
     */
    private String nickname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    @Excel(name = "性别")
    private String sex;

    /**
     * 员工编号
     */
    @Excel(name = "员工编号")
    private String serial;

    /**
     * 银行账户
     */
    @Excel(name = "银行账户")
    private String account;

    /**
     * 离职原因
     */
    @Excel(name = "离职原因")
    private String outcausename;

    /**
     * 离职时间
     */
    @Excel(name = "离职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddate;

    /**
     * 全称部门
     */
    @Excel(name = "全称部门")
    private String dnamepart;

    /**
     * 直属部门
     */
    @Excel(name = "直属部门")
    private String depart;

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSmstel(String smstel) {
        this.smstel = smstel;
    }

    public String getSmstel() {
        return smstel;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setBeemployeedate(Date beemployeedate) {
        this.beemployeedate = beemployeedate;
    }

    public Date getBeemployeedate() {
        return beemployeedate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTeachercountry(String teachercountry) {
        this.teachercountry = teachercountry;
    }

    public String getTeachercountry() {
        return teachercountry;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setOutcausename(String outcausename) {
        this.outcausename = outcausename;
    }

    public String getOutcausename() {
        return outcausename;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setDnamepart(String dnamepart) {
        this.dnamepart = dnamepart;
    }

    public String getDnamepart() {
        return dnamepart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDepart() {
        return depart;
    }

    public String getUserAddressDetail() {
        return userAddressDetail;
    }

    public void setUserAddressDetail(String userAddressDetail) {
        this.userAddressDetail = userAddressDetail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("idnumber", getIdnumber())
                .append("startdate", getStartdate())
                .append("Name", getName())
                .append("smstel", getSmstel())
                .append("positionname", getPositionname())
                .append("beemployeedate", getBeemployeedate())
                .append("status", getStatus())
                .append("teachercountry", getTeachercountry())
                .append("nickname", getNickname())
                .append("email", getEmail())
                .append("sex", getSex())
                .append("serial", getSerial())
                .append("account", getAccount())
                .append("outcausename", getOutcausename())
                .append("enddate", getEnddate())
                .append("dnamepart", getDnamepart())
                .append("depart", getDepart())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
