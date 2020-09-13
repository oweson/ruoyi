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
import com.ruoyi.system.domain.InspirationalQuotations;
import com.ruoyi.system.service.IInspirationalQuotationsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 心灵鸡汤Controller
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Controller
@RequestMapping("/system/quotations")
public class InspirationalQuotationsController extends BaseController
{
    private String prefix = "system/quotations";

    @Autowired
    private IInspirationalQuotationsService inspirationalQuotationsService;

    @RequiresPermissions("system:quotations:view")
    @GetMapping()
    public String quotations()
    {
        return prefix + "/quotations";
    }

    /**
     * 查询心灵鸡汤列表
     */
    @RequiresPermissions("system:quotations:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InspirationalQuotations inspirationalQuotations)
    {
        startPage();
        List<InspirationalQuotations> list = inspirationalQuotationsService.selectInspirationalQuotationsList(inspirationalQuotations);
        return getDataTable(list);
    }

    /**
     * 导出心灵鸡汤列表
     */
    @RequiresPermissions("system:quotations:export")
    @Log(title = "心灵鸡汤", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InspirationalQuotations inspirationalQuotations)
    {
        List<InspirationalQuotations> list = inspirationalQuotationsService.selectInspirationalQuotationsList(inspirationalQuotations);
        ExcelUtil<InspirationalQuotations> util = new ExcelUtil<InspirationalQuotations>(InspirationalQuotations.class);
        return util.exportExcel(list, "quotations");
    }

    /**
     * 新增心灵鸡汤
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存心灵鸡汤
     */
    @RequiresPermissions("system:quotations:add")
    @Log(title = "心灵鸡汤", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InspirationalQuotations inspirationalQuotations)
    {
        return toAjax(inspirationalQuotationsService.insertInspirationalQuotations(inspirationalQuotations));
    }

    /**
     * 修改心灵鸡汤
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InspirationalQuotations inspirationalQuotations = inspirationalQuotationsService.selectInspirationalQuotationsById(id);
        mmap.put("inspirationalQuotations", inspirationalQuotations);
        return prefix + "/edit";
    }

    /**
     * 修改保存心灵鸡汤
     */
    @RequiresPermissions("system:quotations:edit")
    @Log(title = "心灵鸡汤", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InspirationalQuotations inspirationalQuotations)
    {
        return toAjax(inspirationalQuotationsService.updateInspirationalQuotations(inspirationalQuotations));
    }

    /**
     * 删除心灵鸡汤
     */
    @RequiresPermissions("system:quotations:remove")
    @Log(title = "心灵鸡汤", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(inspirationalQuotationsService.deleteInspirationalQuotationsByIds(ids));
    }
}
