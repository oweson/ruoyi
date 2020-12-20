package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * babyname对象 babystudent
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public class Babystudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 学生id */
    private String aloStudentId;

    /** 创建者id */
    @Excel(name = "创建者id")
    private Long studentUserId;

    /** 电话 */
    @Excel(name = "电话")
    private String aloStudentPhone;

    /** 公司id */
    private Long companyId;

    /** 校区id */
    private Long campusId;

    /** 中文名字 */
    @Excel(name = "中文名字")
    private String chineseName;

    /** 英文名字 */
    @Excel(name = "英文名字")
    private String englishName;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setAloStudentId(String aloStudentId) 
    {
        this.aloStudentId = aloStudentId;
    }

    public String getAloStudentId() 
    {
        return aloStudentId;
    }
    public void setStudentUserId(Long studentUserId) 
    {
        this.studentUserId = studentUserId;
    }

    public Long getStudentUserId() 
    {
        return studentUserId;
    }
    public void setAloStudentPhone(String aloStudentPhone) 
    {
        this.aloStudentPhone = aloStudentPhone;
    }

    public String getAloStudentPhone() 
    {
        return aloStudentPhone;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setCampusId(Long campusId) 
    {
        this.campusId = campusId;
    }

    public Long getCampusId() 
    {
        return campusId;
    }
    public void setChineseName(String chineseName) 
    {
        this.chineseName = chineseName;
    }

    public String getChineseName() 
    {
        return chineseName;
    }
    public void setEnglishName(String englishName) 
    {
        this.englishName = englishName;
    }

    public String getEnglishName() 
    {
        return englishName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("aloStudentId", getAloStudentId())
            .append("studentUserId", getStudentUserId())
            .append("createTime", getCreateTime())
            .append("aloStudentPhone", getAloStudentPhone())
            .append("companyId", getCompanyId())
            .append("campusId", getCampusId())
            .append("chineseName", getChineseName())
            .append("englishName", getEnglishName())
            .toString();
    }
}
