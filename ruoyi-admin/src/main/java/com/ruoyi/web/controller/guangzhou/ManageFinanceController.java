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
import com.ruoyi.system.domain.ManageFinance;
import com.ruoyi.system.service.IManageFinanceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消费管理Controller
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Controller
@RequestMapping("/system/finance")
public class ManageFinanceController extends BaseController
{
    private String prefix = "system/finance";

    @Autowired
    private IManageFinanceService manageFinanceService;

    @RequiresPermissions("system:finance:view")
    @GetMapping()
    public String finance()
    {
        return prefix + "/finance";
    }

    /**
     * 查询消费管理列表
     */
    @RequiresPermissions("system:finance:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ManageFinance manageFinance)
    {
        startPage();
        List<ManageFinance> list = manageFinanceService.selectManageFinanceList(manageFinance);
        return getDataTable(list);
    }

    /**
     * 导出消费管理列表
     */
    @RequiresPermissions("system:finance:export")
    @Log(title = "消费管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ManageFinance manageFinance)
    {
        List<ManageFinance> list = manageFinanceService.selectManageFinanceList(manageFinance);
        ExcelUtil<ManageFinance> util = new ExcelUtil<ManageFinance>(ManageFinance.class);
        return util.exportExcel(list, "finance");
    }

    /**
     * 新增消费管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存消费管理
     */
    @RequiresPermissions("system:finance:add")
    @Log(title = "消费管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ManageFinance manageFinance)
    {
        return toAjax(manageFinanceService.insertManageFinance(manageFinance));
    }

    /**
     * 修改消费管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ManageFinance manageFinance = manageFinanceService.selectManageFinanceById(id);
        mmap.put("manageFinance", manageFinance);
        return prefix + "/edit";
    }

    /**
     * 修改保存消费管理
     */
    @RequiresPermissions("system:finance:edit")
    @Log(title = "消费管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ManageFinance manageFinance)
    {
        return toAjax(manageFinanceService.updateManageFinance(manageFinance));
    }

    /**
     * 删除消费管理
     */
    @RequiresPermissions("system:finance:remove")
    @Log(title = "消费管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(manageFinanceService.deleteManageFinanceByIds(ids));
    }
}
