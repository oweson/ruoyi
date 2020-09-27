package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * bug记录对象 bug
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public class Bug extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 来源 */
    @Excel(name = "来源")
    private String source;

    /** 耗费时间 */
    @Excel(name = "耗费时间")
    private Integer timeConsume;

    /** 原因 */
    @Excel(name = "原因")
    private String reason;

    /** 方案 */
    @Excel(name = "方案")
    private String solution;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }
    public void setTimeConsume(Integer timeConsume) 
    {
        this.timeConsume = timeConsume;
    }

    public Integer getTimeConsume() 
    {
        return timeConsume;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setSolution(String solution) 
    {
        this.solution = solution;
    }

    public String getSolution() 
    {
        return solution;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("source", getSource())
            .append("timeConsume", getTimeConsume())
            .append("reason", getReason())
            .append("solution", getSolution())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
