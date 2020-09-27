package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * shijing对象 shijing
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
public class Shijing extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 章 */
    @Excel(name = "章")
    private String chapter;

    /** 节 */
    @Excel(name = "节")
    private String section;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setChapter(String chapter) 
    {
        this.chapter = chapter;
    }

    public String getChapter() 
    {
        return chapter;
    }
    public void setSection(String section) 
    {
        this.section = section;
    }

    public String getSection() 
    {
        return section;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("title", getTitle())
            .append("chapter", getChapter())
            .append("section", getSection())
            .append("content", getContent())
            .toString();
    }
}
