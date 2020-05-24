package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 求职对象 offer_city
 * 
 * @author ruoyi
 * @date 2020-04-22
 */
public class OfferCity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 公司名字 */
    @Excel(name = "公司名字")
    private String companyName;

    /** 是否双休 */
    @Excel(name = "是否双休")
    private String doubleStop;

    /** 薪水 */
    @Excel(name = "薪水")
    private Double salary;

    /** 用户评价 */
    @Excel(name = "用户评价")
    private String comment;

    /** 行业 */
    @Excel(name = "行业")
    private String industry;

    /** 员工数量 */
    @Excel(name = "员工数量")
    private Long peopleNumber;

    /** 候选城市（1:上海） */
    @Excel(name = "候选城市", readConverterExp = "1=:上海")
    private String offerCity;

    /** 详细备注 */
    @Excel(name = "详细备注")
    private String offerDesc;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setDoubleStop(String doubleStop) 
    {
        this.doubleStop = doubleStop;
    }

    public String getDoubleStop() 
    {
        return doubleStop;
    }
    public void setSalary(Double salary) 
    {
        this.salary = salary;
    }

    public Double getSalary() 
    {
        return salary;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setPeopleNumber(Long peopleNumber) 
    {
        this.peopleNumber = peopleNumber;
    }

    public Long getPeopleNumber() 
    {
        return peopleNumber;
    }
    public void setOfferCity(String offerCity) 
    {
        this.offerCity = offerCity;
    }

    public String getOfferCity() 
    {
        return offerCity;
    }
    public void setOfferDesc(String offerDesc) 
    {
        this.offerDesc = offerDesc;
    }

    public String getOfferDesc() 
    {
        return offerDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyName", getCompanyName())
            .append("doubleStop", getDoubleStop())
            .append("salary", getSalary())
            .append("comment", getComment())
            .append("industry", getIndustry())
            .append("peopleNumber", getPeopleNumber())
            .append("offerCity", getOfferCity())
            .append("createTime", getCreateTime())
            .append("offerDesc", getOfferDesc())
            .toString();
    }
}
