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
import com.ruoyi.system.domain.Plan;
import com.ruoyi.system.service.IPlanService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 计划详情Controller
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Controller
@RequestMapping("/system/plan")
public class PlanController extends BaseController
{
    private String prefix = "system/plan";

    @Autowired
    private IPlanService planService;

    @RequiresPermissions("system:plan:view")
    @GetMapping()
    public String plan()
    {
        return prefix + "/plan";
    }

    /**
     * 查询计划详情列表
     */
    @RequiresPermissions("system:plan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Plan plan)
    {
        startPage();
        List<Plan> list = planService.selectPlanList(plan);
        return getDataTable(list);
    }

    /**
     * 导出计划详情列表
     */
    @RequiresPermissions("system:plan:export")
    @Log(title = "计划详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Plan plan)
    {
        List<Plan> list = planService.selectPlanList(plan);
        ExcelUtil<Plan> util = new ExcelUtil<Plan>(Plan.class);
        return util.exportExcel(list, "plan");
    }

    /**
     * 新增计划详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存计划详情
     */
    @RequiresPermissions("system:plan:add")
    @Log(title = "计划详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Plan plan)
    {
        return toAjax(planService.insertPlan(plan));
    }

    /**
     * 修改计划详情
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Plan plan = planService.selectPlanById(id);
        mmap.put("plan", plan);
        return prefix + "/edit";
    }

    /**
     * 修改保存计划详情
     */
    @RequiresPermissions("system:plan:edit")
    @Log(title = "计划详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Plan plan)
    {
        return toAjax(planService.updatePlan(plan));
    }

    /**
     * 删除计划详情
     */
    @RequiresPermissions("system:plan:remove")
    @Log(title = "计划详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(planService.deletePlanByIds(ids));
    }
}
