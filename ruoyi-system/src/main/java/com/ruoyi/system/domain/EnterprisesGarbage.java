package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 垃圾公司对象 enterprises_garbage
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public class EnterprisesGarbage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 公司 */
    @Excel(name = "公司")
    private String companyName;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 简介 */
    @Excel(name = "简介")
    private String introduction;

    /** 原因 */
    @Excel(name = "原因")
    private String reason;

    /** 成立时间 */
    @Excel(name = "成立时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date timeOfEstablishment;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setIntroduction(String introduction) 
    {
        this.introduction = introduction;
    }

    public String getIntroduction() 
    {
        return introduction;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setTimeOfEstablishment(Date timeOfEstablishment) 
    {
        this.timeOfEstablishment = timeOfEstablishment;
    }

    public Date getTimeOfEstablishment() 
    {
        return timeOfEstablishment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyName", getCompanyName())
            .append("type", getType())
            .append("introduction", getIntroduction())
            .append("reason", getReason())
            .append("timeOfEstablishment", getTimeOfEstablishment())
            .toString();
    }
}
