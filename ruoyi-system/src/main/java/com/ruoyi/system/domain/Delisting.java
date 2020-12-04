package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 恋爱之路对象 delisting
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
public class Delisting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 来源 */
    @Excel(name = "来源")
    private String source;

    /** 耗费时长 */
    @Excel(name = "耗费时长")
    private Long timeConsume;

    /** 聊天内容 */
    @Excel(name = "聊天内容")
    private String charMessage;

    /** 不足 */
    @Excel(name = "不足")
    private String lack;

    /** 改进 */
    @Excel(name = "改进")
    private String improvement;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }
    public void setTimeConsume(Long timeConsume) 
    {
        this.timeConsume = timeConsume;
    }

    public Long getTimeConsume() 
    {
        return timeConsume;
    }
    public void setCharMessage(String charMessage) 
    {
        this.charMessage = charMessage;
    }

    public String getCharMessage() 
    {
        return charMessage;
    }
    public void setLack(String lack) 
    {
        this.lack = lack;
    }

    public String getLack() 
    {
        return lack;
    }
    public void setImprovement(String improvement) 
    {
        this.improvement = improvement;
    }

    public String getImprovement() 
    {
        return improvement;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("source", getSource())
            .append("timeConsume", getTimeConsume())
            .append("remark", getRemark())
            .append("charMessage", getCharMessage())
            .append("lack", getLack())
            .append("improvement", getImprovement())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
