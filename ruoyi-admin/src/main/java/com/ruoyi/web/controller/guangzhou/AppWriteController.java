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
import com.ruoyi.system.domain.AppWrite;
import com.ruoyi.system.service.IAppWriteService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * app记录Controller
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Controller
@RequestMapping("/system/write")
public class AppWriteController extends BaseController
{
    private String prefix = "system/write";

    @Autowired
    private IAppWriteService appWriteService;

    @RequiresPermissions("system:write:view")
    @GetMapping()
    public String write()
    {
        return prefix + "/write";
    }

    /**
     * 查询app记录列表
     */
    @RequiresPermissions("system:write:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppWrite appWrite)
    {
        startPage();
        List<AppWrite> list = appWriteService.selectAppWriteList(appWrite);
        return getDataTable(list);
    }

    /**
     * 导出app记录列表
     */
    @RequiresPermissions("system:write:export")
    @Log(title = "app记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppWrite appWrite)
    {
        List<AppWrite> list = appWriteService.selectAppWriteList(appWrite);
        ExcelUtil<AppWrite> util = new ExcelUtil<AppWrite>(AppWrite.class);
        return util.exportExcel(list, "write");
    }

    /**
     * 新增app记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存app记录
     */
    @RequiresPermissions("system:write:add")
    @Log(title = "app记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AppWrite appWrite)
    {
        return toAjax(appWriteService.insertAppWrite(appWrite));
    }

    /**
     * 修改app记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        AppWrite appWrite = appWriteService.selectAppWriteById(id);
        mmap.put("appWrite", appWrite);
        return prefix + "/edit";
    }

    /**
     * 修改保存app记录
     */
    @RequiresPermissions("system:write:edit")
    @Log(title = "app记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppWrite appWrite)
    {
        return toAjax(appWriteService.updateAppWrite(appWrite));
    }

    /**
     * 删除app记录
     */
    @RequiresPermissions("system:write:remove")
    @Log(title = "app记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(appWriteService.deleteAppWriteByIds(ids));
    }
}
