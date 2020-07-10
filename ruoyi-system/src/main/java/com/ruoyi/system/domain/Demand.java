package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 需求对象 demand
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
public class Demand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 需求名称 */
    @Excel(name = "需求名称")
    private String demand;

    /** 需求详情 */
    @Excel(name = "需求详情")
    private String demandDesc;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUpdateTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDemand(String demand) 
    {
        this.demand = demand;
    }

    public String getDemand() 
    {
        return demand;
    }
    public void setDemandDesc(String demandDesc) 
    {
        this.demandDesc = demandDesc;
    }

    public String getDemandDesc() 
    {
        return demandDesc;
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
            .append("demand", getDemand())
            .append("demandDesc", getDemandDesc())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .toString();
    }
}
