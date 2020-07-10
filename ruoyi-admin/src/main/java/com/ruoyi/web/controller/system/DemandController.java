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
import com.ruoyi.system.domain.Demand;
import com.ruoyi.system.service.IDemandService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 需求Controller
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
@Controller
@RequestMapping("/system/demand")
public class DemandController extends BaseController
{
    private String prefix = "system/demand";

    @Autowired
    private IDemandService demandService;

    @RequiresPermissions("system:demand:view")
    @GetMapping()
    public String demand()
    {
        return prefix + "/demand";
    }

    /**
     * 查询需求列表
     */
    @RequiresPermissions("system:demand:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Demand demand)
    {
        startPage();
        List<Demand> list = demandService.selectDemandList(demand);
        return getDataTable(list);
    }

    /**
     * 导出需求列表
     */
    @RequiresPermissions("system:demand:export")
    @Log(title = "需求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Demand demand)
    {
        List<Demand> list = demandService.selectDemandList(demand);
        ExcelUtil<Demand> util = new ExcelUtil<Demand>(Demand.class);
        return util.exportExcel(list, "demand");
    }

    /**
     * 新增需求
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存需求
     */
    @RequiresPermissions("system:demand:add")
    @Log(title = "需求", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Demand demand)
    {
        return toAjax(demandService.insertDemand(demand));
    }

    /**
     * 修改需求
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Demand demand = demandService.selectDemandById(id);
        mmap.put("demand", demand);
        return prefix + "/edit";
    }

    /**
     * 修改保存需求
     */
    @RequiresPermissions("system:demand:edit")
    @Log(title = "需求", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Demand demand)
    {
        return toAjax(demandService.updateDemand(demand));
    }

    /**
     * 删除需求
     */
    @RequiresPermissions("system:demand:remove")
    @Log(title = "需求", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(demandService.deleteDemandByIds(ids));
    }
}
