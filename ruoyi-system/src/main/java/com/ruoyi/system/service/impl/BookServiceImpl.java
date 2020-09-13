package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BookMapper;
import com.ruoyi.system.domain.Book;
import com.ruoyi.system.service.IBookService;
import com.ruoyi.common.core.text.Convert;

/**
 * 书籍Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
@Service
public class BookServiceImpl implements IBookService 
{
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询书籍
     * 
     * @param id 书籍ID
     * @return 书籍
     */
    @Override
    public Book selectBookById(Long id)
    {
        return bookMapper.selectBookById(id);
    }

    /**
     * 查询书籍列表
     * 
     * @param book 书籍
     * @return 书籍
     */
    @Override
    public List<Book> selectBookList(Book book)
    {
        return bookMapper.selectBookList(book);
    }

    /**
     * 新增书籍
     * 
     * @param book 书籍
     * @return 结果
     */
    @Override
    public int insertBook(Book book)
    {
        book.setCreateTime(DateUtils.getNowDate());
        return bookMapper.insertBook(book);
    }

    /**
     * 修改书籍
     * 
     * @param book 书籍
     * @return 结果
     */
    @Override
    public int updateBook(Book book)
    {
        book.setUpdateTime(DateUtils.getNowDate());
        return bookMapper.updateBook(book);
    }

    /**
     * 删除书籍对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBookByIds(String ids)
    {
        return bookMapper.deleteBookByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除书籍信息
     * 
     * @param id 书籍ID
     * @return 结果
     */
    @Override
    public int deleteBookById(Long id)
    {
        return bookMapper.deleteBookById(id);
    }
}
