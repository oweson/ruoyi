package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 恋爱人员对象 blind_datepeople
 * 
 * @author oweson
 * @date 2020-10-07
 */
public class BlindDatepeople extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄相差 */
    @Excel(name = "年龄相差")
    private Integer age;

    /** 工作地 */
    @Excel(name = "工作地")
    private String workArea;

    /** 体重 */
    @Excel(name = "体重")
    private Long weight;

    /** 身高 */
    @Excel(name = "身高")
    private Long height;

    /** 容貌 */
    @Excel(name = "容貌")
    private String looks;

    /** 爱好 */
    @Excel(name = "爱好")
    private String hoby;

    /** 评价 */
    @Excel(name = "评价")
    private String evaluate;

    /** 进展 */
    @Excel(name = "进展")
    private String type;

    /** 简介 */
    @Excel(name = "简介")
    private String briefIntroduce;

    /** 职业 */
    @Excel(name = "职业")
    private String occupation;

    /** 来源 */
    @Excel(name = "来源")
    private String source;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
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
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setWorkArea(String workArea) 
    {
        this.workArea = workArea;
    }

    public String getWorkArea() 
    {
        return workArea;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }
    public void setHeight(Long height) 
    {
        this.height = height;
    }

    public Long getHeight() 
    {
        return height;
    }
    public void setLooks(String looks) 
    {
        this.looks = looks;
    }

    public String getLooks() 
    {
        return looks;
    }
    public void setHoby(String hoby) 
    {
        this.hoby = hoby;
    }

    public String getHoby() 
    {
        return hoby;
    }
    public void setEvaluate(String evaluate) 
    {
        this.evaluate = evaluate;
    }

    public String getEvaluate() 
    {
        return evaluate;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setBriefIntroduce(String briefIntroduce) 
    {
        this.briefIntroduce = briefIntroduce;
    }

    public String getBriefIntroduce() 
    {
        return briefIntroduce;
    }
    public void setOccupation(String occupation) 
    {
        this.occupation = occupation;
    }

    public String getOccupation() 
    {
        return occupation;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("age", getAge())
            .append("workArea", getWorkArea())
            .append("weight", getWeight())
            .append("height", getHeight())
            .append("looks", getLooks())
            .append("hoby", getHoby())
            .append("evaluate", getEvaluate())
            .append("type", getType())
            .append("briefIntroduce", getBriefIntroduce())
            .append("occupation", getOccupation())
            .append("source", getSource())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
