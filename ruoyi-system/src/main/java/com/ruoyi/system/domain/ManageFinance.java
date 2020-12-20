package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.springframework.data.annotation.Transient;

/**
 * 消费管理对象 manage_finance
 *
 * @author ruoyi
 * @date 2020-12-04
 */
public class ManageFinance extends BaseEntity {
    /**
     * 总金额
     */
    @Transient
    private Double totalMoney;
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 标题
     */
    @Excel(name = "标题")
    private String title;

    /**
     * 城市
     */
    @Excel(name = "城市")
    private String city;

    /**
     * 金额
     */
    @Excel(name = "金额")
    private Double money;

    /**
     * 支付类型
     */
    @Excel(name = "支付类型")
    private String payType;

    /**
     * 分类
     */
    @Excel(name = "分类")
    private String detaltype;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return payType;
    }

    public void setDetaltype(String detaltype) {
        this.detaltype = detaltype;
    }

    public String getDetaltype() {
        return detaltype;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("title", getTitle())
                .append("city", getCity())
                .append("remark", getRemark())
                .append("money", getMoney())
                .append("payType", getPayType())
                .append("detaltype", getDetaltype())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
