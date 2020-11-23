package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * borrow_money对象 db_backups
 * 
 * @author ruoyi
 * @date 2020-11-23
 */
public class DbBackups extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 数据库名字 */
    @Excel(name = "数据库名字")
    private String dbname;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 文件名字 */
    @Excel(name = "文件名字")
    private String fileName;

    /** 服务器地址 */
    @Excel(name = "服务器地址")
    private String serviceIp;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDbname(String dbname) 
    {
        this.dbname = dbname;
    }

    public String getDbname() 
    {
        return dbname;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setFileName(String fileName) 
    {
        this.fileName = fileName;
    }

    public String getFileName() 
    {
        return fileName;
    }
    public void setServiceIp(String serviceIp) 
    {
        this.serviceIp = serviceIp;
    }

    public String getServiceIp() 
    {
        return serviceIp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dbname", getDbname())
            .append("remark", getRemark())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("fileName", getFileName())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("serviceIp", getServiceIp())
            .toString();
    }
}
