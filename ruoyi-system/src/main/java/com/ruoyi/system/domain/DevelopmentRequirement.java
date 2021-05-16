package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 计划需求对象 development_requirement
 * 
 * @author ruoyi
 * @date 2021-05-16
 */
public class DevelopmentRequirement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long id;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 级别 */
    @Excel(name = "级别")
    private String level;

    /** 删除标识 */
    private String isDelete;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 创建者id */
    private Long createId;

    /** 更新者id */
    private Long updateId;

    /** 完成状态 */
    @Excel(name = "完成状态")
    private String completionStatus;

    /** 耗时 */
    @Excel(name = "耗时")
    private Integer consumeTime;

    /** 期限 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "期限", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastTime;

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
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setIsDelete(String isDelete) 
    {
        this.isDelete = isDelete;
    }

    public String getIsDelete() 
    {
        return isDelete;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setCreateId(Long createId) 
    {
        this.createId = createId;
    }

    public Long getCreateId() 
    {
        return createId;
    }
    public void setUpdateId(Long updateId) 
    {
        this.updateId = updateId;
    }

    public Long getUpdateId() 
    {
        return updateId;
    }
    public void setCompletionStatus(String completionStatus) 
    {
        this.completionStatus = completionStatus;
    }

    public String getCompletionStatus() 
    {
        return completionStatus;
    }
    public void setConsumeTime(Integer consumeTime) 
    {
        this.consumeTime = consumeTime;
    }

    public Integer getConsumeTime() 
    {
        return consumeTime;
    }
    public void setLastTime(Date lastTime) 
    {
        this.lastTime = lastTime;
    }

    public Date getLastTime() 
    {
        return lastTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("content", getContent())
            .append("type", getType())
            .append("level", getLevel())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .append("status", getStatus())
            .append("version", getVersion())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("createId", getCreateId())
            .append("updateId", getUpdateId())
            .append("completionStatus", getCompletionStatus())
            .append("consumeTime", getConsumeTime())
            .append("lastTime", getLastTime())
            .toString();
    }
}
