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
import com.ruoyi.system.domain.CommercialCases;
import com.ruoyi.system.service.ICommercialCasesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商业分析Controller
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Controller
@RequestMapping("/system/cases")
public class CommercialCasesController extends BaseController
{
    private String prefix = "system/cases";

    @Autowired
    private ICommercialCasesService commercialCasesService;

    @RequiresPermissions("system:cases:view")
    @GetMapping()
    public String cases()
    {
        return prefix + "/cases";
    }

    /**
     * 查询商业分析列表
     */
    @RequiresPermissions("system:cases:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommercialCases commercialCases)
    {
        startPage();
        List<CommercialCases> list = commercialCasesService.selectCommercialCasesList(commercialCases);
        return getDataTable(list);
    }

    /**
     * 导出商业分析列表
     */
    @RequiresPermissions("system:cases:export")
    @Log(title = "商业分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommercialCases commercialCases)
    {
        List<CommercialCases> list = commercialCasesService.selectCommercialCasesList(commercialCases);
        ExcelUtil<CommercialCases> util = new ExcelUtil<CommercialCases>(CommercialCases.class);
        return util.exportExcel(list, "cases");
    }

    /**
     * 新增商业分析
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商业分析
     */
    @RequiresPermissions("system:cases:add")
    @Log(title = "商业分析", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommercialCases commercialCases)
    {
        return toAjax(commercialCasesService.insertCommercialCases(commercialCases));
    }

    /**
     * 修改商业分析
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CommercialCases commercialCases = commercialCasesService.selectCommercialCasesById(id);
        mmap.put("commercialCases", commercialCases);
        return prefix + "/edit";
    }

    /**
     * 修改保存商业分析
     */
    @RequiresPermissions("system:cases:edit")
    @Log(title = "商业分析", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommercialCases commercialCases)
    {
        return toAjax(commercialCasesService.updateCommercialCases(commercialCases));
    }

    /**
     * 删除商业分析
     */
    @RequiresPermissions("system:cases:remove")
    @Log(title = "商业分析", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commercialCasesService.deleteCommercialCasesByIds(ids));
    }
}
