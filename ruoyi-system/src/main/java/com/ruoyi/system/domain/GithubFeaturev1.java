package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * github特色技能描述对象 github_featurev1
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
public class GithubFeaturev1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 项目主键 */
    @Excel(name = "项目主键")
    private String projectId;

    /** 特色名字，如文件上传，工作流 */
    @Excel(name = "特色名字，如文件上传，工作流")
    private String featuresName;

    /** 项目的名字 */
    @Excel(name = "项目的名字")
    private String projectName;

    /** 特色技能的语言 */
    @Excel(name = "特色技能的语言")
    private String featuresLanuage;

    /** 前后端是否分离 */
    @Excel(name = "前后端是否分离")
    private Integer featuresFrontEnd;

    /** 评分：60,70,80,90,100 */
    @Excel(name = "评分：60,70,80,90,100")
    private Integer featuresScore;

    /** 特色的功能点所在的包和类名 */
    @Excel(name = "特色的功能点所在的包和类名")
    private String featuresPackage;

    /** 技能简要描述：特色的一个功能点，比如：导入导出做的不错 */
    @Excel(name = "技能简要描述：特色的一个功能点，比如：导入导出做的不错")
    private String featuresBrief;

    /** 功能点详细描述 */
    @Excel(name = "功能点详细描述")
    private String featuresDesc;

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
    public void setProjectId(String projectId) 
    {
        this.projectId = projectId;
    }

    public String getProjectId() 
    {
        return projectId;
    }
    public void setFeaturesName(String featuresName) 
    {
        this.featuresName = featuresName;
    }

    public String getFeaturesName() 
    {
        return featuresName;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setFeaturesLanuage(String featuresLanuage) 
    {
        this.featuresLanuage = featuresLanuage;
    }

    public String getFeaturesLanuage() 
    {
        return featuresLanuage;
    }
    public void setFeaturesFrontEnd(Integer featuresFrontEnd) 
    {
        this.featuresFrontEnd = featuresFrontEnd;
    }

    public Integer getFeaturesFrontEnd() 
    {
        return featuresFrontEnd;
    }
    public void setFeaturesScore(Integer featuresScore) 
    {
        this.featuresScore = featuresScore;
    }

    public Integer getFeaturesScore() 
    {
        return featuresScore;
    }
    public void setFeaturesPackage(String featuresPackage) 
    {
        this.featuresPackage = featuresPackage;
    }

    public String getFeaturesPackage() 
    {
        return featuresPackage;
    }
    public void setFeaturesBrief(String featuresBrief) 
    {
        this.featuresBrief = featuresBrief;
    }

    public String getFeaturesBrief() 
    {
        return featuresBrief;
    }
    public void setFeaturesDesc(String featuresDesc) 
    {
        this.featuresDesc = featuresDesc;
    }

    public String getFeaturesDesc() 
    {
        return featuresDesc;
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
            .append("projectId", getProjectId())
            .append("featuresName", getFeaturesName())
            .append("projectName", getProjectName())
            .append("featuresLanuage", getFeaturesLanuage())
            .append("featuresFrontEnd", getFeaturesFrontEnd())
            .append("featuresScore", getFeaturesScore())
            .append("featuresPackage", getFeaturesPackage())
            .append("featuresBrief", getFeaturesBrief())
            .append("featuresDesc", getFeaturesDesc())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
