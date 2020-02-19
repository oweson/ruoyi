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
import com.ruoyi.system.domain.LifeBuy;
import com.ruoyi.system.service.ILifeBuyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生活日常消费Controller
 * 
 * @author ruoyi
 * @date 2020-02-17
 */
@Controller
@RequestMapping("/system/buy")
public class LifeBuyController extends BaseController
{
    private String prefix = "system/buy";

    @Autowired
    private ILifeBuyService lifeBuyService;

    @RequiresPermissions("system:buy:view")
    @GetMapping()
    public String buy()
    {
        return prefix + "/buy";
    }

    /**
     * 查询生活日常消费列表
     */
    @RequiresPermissions("system:buy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LifeBuy lifeBuy)
    {
        startPage();
        List<LifeBuy> list = lifeBuyService.selectLifeBuyList(lifeBuy);
        return getDataTable(list);
    }

    /**
     * 导出生活日常消费列表
     */
    @RequiresPermissions("system:buy:export")
    @Log(title = "生活日常消费", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LifeBuy lifeBuy)
    {
        List<LifeBuy> list = lifeBuyService.selectLifeBuyList(lifeBuy);
        ExcelUtil<LifeBuy> util = new ExcelUtil<LifeBuy>(LifeBuy.class);
        return util.exportExcel(list, "buy");
    }

    /**
     * 新增生活日常消费
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生活日常消费
     */
    @RequiresPermissions("system:buy:add")
    @Log(title = "生活日常消费", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LifeBuy lifeBuy)
    {
        return toAjax(lifeBuyService.insertLifeBuy(lifeBuy));
    }

    /**
     * 修改生活日常消费
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LifeBuy lifeBuy = lifeBuyService.selectLifeBuyById(id);
        mmap.put("lifeBuy", lifeBuy);
        return prefix + "/edit";
    }

    /**
     * 修改保存生活日常消费
     */
    @RequiresPermissions("system:buy:edit")
    @Log(title = "生活日常消费", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LifeBuy lifeBuy)
    {
        return toAjax(lifeBuyService.updateLifeBuy(lifeBuy));
    }

    /**
     * 删除生活日常消费
     */
    @RequiresPermissions("system:buy:remove")
    @Log(title = "生活日常消费", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lifeBuyService.deleteLifeBuyByIds(ids));
    }
}
