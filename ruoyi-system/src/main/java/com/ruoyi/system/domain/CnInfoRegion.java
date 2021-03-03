package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 中国地区信息对象 cn_info_region
 * 
 * @author ruoyi
 * @date 2021-01-26
 */
public class CnInfoRegion extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增ID */
    private Long criId;

    /** 代码 */
    @Excel(name = "代码")
    private String criCode;

    /** 名称 */
    @Excel(name = "名称")
    private String criName;

    /** 简称 */
    @Excel(name = "简称")
    private String criShortName;

    /** 上级代码 */
    @Excel(name = "上级代码")
    private String criSuperiorCode;

    /** 经度 */
    @Excel(name = "经度")
    private String criLng;

    /** 纬度 */
    @Excel(name = "纬度")
    private String criLat;

    /** 排序 */
    @Excel(name = "排序")
    private Integer criSort;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date criGmtCreate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date criGmtModified;

    /** 备注 */
    @Excel(name = "备注")
    private String criMemo;

    /** 状态 */
    @Excel(name = "状态")
    private Long criDataState;

    /** 租户ID */
    private String criTenantCode;

    /** 级别 */
    @Excel(name = "级别")
    private String criLevel;

    public void setCriId(Long criId) 
    {
        this.criId = criId;
    }

    public Long getCriId() 
    {
        return criId;
    }
    public void setCriCode(String criCode) 
    {
        this.criCode = criCode;
    }

    public String getCriCode() 
    {
        return criCode;
    }
    public void setCriName(String criName) 
    {
        this.criName = criName;
    }

    public String getCriName() 
    {
        return criName;
    }
    public void setCriShortName(String criShortName) 
    {
        this.criShortName = criShortName;
    }

    public String getCriShortName() 
    {
        return criShortName;
    }
    public void setCriSuperiorCode(String criSuperiorCode) 
    {
        this.criSuperiorCode = criSuperiorCode;
    }

    public String getCriSuperiorCode() 
    {
        return criSuperiorCode;
    }
    public void setCriLng(String criLng) 
    {
        this.criLng = criLng;
    }

    public String getCriLng() 
    {
        return criLng;
    }
    public void setCriLat(String criLat) 
    {
        this.criLat = criLat;
    }

    public String getCriLat() 
    {
        return criLat;
    }
    public void setCriSort(Integer criSort) 
    {
        this.criSort = criSort;
    }

    public Integer getCriSort() 
    {
        return criSort;
    }
    public void setCriGmtCreate(Date criGmtCreate) 
    {
        this.criGmtCreate = criGmtCreate;
    }

    public Date getCriGmtCreate() 
    {
        return criGmtCreate;
    }
    public void setCriGmtModified(Date criGmtModified) 
    {
        this.criGmtModified = criGmtModified;
    }

    public Date getCriGmtModified() 
    {
        return criGmtModified;
    }
    public void setCriMemo(String criMemo) 
    {
        this.criMemo = criMemo;
    }

    public String getCriMemo() 
    {
        return criMemo;
    }
    public void setCriDataState(Long criDataState) 
    {
        this.criDataState = criDataState;
    }

    public Long getCriDataState() 
    {
        return criDataState;
    }
    public void setCriTenantCode(String criTenantCode) 
    {
        this.criTenantCode = criTenantCode;
    }

    public String getCriTenantCode() 
    {
        return criTenantCode;
    }
    public void setCriLevel(String criLevel) 
    {
        this.criLevel = criLevel;
    }

    public String getCriLevel() 
    {
        return criLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("criId", getCriId())
            .append("criCode", getCriCode())
            .append("criName", getCriName())
            .append("criShortName", getCriShortName())
            .append("criSuperiorCode", getCriSuperiorCode())
            .append("criLng", getCriLng())
            .append("criLat", getCriLat())
            .append("criSort", getCriSort())
            .append("criGmtCreate", getCriGmtCreate())
            .append("criGmtModified", getCriGmtModified())
            .append("criMemo", getCriMemo())
            .append("criDataState", getCriDataState())
            .append("criTenantCode", getCriTenantCode())
            .append("criLevel", getCriLevel())
            .toString();
    }
}
