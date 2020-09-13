package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Book;

/**
 * 书籍Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
public interface BookMapper 
{
    /**
     * 查询书籍
     * 
     * @param id 书籍ID
     * @return 书籍
     */
    public Book selectBookById(Long id);

    /**
     * 查询书籍列表
     * 
     * @param book 书籍
     * @return 书籍集合
     */
    public List<Book> selectBookList(Book book);

    /**
     * 新增书籍
     * 
     * @param book 书籍
     * @return 结果
     */
    public int insertBook(Book book);

    /**
     * 修改书籍
     * 
     * @param book 书籍
     * @return 结果
     */
    public int updateBook(Book book);

    /**
     * 删除书籍
     * 
     * @param id 书籍ID
     * @return 结果
     */
    public int deleteBookById(Long id);

    /**
     * 批量删除书籍
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBookByIds(String[] ids);
}
