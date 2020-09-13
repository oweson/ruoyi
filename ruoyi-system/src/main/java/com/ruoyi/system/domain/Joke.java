package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 段子对象 joke
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
public class Joke extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String jokeName;

    /** 内容 */
    @Excel(name = "内容")
    private String jokeContent;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setJokeName(String jokeName) 
    {
        this.jokeName = jokeName;
    }

    public String getJokeName() 
    {
        return jokeName;
    }
    public void setJokeContent(String jokeContent) 
    {
        this.jokeContent = jokeContent;
    }

    public String getJokeContent() 
    {
        return jokeContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("jokeName", getJokeName())
            .append("jokeContent", getJokeContent())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
