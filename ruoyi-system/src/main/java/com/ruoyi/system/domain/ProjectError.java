package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目中遇到的错误详情记录对象 project_error
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
public class ProjectError extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 错误名称 */
    @Excel(name = "错误名称")
    private String errorName;

    /** 错误详情 */
    @Excel(name = "错误详情")
    private String errorDesc;

    /** 属于的项目，（1，happymall 2 vhr） */
    @Excel(name = "属于的项目，", readConverterExp = "1=，happymall,2=,v=hr")
    private String errorProjectBelong;

    /** 错误的来源项目（1:github） */
    @Excel(name = "错误的来源项目", readConverterExp = "1=:github")
    private String errorProject;

    /** 错误的解决方案 */
    @Excel(name = "错误的解决方案")
    private String errorResolve;

    /** 错误的详细类型（1:mybatis，2：spring） */
    @Excel(name = "错误的详细类型", readConverterExp = "1=:mybatis，2：spring")
    private String errorType;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUpdateTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setErrorName(String errorName) 
    {
        this.errorName = errorName;
    }

    public String getErrorName() 
    {
        return errorName;
    }
    public void setErrorDesc(String errorDesc) 
    {
        this.errorDesc = errorDesc;
    }

    public String getErrorDesc() 
    {
        return errorDesc;
    }
    public void setErrorProjectBelong(String errorProjectBelong) 
    {
        this.errorProjectBelong = errorProjectBelong;
    }

    public String getErrorProjectBelong() 
    {
        return errorProjectBelong;
    }
    public void setErrorProject(String errorProject) 
    {
        this.errorProject = errorProject;
    }

    public String getErrorProject() 
    {
        return errorProject;
    }
    public void setErrorResolve(String errorResolve) 
    {
        this.errorResolve = errorResolve;
    }

    public String getErrorResolve() 
    {
        return errorResolve;
    }
    public void setErrorType(String errorType) 
    {
        this.errorType = errorType;
    }

    public String getErrorType() 
    {
        return errorType;
    }
    public void setLastUpdateTime(Date lastUpdateTime) 
    {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastUpdateTime() 
    {
        return lastUpdateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("errorName", getErrorName())
            .append("errorDesc", getErrorDesc())
            .append("errorProjectBelong", getErrorProjectBelong())
            .append("errorProject", getErrorProject())
            .append("errorResolve", getErrorResolve())
            .append("errorType", getErrorType())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
