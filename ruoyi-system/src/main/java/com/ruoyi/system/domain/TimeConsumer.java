package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 时间管理对象 time_consumer
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public class TimeConsumer extends TreeEntity
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

    /** 分钟 */
    @Excel(name = "分钟")
    private Integer timeConsume;

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
    public void setTimeConsume(Integer timeConsume) 
    {
        this.timeConsume = timeConsume;
    }

    public Integer getTimeConsume() 
    {
        return timeConsume;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("timeConsume", getTimeConsume())
            .append("parentId", getParentId())
            .toString();
    }
}
