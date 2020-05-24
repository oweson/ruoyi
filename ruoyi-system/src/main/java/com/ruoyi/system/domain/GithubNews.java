package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 新闻对象 github_news
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public class GithubNews extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 新闻id */
    private Long id;

    /** 新闻标题 */
    @Excel(name = "新闻标题")
    private String newsName;

    /** 新闻的url */
    @Excel(name = "新闻的url")
    private String newsUrl;

    /** 新闻的关键字 */
    @Excel(name = "新闻的关键字")
    private String newsKeywords;

    /** 新闻详情扼要 */
    @Excel(name = "新闻详情扼要")
    private String newsDesc;

    /** 新闻类型 */
    @Excel(name = "新闻类型")
    private String newsTypeName;

    /** 新闻概述 */
    @Excel(name = "新闻概述")
    private String newsCore;

    /** 新闻发表时间 */
    @Excel(name = "新闻发表时间", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setNewsName(String newsName) 
    {
        this.newsName = newsName;
    }

    public String getNewsName() 
    {
        return newsName;
    }
    public void setNewsUrl(String newsUrl) 
    {
        this.newsUrl = newsUrl;
    }

    public String getNewsUrl() 
    {
        return newsUrl;
    }
    public void setNewsKeywords(String newsKeywords) 
    {
        this.newsKeywords = newsKeywords;
    }

    public String getNewsKeywords() 
    {
        return newsKeywords;
    }
    public void setNewsDesc(String newsDesc) 
    {
        this.newsDesc = newsDesc;
    }

    public String getNewsDesc() 
    {
        return newsDesc;
    }
    public void setNewsTypeName(String newsTypeName) 
    {
        this.newsTypeName = newsTypeName;
    }

    public String getNewsTypeName() 
    {
        return newsTypeName;
    }
    public void setNewsCore(String newsCore) 
    {
        this.newsCore = newsCore;
    }

    public String getNewsCore() 
    {
        return newsCore;
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
            .append("newsName", getNewsName())
            .append("newsUrl", getNewsUrl())
            .append("newsKeywords", getNewsKeywords())
            .append("newsDesc", getNewsDesc())
            .append("newsTypeName", getNewsTypeName())
            .append("newsCore", getNewsCore())
            .append("publishTime", getPublishTime())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
