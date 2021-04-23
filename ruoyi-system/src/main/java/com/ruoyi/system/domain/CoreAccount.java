package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 账号管理对象 core_account
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
public class CoreAccount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Integer id;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 账号 */
    @Excel(name = "账号")
    private String accoutName;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 删除 */
    private String idDeleted;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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
    public void setAccoutName(String accoutName) 
    {
        this.accoutName = accoutName;
    }

    public String getAccoutName() 
    {
        return accoutName;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setIdDeleted(String idDeleted) 
    {
        this.idDeleted = idDeleted;
    }

    public String getIdDeleted() 
    {
        return idDeleted;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("accoutName", getAccoutName())
            .append("password", getPassword())
            .append("status", getStatus())
            .append("idDeleted", getIdDeleted())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("name", getName())
            .toString();
    }
}
