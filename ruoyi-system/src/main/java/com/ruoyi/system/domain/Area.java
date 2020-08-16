package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 国家地区对象 area
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
public class Area extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long areaId;

    /** 地区父ID */
    @Excel(name = "地区父ID")
    private Long parentId;

    /** 中文名称 */
    @Excel(name = "中文名称")
    private String nameZh;

    /** 英文名称 */
    @Excel(name = "英文名称")
    private String nameEn;

    /** 数字编码 */
    @Excel(name = "数字编码")
    private String codeNumber;

    /** 英文编码 */
    @Excel(name = "英文编码")
    private String codeEn;

    /** 排序 */
    @Excel(name = "排序")
    private Integer sort;

    public void setAreaId(Long areaId) 
    {
        this.areaId = areaId;
    }

    public Long getAreaId() 
    {
        return areaId;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setNameZh(String nameZh) 
    {
        this.nameZh = nameZh;
    }

    public String getNameZh() 
    {
        return nameZh;
    }
    public void setNameEn(String nameEn) 
    {
        this.nameEn = nameEn;
    }

    public String getNameEn() 
    {
        return nameEn;
    }
    public void setCodeNumber(String codeNumber) 
    {
        this.codeNumber = codeNumber;
    }

    public String getCodeNumber() 
    {
        return codeNumber;
    }
    public void setCodeEn(String codeEn) 
    {
        this.codeEn = codeEn;
    }

    public String getCodeEn() 
    {
        return codeEn;
    }
    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("areaId", getAreaId())
            .append("parentId", getParentId())
            .append("nameZh", getNameZh())
            .append("nameEn", getNameEn())
            .append("codeNumber", getCodeNumber())
            .append("codeEn", getCodeEn())
            .append("sort", getSort())
            .toString();
    }
}
