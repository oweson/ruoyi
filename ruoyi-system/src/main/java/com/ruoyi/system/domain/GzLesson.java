package com.ruoyi.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 经验教训对象 gz_lesson
 *
 * @author ruoyi
 * @date 2020-07-31
 */
public class GzLesson extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 项目id
     */
    private Long id;

    /**
     * 教训名字
     */
    @Excel(name = "教训名字")
    private String lessonName;

    /**
     * 教训详情
     */
    @Excel(name = "教训详情")
    private String lessonDesc;

    /**
     * 解决方案
     */
    @Excel(name = "解决方案")
    private String lessonShould;

    /**
     * 教训类型（1:生活）
     */
    @Excel(name = "教训类型", readConverterExp = "1=生活,3=感情,2=工作,4=自卑,5=战略")
    private String lessonType;

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

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonDesc(String lessonDesc) {
        this.lessonDesc = lessonDesc;
    }

    public String getLessonDesc() {
        return lessonDesc;
    }

    public void setLessonShould(String lessonShould) {
        this.lessonShould = lessonShould;
    }

    public String getLessonShould() {
        return lessonShould;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("lessonName", getLessonName())
                .append("lessonDesc", getLessonDesc())
                .append("lessonShould", getLessonShould())
                .append("lessonType", getLessonType())
                .append("createTime", getCreateTime())
                .append("lastUpdateTime", getLastUpdateTime())
                .toString();
    }
}
