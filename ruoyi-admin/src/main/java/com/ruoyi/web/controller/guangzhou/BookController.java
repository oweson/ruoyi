package com.ruoyi.web.controller.guangzhou;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Book;
import com.ruoyi.system.service.IBookService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 书籍Controller
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
@Controller
@RequestMapping("/system/book")
public class BookController extends BaseController
{
    private String prefix = "system/book";

    @Autowired
    private IBookService bookService;

    @RequiresPermissions("system:book:view")
    @GetMapping()
    public String book()
    {
        return prefix + "/book";
    }

    /**
     * 查询书籍列表
     */
    @RequiresPermissions("system:book:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Book book)
    {
        startPage();
        List<Book> list = bookService.selectBookList(book);
        return getDataTable(list);
    }

    /**
     * 导出书籍列表
     */
    @RequiresPermissions("system:book:export")
    @Log(title = "书籍", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Book book)
    {
        List<Book> list = bookService.selectBookList(book);
        ExcelUtil<Book> util = new ExcelUtil<Book>(Book.class);
        return util.exportExcel(list, "book");
    }

    /**
     * 新增书籍
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存书籍
     */
    @RequiresPermissions("system:book:add")
    @Log(title = "书籍", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Book book)
    {
        return toAjax(bookService.insertBook(book));
    }

    /**
     * 修改书籍
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Book book = bookService.selectBookById(id);
        mmap.put("book", book);
        return prefix + "/edit";
    }

    /**
     * 修改保存书籍
     */
    @RequiresPermissions("system:book:edit")
    @Log(title = "书籍", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Book book)
    {
        return toAjax(bookService.updateBook(book));
    }

    /**
     * 删除书籍
     */
    @RequiresPermissions("system:book:remove")
    @Log(title = "书籍", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bookService.deleteBookByIds(ids));
    }
}
