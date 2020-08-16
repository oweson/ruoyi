package com.ruoyi.web.controller.system;

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
import com.ruoyi.system.domain.BasWord;
import com.ruoyi.system.service.IBasWordService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * wordController
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
@Controller
@RequestMapping("/system/word")
public class BasWordController extends BaseController
{
    private String prefix = "system/word";

    @Autowired
    private IBasWordService basWordService;

    @RequiresPermissions("system:word:view")
    @GetMapping()
    public String word()
    {
        return prefix + "/word";
    }

    /**
     * 查询word列表
     */
    @RequiresPermissions("system:word:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BasWord basWord)
    {
        startPage();
        List<BasWord> list = basWordService.selectBasWordList(basWord);
        return getDataTable(list);
    }

    /**
     * 导出word列表
     */
    @RequiresPermissions("system:word:export")
    @Log(title = "word", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BasWord basWord)
    {
        List<BasWord> list = basWordService.selectBasWordList(basWord);
        ExcelUtil<BasWord> util = new ExcelUtil<BasWord>(BasWord.class);
        return util.exportExcel(list, "word");
    }

    /**
     * 新增word
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存word
     */
    @RequiresPermissions("system:word:add")
    @Log(title = "word", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BasWord basWord)
    {
        return toAjax(basWordService.insertBasWord(basWord));
    }

    /**
     * 修改word
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BasWord basWord = basWordService.selectBasWordById(id);
        mmap.put("basWord", basWord);
        return prefix + "/edit";
    }

    /**
     * 修改保存word
     */
    @RequiresPermissions("system:word:edit")
    @Log(title = "word", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BasWord basWord)
    {
        return toAjax(basWordService.updateBasWord(basWord));
    }

    /**
     * 删除word
     */
    @RequiresPermissions("system:word:remove")
    @Log(title = "word", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(basWordService.deleteBasWordByIds(ids));
    }
}
