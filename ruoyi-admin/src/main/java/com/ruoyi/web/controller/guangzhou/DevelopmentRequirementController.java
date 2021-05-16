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
import com.ruoyi.system.domain.DevelopmentRequirement;
import com.ruoyi.system.service.IDevelopmentRequirementService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 计划需求Controller
 * 
 * @author ruoyi
 * @date 2021-05-16
 */
@Controller
@RequestMapping("/system/requirement")
public class DevelopmentRequirementController extends BaseController
{
    private String prefix = "system/requirement";

    @Autowired
    private IDevelopmentRequirementService developmentRequirementService;

    @RequiresPermissions("system:requirement:view")
    @GetMapping()
    public String requirement()
    {
        return prefix + "/requirement";
    }

    /**
     * 查询计划需求列表
     */
    @RequiresPermissions("system:requirement:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DevelopmentRequirement developmentRequirement)
    {
        startPage();
        List<DevelopmentRequirement> list = developmentRequirementService.selectDevelopmentRequirementList(developmentRequirement);
        return getDataTable(list);
    }

    /**
     * 导出计划需求列表
     */
    @RequiresPermissions("system:requirement:export")
    @Log(title = "计划需求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DevelopmentRequirement developmentRequirement)
    {
        List<DevelopmentRequirement> list = developmentRequirementService.selectDevelopmentRequirementList(developmentRequirement);
        ExcelUtil<DevelopmentRequirement> util = new ExcelUtil<DevelopmentRequirement>(DevelopmentRequirement.class);
        return util.exportExcel(list, "计划需求数据");
    }

    /**
     * 新增计划需求
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存计划需求
     */
    @RequiresPermissions("system:requirement:add")
    @Log(title = "计划需求", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DevelopmentRequirement developmentRequirement)
    {
        return toAjax(developmentRequirementService.insertDevelopmentRequirement(developmentRequirement));
    }

    /**
     * 修改计划需求
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DevelopmentRequirement developmentRequirement = developmentRequirementService.selectDevelopmentRequirementById(id);
        mmap.put("developmentRequirement", developmentRequirement);
        return prefix + "/edit";
    }

    /**
     * 修改保存计划需求
     */
    @RequiresPermissions("system:requirement:edit")
    @Log(title = "计划需求", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DevelopmentRequirement developmentRequirement)
    {
        return toAjax(developmentRequirementService.updateDevelopmentRequirement(developmentRequirement));
    }

    /**
     * 删除计划需求
     */
    @RequiresPermissions("system:requirement:remove")
    @Log(title = "计划需求", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(developmentRequirementService.deleteDevelopmentRequirementByIds(ids));
    }
}
