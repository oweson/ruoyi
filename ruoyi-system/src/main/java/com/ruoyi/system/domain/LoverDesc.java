package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 求偶标准对象 lover_desc
 * 
 * @author ruoyi
 * @date 2020-04-04
 */
public class LoverDesc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 爱人标准id */
    private Long id;

    /** 对象的姓名 */
    @Excel(name = "对象的姓名")
    private String loverName;

    /** 对象的年龄 */
    @Excel(name = "对象的年龄")
    private Long loverAge;

    /** 对象的提升KG */
    @Excel(name = "对象的提升KG")
    private Long loveWeight;

    /** 对象的秀发... */
    @Excel(name = "对象的秀发...")
    private String loverHair;

    /** 对象的描述 */
    @Excel(name = "对象的描述")
    private String loverDesc;

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
    public void setLoverName(String loverName) 
    {
        this.loverName = loverName;
    }

    public String getLoverName() 
    {
        return loverName;
    }
    public void setLoverAge(Long loverAge) 
    {
        this.loverAge = loverAge;
    }

    public Long getLoverAge() 
    {
        return loverAge;
    }
    public void setLoveWeight(Long loveWeight) 
    {
        this.loveWeight = loveWeight;
    }

    public Long getLoveWeight() 
    {
        return loveWeight;
    }
    public void setLoverHair(String loverHair) 
    {
        this.loverHair = loverHair;
    }

    public String getLoverHair() 
    {
        return loverHair;
    }
    public void setLoverDesc(String loverDesc) 
    {
        this.loverDesc = loverDesc;
    }

    public String getLoverDesc() 
    {
        return loverDesc;
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
            .append("loverName", getLoverName())
            .append("loverAge", getLoverAge())
            .append("loveWeight", getLoveWeight())
            .append("loverHair", getLoverHair())
            .append("loverDesc", getLoverDesc())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
