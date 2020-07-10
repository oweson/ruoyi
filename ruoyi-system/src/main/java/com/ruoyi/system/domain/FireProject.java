package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 拥有的项目能力对象 fire_project
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
public class FireProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 项目类型（1:ssm） */
    @Excel(name = "项目类型", readConverterExp = "1=:ssm")
    private String projectType;

    /** 项目来源（1:github） */
    @Excel(name = "项目来源", readConverterExp = "1=:github")
    private String projectFrom;

    /** 项目地址 */
    @Excel(name = "项目地址")
    private String projectUrl;

    /** 项目精华 */
    @Excel(name = "项目精华")
    private String projectCore;

    /** 项目详情介绍 */
    @Excel(name = "项目详情介绍")
    private String projectDesc;

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
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setProjectType(String projectType) 
    {
        this.projectType = projectType;
    }

    public String getProjectType() 
    {
        return projectType;
    }
    public void setProjectFrom(String projectFrom) 
    {
        this.projectFrom = projectFrom;
    }

    public String getProjectFrom() 
    {
        return projectFrom;
    }
    public void setProjectUrl(String projectUrl) 
    {
        this.projectUrl = projectUrl;
    }

    public String getProjectUrl() 
    {
        return projectUrl;
    }
    public void setProjectCore(String projectCore) 
    {
        this.projectCore = projectCore;
    }

    public String getProjectCore() 
    {
        return projectCore;
    }
    public void setProjectDesc(String projectDesc) 
    {
        this.projectDesc = projectDesc;
    }

    public String getProjectDesc() 
    {
        return projectDesc;
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
            .append("projectName", getProjectName())
            .append("projectType", getProjectType())
            .append("projectFrom", getProjectFrom())
            .append("projectUrl", getProjectUrl())
            .append("projectCore", getProjectCore())
            .append("projectDesc", getProjectDesc())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
