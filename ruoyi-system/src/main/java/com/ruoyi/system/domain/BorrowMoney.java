package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * borrow_money对象 borrow_money
 * 
 * @author ruoyi
 * @date 2020-11-23
 */
public class BorrowMoney extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 借款人 */
    @Excel(name = "借款人")
    private String name;

    /** 原因 */
    @Excel(name = "原因")
    private String reason;

    /** 借款时间 */
    @Excel(name = "借款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date borrowTime;

    /** 还款时间 */
    @Excel(name = "还款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date returnTime;

    /** 金额 */
    @Excel(name = "金额")
    private Long money;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 剩余 */
    @Excel(name = "剩余")
    private Long surplus;

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
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setBorrowTime(Date borrowTime) 
    {
        this.borrowTime = borrowTime;
    }

    public Date getBorrowTime() 
    {
        return borrowTime;
    }
    public void setReturnTime(Date returnTime) 
    {
        this.returnTime = returnTime;
    }

    public Date getReturnTime() 
    {
        return returnTime;
    }
    public void setMoney(Long money) 
    {
        this.money = money;
    }

    public Long getMoney() 
    {
        return money;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setSurplus(Long surplus) 
    {
        this.surplus = surplus;
    }

    public Long getSurplus() 
    {
        return surplus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("reason", getReason())
            .append("borrowTime", getBorrowTime())
            .append("returnTime", getReturnTime())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("money", getMoney())
            .append("type", getType())
            .append("surplus", getSurplus())
            .toString();
    }
}
