package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 优秀公司关注对象 best_business
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public class BestBusiness extends BaseEntity
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

    /** 楼层 */
    @Excel(name = "楼层")
    private Integer floor;

    /** 岗位要求 */
    @Excel(name = "岗位要求")
    private String requirement;

    /** 是否下架 */
    @Excel(name = "是否下架")
    private String isUp;

    /** 是否面试 */
    @Excel(name = "是否面试")
    private String isInterview;

    /** 是否通过 */
    @Excel(name = "是否通过")
    private String isPath;

    /** 排序字段 */
    @Excel(name = "排序字段")
    private Integer priority;

    /** 通过筛选 */
    @Excel(name = "通过筛选")
    private String resumePass;

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
    public void setFloor(Integer floor) 
    {
        this.floor = floor;
    }

    public Integer getFloor() 
    {
        return floor;
    }
    public void setRequirement(String requirement) 
    {
        this.requirement = requirement;
    }

    public String getRequirement() 
    {
        return requirement;
    }
    public void setIsUp(String isUp) 
    {
        this.isUp = isUp;
    }

    public String getIsUp() 
    {
        return isUp;
    }
    public void setIsInterview(String isInterview) 
    {
        this.isInterview = isInterview;
    }

    public String getIsInterview() 
    {
        return isInterview;
    }
    public void setIsPath(String isPath) 
    {
        this.isPath = isPath;
    }

    public String getIsPath() 
    {
        return isPath;
    }
    public void setPriority(Integer priority) 
    {
        this.priority = priority;
    }

    public Integer getPriority() 
    {
        return priority;
    }
    public void setResumePass(String resumePass) 
    {
        this.resumePass = resumePass;
    }

    public String getResumePass() 
    {
        return resumePass;
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
            .append("floor", getFloor())
            .append("requirement", getRequirement())
            .append("isUp", getIsUp())
            .append("isInterview", getIsInterview())
            .append("isPath", getIsPath())
            .append("priority", getPriority())
            .append("resumePass", getResumePass())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
