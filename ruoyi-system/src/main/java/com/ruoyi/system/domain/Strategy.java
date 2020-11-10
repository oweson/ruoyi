package com.ruoyi.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收藏对象 strategy
 *
 * @author ruoyi
 * @date 2020-08-28
 */
public class Strategy extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 名字
     */
    @Excel(name = "名字")
    private String name;

    /**
     * 介绍
     */
    @Excel(name = "介绍")
    private String introduce;
    /**
     * 权重
     */
    @Excel(name = "权重")
    private Integer weight;

    /**
     * 关键词
     */
    @Excel(name = "关键词")
    private String keyWorld;

    /**
     * 地址
     */
    @Excel(name = "地址")
    private String urlAddress;

    /**
     * 评价
     */
    @Excel(name = "评价")
    private String comment;

    /**
     * 细分领域
     */
    @Excel(name = "细分领域")
    private String subdivisionArea;

    /**
     * 前端
     */
    @Excel(name = "前端")
    private String front;

    /**
     * 前后端
     */
    @Excel(name = "前后端")
    private String together;

    /**
     * 分类
     */
    @Excel(name = "分类")
    private String category;

    /**
     * 来源
     */
    @Excel(name = "来源")
    private String source;

    /**
     * 语言
     */
    @Excel(name = "语言")
    private String language;

    /**
     * star数量
     */
    @Excel(name = "star数量")
    private Integer startNumber;

    /**
     * 最近数据更新时间
     */
    @Excel(name = "最近数据更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUpdateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setKeyWorld(String keyWorld) {
        this.keyWorld = keyWorld;
    }

    public String getKeyWorld() {
        return keyWorld;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }

    public String getUrlAddress() {
        return urlAddress;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setSubdivisionArea(String subdivisionArea) {
        this.subdivisionArea = subdivisionArea;
    }

    public String getSubdivisionArea() {
        return subdivisionArea;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getFront() {
        return front;
    }

    public void setTogether(String together) {
        this.together = together;
    }

    public String getTogether() {
        return together;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public Integer getStartNumber() {
        return startNumber;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("introduce", getIntroduce())
                .append("keyWorld", getKeyWorld())
                .append("urlAddress", getUrlAddress())
                .append("comment", getComment())
                .append("subdivisionArea", getSubdivisionArea())
                .append("front", getFront())
                .append("together", getTogether())
                .append("category", getCategory())
                .append("source", getSource())
                .append("language", getLanguage())
                .append("startNumber", getStartNumber())
                .append("createTime", getCreateTime())
                .append("lastUpdateTime", getLastUpdateTime())
                .toString();
    }
}
