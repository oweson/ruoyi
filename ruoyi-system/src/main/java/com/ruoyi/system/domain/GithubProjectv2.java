package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * github_v2项目对象 github_projectv2
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
public class GithubProjectv2 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目id */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 原先项目的url */
    @Excel(name = "原先项目的url")
    private String projectUrl;

    /** 项目的体积，单位MB */
    @Excel(name = "项目的体积，单位MB")
    private String projectSize;

    /** 项目的架构，如ssm,springcloud... */
    @Excel(name = "项目的架构，如ssm,springcloud...")
    private String projectFramework;

    /** star数量 */
    @Excel(name = "star数量")
    private Long projectStarNumber;

    /** 项目语言 */
    @Excel(name = "项目语言")
    private String projectLanguage;

    /** 项目数据库 */
    @Excel(name = "项目数据库")
    private String projectDb;

    /** 项目分类：ssm/boot/cloud */
    @Excel(name = "项目分类：ssm/boot/cloud")
    private String projectCategory;

    /** 前后端是否分离 */
    @Excel(name = "前后端是否分离")
    private Integer projectFrontEnd;

    /** 项目的更新频率，频繁，不频繁，等等 */
    @Excel(name = "项目的更新频率，频繁，不频繁，等等")
    private String projectUpdateRecent;

    /** 文档描述，上手程度 */
    @Excel(name = "文档描述，上手程度")
    private String projectPlay;

    /** 项目的诞生时间 */
    @Excel(name = "项目的诞生时间")
    private String projectBirthday;

    /** 项目描述 */
    @Excel(name = "项目描述")
    private String projectDesc;

    /** 最近数据更新时间 */
    @Excel(name = "最近数据更新时间", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setProjectUrl(String projectUrl) 
    {
        this.projectUrl = projectUrl;
    }

    public String getProjectUrl() 
    {
        return projectUrl;
    }
    public void setProjectSize(String projectSize) 
    {
        this.projectSize = projectSize;
    }

    public String getProjectSize() 
    {
        return projectSize;
    }
    public void setProjectFramework(String projectFramework) 
    {
        this.projectFramework = projectFramework;
    }

    public String getProjectFramework() 
    {
        return projectFramework;
    }
    public void setProjectStarNumber(Long projectStarNumber) 
    {
        this.projectStarNumber = projectStarNumber;
    }

    public Long getProjectStarNumber() 
    {
        return projectStarNumber;
    }
    public void setProjectLanguage(String projectLanguage) 
    {
        this.projectLanguage = projectLanguage;
    }

    public String getProjectLanguage() 
    {
        return projectLanguage;
    }
    public void setProjectDb(String projectDb) 
    {
        this.projectDb = projectDb;
    }

    public String getProjectDb() 
    {
        return projectDb;
    }
    public void setProjectCategory(String projectCategory) 
    {
        this.projectCategory = projectCategory;
    }

    public String getProjectCategory() 
    {
        return projectCategory;
    }
    public void setProjectFrontEnd(Integer projectFrontEnd) 
    {
        this.projectFrontEnd = projectFrontEnd;
    }

    public Integer getProjectFrontEnd() 
    {
        return projectFrontEnd;
    }
    public void setProjectUpdateRecent(String projectUpdateRecent) 
    {
        this.projectUpdateRecent = projectUpdateRecent;
    }

    public String getProjectUpdateRecent() 
    {
        return projectUpdateRecent;
    }
    public void setProjectPlay(String projectPlay) 
    {
        this.projectPlay = projectPlay;
    }

    public String getProjectPlay() 
    {
        return projectPlay;
    }
    public void setProjectBirthday(String projectBirthday) 
    {
        this.projectBirthday = projectBirthday;
    }

    public String getProjectBirthday() 
    {
        return projectBirthday;
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
            .append("projectUrl", getProjectUrl())
            .append("projectSize", getProjectSize())
            .append("projectFramework", getProjectFramework())
            .append("projectStarNumber", getProjectStarNumber())
            .append("projectLanguage", getProjectLanguage())
            .append("projectDb", getProjectDb())
            .append("projectCategory", getProjectCategory())
            .append("projectFrontEnd", getProjectFrontEnd())
            .append("projectUpdateRecent", getProjectUpdateRecent())
            .append("projectPlay", getProjectPlay())
            .append("projectBirthday", getProjectBirthday())
            .append("projectDesc", getProjectDesc())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
