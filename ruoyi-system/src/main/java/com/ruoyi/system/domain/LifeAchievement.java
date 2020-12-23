package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 每天成就对象 life_achievement
 * 
 * @author ruoyi
 * @date 2020-12-22
 */
public class LifeAchievement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 心情 */
    @Excel(name = "心情")
    private String lifeHeart;

    /** 今日的突破 */
    @Excel(name = "今日的突破")
    private String lifeBreakthrough;

    /** 分类 */
    @Excel(name = "分类")
    private String lifeType;

    /** 明天要做的事情 */
    @Excel(name = "明天要做的事情")
    private String lifeTodo;

    /** 未完成的事情 */
    @Excel(name = "未完成的事情")
    private String lifeUndone;

    /** 备注 */
    @Excel(name = "备注")
    private String lifeDesc;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLifeHeart(String lifeHeart) 
    {
        this.lifeHeart = lifeHeart;
    }

    public String getLifeHeart() 
    {
        return lifeHeart;
    }
    public void setLifeBreakthrough(String lifeBreakthrough) 
    {
        this.lifeBreakthrough = lifeBreakthrough;
    }

    public String getLifeBreakthrough() 
    {
        return lifeBreakthrough;
    }
    public void setLifeType(String lifeType) 
    {
        this.lifeType = lifeType;
    }

    public String getLifeType() 
    {
        return lifeType;
    }
    public void setLifeTodo(String lifeTodo) 
    {
        this.lifeTodo = lifeTodo;
    }

    public String getLifeTodo() 
    {
        return lifeTodo;
    }
    public void setLifeUndone(String lifeUndone) 
    {
        this.lifeUndone = lifeUndone;
    }

    public String getLifeUndone() 
    {
        return lifeUndone;
    }
    public void setLifeDesc(String lifeDesc) 
    {
        this.lifeDesc = lifeDesc;
    }

    public String getLifeDesc() 
    {
        return lifeDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("lifeHeart", getLifeHeart())
            .append("lifeBreakthrough", getLifeBreakthrough())
            .append("lifeType", getLifeType())
            .append("lifeTodo", getLifeTodo())
            .append("lifeUndone", getLifeUndone())
            .append("createTime", getCreateTime())
            .append("lifeDesc", getLifeDesc())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
