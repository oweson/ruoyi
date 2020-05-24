package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 并发测试线程安全火车票测试对象 thread_train_ticket
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public class ThreadTrainTicket extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 火车票，高铁 */
    @Excel(name = "火车票，高铁")
    private String ticketType;

    /** 高铁票数量 */
    @Excel(name = "高铁票数量")
    private Long ticketNumber;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTicketType(String ticketType) 
    {
        this.ticketType = ticketType;
    }

    public String getTicketType() 
    {
        return ticketType;
    }
    public void setTicketNumber(Long ticketNumber) 
    {
        this.ticketNumber = ticketNumber;
    }

    public Long getTicketNumber() 
    {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ticketType", getTicketType())
            .append("ticketNumber", getTicketNumber())
            .toString();
    }
}
