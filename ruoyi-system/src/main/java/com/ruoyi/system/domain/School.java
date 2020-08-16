package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * school对象 school
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
public class School extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** null */
    @Excel(name = "null")
    private String schoolId;

    /** null */
    @Excel(name = "null")
    private String schoolName;

    /** null */
    @Excel(name = "null")
    private String provinceId;

    /** null */
    @Excel(name = "null")
    private String provinceName;

    /** null */
    @Excel(name = "null")
    private String cityId;

    /** null */
    @Excel(name = "null")
    private String cityName;

    /** null */
    @Excel(name = "null")
    private String level;

    /** null */
    @Excel(name = "null")
    private String department;

    /** null */
    @Excel(name = "null")
    private String other;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSchoolId(String schoolId) 
    {
        this.schoolId = schoolId;
    }

    public String getSchoolId() 
    {
        return schoolId;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setProvinceId(String provinceId) 
    {
        this.provinceId = provinceId;
    }

    public String getProvinceId() 
    {
        return provinceId;
    }
    public void setProvinceName(String provinceName) 
    {
        this.provinceName = provinceName;
    }

    public String getProvinceName() 
    {
        return provinceName;
    }
    public void setCityId(String cityId) 
    {
        this.cityId = cityId;
    }

    public String getCityId() 
    {
        return cityId;
    }
    public void setCityName(String cityName) 
    {
        this.cityName = cityName;
    }

    public String getCityName() 
    {
        return cityName;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setOther(String other) 
    {
        this.other = other;
    }

    public String getOther() 
    {
        return other;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("schoolId", getSchoolId())
            .append("schoolName", getSchoolName())
            .append("provinceId", getProvinceId())
            .append("provinceName", getProvinceName())
            .append("cityId", getCityId())
            .append("cityName", getCityName())
            .append("level", getLevel())
            .append("department", getDepartment())
            .append("other", getOther())
            .toString();
    }
}
