package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生活日常消费对象 life_buy
 * 
 * @author ruoyi
 * @date 2020-02-17
 */
public class LifeBuy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目id */
    private Long id;

    /** 消费地点 */
    @Excel(name = "消费地点")
    private String lifePlace;

    /** 消费分类，如交通，水果，旅游... */
    @Excel(name = "消费分类，如交通，水果，旅游...")
    private String lifeType;

    /** 消费的金额 */
    @Excel(name = "消费的金额")
    private Double lifeMoney;

    /** 消费名字 */
    @Excel(name = "消费名字")
    private String lifeName;

    /** 年月日编号 */
    @Excel(name = "年月日编号")
    private String lifeCode;

    /** 消费备注 */
    @Excel(name = "消费备注")
    private String lifeDesc;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLifePlace(String lifePlace) 
    {
        this.lifePlace = lifePlace;
    }

    public String getLifePlace() 
    {
        return lifePlace;
    }
    public void setLifeType(String lifeType) 
    {
        this.lifeType = lifeType;
    }

    public String getLifeType() 
    {
        return lifeType;
    }
    public void setLifeMoney(Double lifeMoney) 
    {
        this.lifeMoney = lifeMoney;
    }

    public Double getLifeMoney() 
    {
        return lifeMoney;
    }
    public void setLifeName(String lifeName) 
    {
        this.lifeName = lifeName;
    }

    public String getLifeName() 
    {
        return lifeName;
    }
    public void setLifeCode(String lifeCode) 
    {
        this.lifeCode = lifeCode;
    }

    public String getLifeCode() 
    {
        return lifeCode;
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
            .append("lifePlace", getLifePlace())
            .append("lifeType", getLifeType())
            .append("lifeMoney", getLifeMoney())
            .append("lifeName", getLifeName())
            .append("lifeCode", getLifeCode())
            .append("createTime", getCreateTime())
            .append("lifeDesc", getLifeDesc())
            .toString();
    }
}
