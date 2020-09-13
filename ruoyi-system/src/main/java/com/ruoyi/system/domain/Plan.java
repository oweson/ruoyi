package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 计划详情对象 plan
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public class Plan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 详情 */
    @Excel(name = "详情")
    private String detail;

    /** 耗费时间 */
    @Excel(name = "耗费时间")
    private Long planTime;

    /** 是否完成 */
    @Excel(name = "是否完成")
    private String isDone;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 最后期限 */
    @Excel(name = "最后期限", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deadlineTime;

    /** 进展详情 */
    @Excel(name = "进展详情")
    private String remarkRecord;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setPlanTime(Long planTime) 
    {
        this.planTime = planTime;
    }

    public Long getPlanTime() 
    {
        return planTime;
    }
    public void setIsDone(String isDone) 
    {
        this.isDone = isDone;
    }

    public String getIsDone() 
    {
        return isDone;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setDeadlineTime(Date deadlineTime) 
    {
        this.deadlineTime = deadlineTime;
    }

    public Date getDeadlineTime() 
    {
        return deadlineTime;
    }
    public void setRemarkRecord(String remarkRecord) 
    {
        this.remarkRecord = remarkRecord;
    }

    public String getRemarkRecord() 
    {
        return remarkRecord;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("detail", getDetail())
            .append("planTime", getPlanTime())
            .append("isDone", getIsDone())
            .append("type", getType())
            .append("deadlineTime", getDeadlineTime())
            .append("remarkRecord", getRemarkRecord())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
