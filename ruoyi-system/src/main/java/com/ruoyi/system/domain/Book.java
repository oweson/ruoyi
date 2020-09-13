package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 书籍对象 book
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
public class Book extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 书名 */
    @Excel(name = "书名")
    private String bookName;

    /** 作者 */
    @Excel(name = "作者")
    private String author;

    /** 简介 */
    @Excel(name = "简介")
    private String bookIntroduction;

    /** 评论 */
    @Excel(name = "评论")
    private String bookRemark;

    /** 类型 */
    @Excel(name = "类型")
    private String bookType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public String getBookName() 
    {
        return bookName;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }
    public void setBookIntroduction(String bookIntroduction) 
    {
        this.bookIntroduction = bookIntroduction;
    }

    public String getBookIntroduction() 
    {
        return bookIntroduction;
    }
    public void setBookRemark(String bookRemark) 
    {
        this.bookRemark = bookRemark;
    }

    public String getBookRemark() 
    {
        return bookRemark;
    }
    public void setBookType(String bookType) 
    {
        this.bookType = bookType;
    }

    public String getBookType() 
    {
        return bookType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bookName", getBookName())
            .append("author", getAuthor())
            .append("bookIntroduction", getBookIntroduction())
            .append("bookRemark", getBookRemark())
            .append("bookType", getBookType())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
