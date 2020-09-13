package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文件对象 file
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
public class File extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Integer id;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 简介 */
    @Excel(name = "简介")
    private String briefIntroduce;

    /** 文件大小 */
    @Excel(name = "文件大小")
    private String fileSize;

    /** url */
    @Excel(name = "url")
    private String url;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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
    public void setBriefIntroduce(String briefIntroduce) 
    {
        this.briefIntroduce = briefIntroduce;
    }

    public String getBriefIntroduce() 
    {
        return briefIntroduce;
    }
    public void setFileSize(String fileSize) 
    {
        this.fileSize = fileSize;
    }

    public String getFileSize() 
    {
        return fileSize;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("briefIntroduce", getBriefIntroduce())
            .append("fileSize", getFileSize())
            .append("url", getUrl())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
