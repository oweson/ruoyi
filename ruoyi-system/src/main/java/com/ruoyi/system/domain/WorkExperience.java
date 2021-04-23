package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工作经历对象 work_experience
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
public class WorkExperience extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long id;

    /** 公司 */
    @Excel(name = "公司")
    private String companyName;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 删除 */
    private String isDeleted;

    /** 城市 */
    @Excel(name = "城市")
    private String workCity;

    /** 任职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 离岗时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离岗时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 离开的原因 */
    @Excel(name = "离开的原因")
    private String leaveReason;

    /** 行业 */
    @Excel(name = "行业")
    private String industyType;

    /** 薪水 */
    @Excel(name = "薪水")
    private BigDecimal salary;

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
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setIsDeleted(String isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public String getIsDeleted() 
    {
        return isDeleted;
    }
    public void setWorkCity(String workCity) 
    {
        this.workCity = workCity;
    }

    public String getWorkCity() 
    {
        return workCity;
    }
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setLeaveReason(String leaveReason) 
    {
        this.leaveReason = leaveReason;
    }

    public String getLeaveReason() 
    {
        return leaveReason;
    }
    public void setIndustyType(String industyType) 
    {
        this.industyType = industyType;
    }

    public String getIndustyType() 
    {
        return industyType;
    }
    public void setSalary(BigDecimal salary) 
    {
        this.salary = salary;
    }

    public BigDecimal getSalary() 
    {
        return salary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyName", getCompanyName())
            .append("status", getStatus())
            .append("isDeleted", getIsDeleted())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("workCity", getWorkCity())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("leaveReason", getLeaveReason())
            .append("industyType", getIndustyType())
            .append("salary", getSalary())
            .toString();
    }
}
