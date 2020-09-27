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
import com.ruoyi.system.domain.Bug;
import com.ruoyi.system.service.IBugService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * bug记录Controller
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Controller
@RequestMapping("/system/bug")
public class BugController extends BaseController
{
    private String prefix = "system/bug";

    @Autowired
    private IBugService bugService;

    @RequiresPermissions("system:bug:view")
    @GetMapping()
    public String bug()
    {
        return prefix + "/bug";
    }

    /**
     * 查询bug记录列表
     */
    @RequiresPermissions("system:bug:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Bug bug)
    {
        startPage();
        List<Bug> list = bugService.selectBugList(bug);
        return getDataTable(list);
    }

    /**
     * 导出bug记录列表
     */
    @RequiresPermissions("system:bug:export")
    @Log(title = "bug记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Bug bug)
    {
        List<Bug> list = bugService.selectBugList(bug);
        ExcelUtil<Bug> util = new ExcelUtil<Bug>(Bug.class);
        return util.exportExcel(list, "bug");
    }

    /**
     * 新增bug记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存bug记录
     */
    @RequiresPermissions("system:bug:add")
    @Log(title = "bug记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Bug bug)
    {
        return toAjax(bugService.insertBug(bug));
    }

    /**
     * 修改bug记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Bug bug = bugService.selectBugById(id);
        mmap.put("bug", bug);
        return prefix + "/edit";
    }

    /**
     * 修改保存bug记录
     */
    @RequiresPermissions("system:bug:edit")
    @Log(title = "bug记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Bug bug)
    {
        return toAjax(bugService.updateBug(bug));
    }

    /**
     * 删除bug记录
     */
    @RequiresPermissions("system:bug:remove")
    @Log(title = "bug记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bugService.deleteBugByIds(ids));
    }
}
