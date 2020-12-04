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
import com.ruoyi.system.domain.Delisting;
import com.ruoyi.system.service.IDelistingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 恋爱之路Controller
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Controller
@RequestMapping("/system/delisting")
public class DelistingController extends BaseController
{
    private String prefix = "system/delisting";

    @Autowired
    private IDelistingService delistingService;

    @RequiresPermissions("system:delisting:view")
    @GetMapping()
    public String delisting()
    {
        return prefix + "/delisting";
    }

    /**
     * 查询恋爱之路列表
     */
    @RequiresPermissions("system:delisting:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Delisting delisting)
    {
        startPage();
        List<Delisting> list = delistingService.selectDelistingList(delisting);
        return getDataTable(list);
    }

    /**
     * 导出恋爱之路列表
     */
    @RequiresPermissions("system:delisting:export")
    @Log(title = "恋爱之路", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Delisting delisting)
    {
        List<Delisting> list = delistingService.selectDelistingList(delisting);
        ExcelUtil<Delisting> util = new ExcelUtil<Delisting>(Delisting.class);
        return util.exportExcel(list, "delisting");
    }

    /**
     * 新增恋爱之路
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存恋爱之路
     */
    @RequiresPermissions("system:delisting:add")
    @Log(title = "恋爱之路", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Delisting delisting)
    {
        return toAjax(delistingService.insertDelisting(delisting));
    }

    /**
     * 修改恋爱之路
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Delisting delisting = delistingService.selectDelistingById(id);
        mmap.put("delisting", delisting);
        return prefix + "/edit";
    }

    /**
     * 修改保存恋爱之路
     */
    @RequiresPermissions("system:delisting:edit")
    @Log(title = "恋爱之路", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Delisting delisting)
    {
        return toAjax(delistingService.updateDelisting(delisting));
    }

    /**
     * 删除恋爱之路
     */
    @RequiresPermissions("system:delisting:remove")
    @Log(title = "恋爱之路", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(delistingService.deleteDelistingByIds(ids));
    }
}
