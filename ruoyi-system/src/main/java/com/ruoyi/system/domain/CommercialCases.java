package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商业分析对象 commercial_cases
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public class CommercialCases extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 时间 */
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 公司 */
    @Excel(name = "公司")
    private String companyName;

    /** 特色 */
    @Excel(name = "特色")
    private String feature;

    /** 成功 */
    @Excel(name = "成功")
    private String isSuccess;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

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
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setFeature(String feature) 
    {
        this.feature = feature;
    }

    public String getFeature() 
    {
        return feature;
    }
    public void setIsSuccess(String isSuccess) 
    {
        this.isSuccess = isSuccess;
    }

    public String getIsSuccess() 
    {
        return isSuccess;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("date", getDate())
            .append("companyName", getCompanyName())
            .append("feature", getFeature())
            .append("isSuccess", getIsSuccess())
            .append("remark", getRemark())
            .append("content", getContent())
            .append("type", getType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
