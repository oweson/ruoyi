package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 面试问题对象 interview_questions
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public class InterviewQuestions extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 问题 */
    @Excel(name = "问题")
    private String queston;

    /** 公司 */
    @Excel(name = "公司")
    private String companyName;

    /** 日期 */
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

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
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setQueston(String queston) 
    {
        this.queston = queston;
    }

    public String getQueston() 
    {
        return queston;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
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
            .append("type", getType())
            .append("queston", getQueston())
            .append("companyName", getCompanyName())
            .append("date", getDate())
            .append("solution", getSolution())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
