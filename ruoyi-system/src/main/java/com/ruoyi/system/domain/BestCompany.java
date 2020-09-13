package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 优秀公司关注对象 best_company
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public class BestCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Integer id;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 城市 */
    @Excel(name = "城市")
    private String type;

    /** 行业 */
    @Excel(name = "行业")
    private String industry;

    /** 分离 */
    @Excel(name = "分离")
    private String backendFrond;

    /** 薪水 */
    @Excel(name = "薪水")
    private BigDecimal salary;

    /** 详情 */
    @Excel(name = "详情")
    private String recruitDetail;

    /** 员工 */
    @Excel(name = "员工")
    private Integer numberOfEmployees;

    /** 位置 */
    @Excel(name = "位置")
    private String geographicalPosition;

    /** 福利 */
    @Excel(name = "福利")
    private String detailTreatment;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setBackendFrond(String backendFrond) 
    {
        this.backendFrond = backendFrond;
    }

    public String getBackendFrond() 
    {
        return backendFrond;
    }
    public void setSalary(BigDecimal salary) 
    {
        this.salary = salary;
    }

    public BigDecimal getSalary() 
    {
        return salary;
    }
    public void setRecruitDetail(String recruitDetail) 
    {
        this.recruitDetail = recruitDetail;
    }

    public String getRecruitDetail() 
    {
        return recruitDetail;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) 
    {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() 
    {
        return numberOfEmployees;
    }
    public void setGeographicalPosition(String geographicalPosition) 
    {
        this.geographicalPosition = geographicalPosition;
    }

    public String getGeographicalPosition() 
    {
        return geographicalPosition;
    }
    public void setDetailTreatment(String detailTreatment) 
    {
        this.detailTreatment = detailTreatment;
    }

    public String getDetailTreatment() 
    {
        return detailTreatment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("industry", getIndustry())
            .append("backendFrond", getBackendFrond())
            .append("salary", getSalary())
            .append("recruitDetail", getRecruitDetail())
            .append("numberOfEmployees", getNumberOfEmployees())
            .append("geographicalPosition", getGeographicalPosition())
            .append("detailTreatment", getDetailTreatment())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
