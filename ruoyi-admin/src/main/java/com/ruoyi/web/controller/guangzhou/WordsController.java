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
import com.ruoyi.system.domain.Words;
import com.ruoyi.system.service.IWordsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * wordsController
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Controller
@RequestMapping("/system/words")
public class WordsController extends BaseController
{
    private String prefix = "system/words";

    @Autowired
    private IWordsService wordsService;

    @RequiresPermissions("system:words:view")
    @GetMapping()
    public String words()
    {
        return prefix + "/words";
    }

    /**
     * 查询words列表
     */
    @RequiresPermissions("system:words:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Words words)
    {
        startPage();
        List<Words> list = wordsService.selectWordsList(words);
        return getDataTable(list);
    }

    /**
     * 导出words列表
     */
    @RequiresPermissions("system:words:export")
    @Log(title = "words", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Words words)
    {
        List<Words> list = wordsService.selectWordsList(words);
        ExcelUtil<Words> util = new ExcelUtil<Words>(Words.class);
        return util.exportExcel(list, "words");
    }

    /**
     * 新增words
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存words
     */
    @RequiresPermissions("system:words:add")
    @Log(title = "words", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Words words)
    {
        return toAjax(wordsService.insertWords(words));
    }

    /**
     * 修改words
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Words words = wordsService.selectWordsById(id);
        mmap.put("words", words);
        return prefix + "/edit";
    }

    /**
     * 修改保存words
     */
    @RequiresPermissions("system:words:edit")
    @Log(title = "words", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Words words)
    {
        return toAjax(wordsService.updateWords(words));
    }

    /**
     * 删除words
     */
    @RequiresPermissions("system:words:remove")
    @Log(title = "words", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wordsService.deleteWordsByIds(ids));
    }
}
