package com.ruoyi.web.controller.mq.consumer;

import java.io.Serializable;

/**
 * @author oweson
 * @date 2021/5/9 15:33
 */


public class Order implements Serializable {

    private Integer id;
    private  Integer orderStatus;
    private String buyer;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
