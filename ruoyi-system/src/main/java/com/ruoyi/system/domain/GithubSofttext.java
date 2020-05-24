package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 软文对象 github_softtext
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public class GithubSofttext extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 软文id */
    private Long id;

    /** 软文名称 */
    @Excel(name = "软文名称")
    private String articleName;

    /** 软文的url */
    @Excel(name = "软文的url")
    private String articleUrl;

    /** 软文的关键字 */
    @Excel(name = "软文的关键字")
    private String articleKeywords;

    /** 软文详情 */
    @Excel(name = "软文详情")
    private String articleDesc;

    /** 软文广告类型 */
    @Excel(name = "软文广告类型")
    private String articleTypeName;

    /** 公众号名字 */
    @Excel(name = "公众号名字")
    private String noPublic;

    /** 软文发表时间 */
    @Excel(name = "软文发表时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

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
    public void setArticleName(String articleName) 
    {
        this.articleName = articleName;
    }

    public String getArticleName() 
    {
        return articleName;
    }
    public void setArticleUrl(String articleUrl) 
    {
        this.articleUrl = articleUrl;
    }

    public String getArticleUrl() 
    {
        return articleUrl;
    }
    public void setArticleKeywords(String articleKeywords) 
    {
        this.articleKeywords = articleKeywords;
    }

    public String getArticleKeywords() 
    {
        return articleKeywords;
    }
    public void setArticleDesc(String articleDesc) 
    {
        this.articleDesc = articleDesc;
    }

    public String getArticleDesc() 
    {
        return articleDesc;
    }
    public void setArticleTypeName(String articleTypeName) 
    {
        this.articleTypeName = articleTypeName;
    }

    public String getArticleTypeName() 
    {
        return articleTypeName;
    }
    public void setNoPublic(String noPublic) 
    {
        this.noPublic = noPublic;
    }

    public String getNoPublic() 
    {
        return noPublic;
    }
    public void setPublishTime(Date publishTime) 
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() 
    {
        return publishTime;
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
            .append("articleName", getArticleName())
            .append("articleUrl", getArticleUrl())
            .append("articleKeywords", getArticleKeywords())
            .append("articleDesc", getArticleDesc())
            .append("articleTypeName", getArticleTypeName())
            .append("noPublic", getNoPublic())
            .append("publishTime", getPublishTime())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
