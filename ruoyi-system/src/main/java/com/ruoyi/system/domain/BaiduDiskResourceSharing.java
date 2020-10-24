package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资源分享对象 baidu_disk_resource_sharing
 * 
 * @author oweson
 * @date 2020-10-24
 */
public class BaiduDiskResourceSharing extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 版本 */
    @Excel(name = "版本")
    private Double version;

    /** 资源 */
    @Excel(name = "资源")
    private String resourcesUrl;

    /** 大小 */
    @Excel(name = "大小")
    private Long size;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setVersion(Double version)
    {
        this.version = version;
    }

    public Double getVersion()
    {
        return version;
    }
    public void setResourcesUrl(String resourcesUrl) 
    {
        this.resourcesUrl = resourcesUrl;
    }

    public String getResourcesUrl() 
    {
        return resourcesUrl;
    }
    public void setSize(Long size) 
    {
        this.size = size;
    }

    public Long getSize() 
    {
        return size;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("name", getName())
            .append("remark", getRemark())
            .append("version", getVersion())
            .append("resourcesUrl", getResourcesUrl())
            .append("size", getSize())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
