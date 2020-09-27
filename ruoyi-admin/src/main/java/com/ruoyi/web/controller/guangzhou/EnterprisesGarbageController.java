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
import com.ruoyi.system.domain.EnterprisesGarbage;
import com.ruoyi.system.service.IEnterprisesGarbageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 垃圾公司Controller
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Controller
@RequestMapping("/system/garbage")
public class EnterprisesGarbageController extends BaseController
{
    private String prefix = "system/garbage";

    @Autowired
    private IEnterprisesGarbageService enterprisesGarbageService;

    @RequiresPermissions("system:garbage:view")
    @GetMapping()
    public String garbage()
    {
        return prefix + "/garbage";
    }

    /**
     * 查询垃圾公司列表
     */
    @RequiresPermissions("system:garbage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EnterprisesGarbage enterprisesGarbage)
    {
        startPage();
        List<EnterprisesGarbage> list = enterprisesGarbageService.selectEnterprisesGarbageList(enterprisesGarbage);
        return getDataTable(list);
    }

    /**
     * 导出垃圾公司列表
     */
    @RequiresPermissions("system:garbage:export")
    @Log(title = "垃圾公司", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EnterprisesGarbage enterprisesGarbage)
    {
        List<EnterprisesGarbage> list = enterprisesGarbageService.selectEnterprisesGarbageList(enterprisesGarbage);
        ExcelUtil<EnterprisesGarbage> util = new ExcelUtil<EnterprisesGarbage>(EnterprisesGarbage.class);
        return util.exportExcel(list, "garbage");
    }

    /**
     * 新增垃圾公司
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存垃圾公司
     */
    @RequiresPermissions("system:garbage:add")
    @Log(title = "垃圾公司", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EnterprisesGarbage enterprisesGarbage)
    {
        return toAjax(enterprisesGarbageService.insertEnterprisesGarbage(enterprisesGarbage));
    }

    /**
     * 修改垃圾公司
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        EnterprisesGarbage enterprisesGarbage = enterprisesGarbageService.selectEnterprisesGarbageById(id);
        mmap.put("enterprisesGarbage", enterprisesGarbage);
        return prefix + "/edit";
    }

    /**
     * 修改保存垃圾公司
     */
    @RequiresPermissions("system:garbage:edit")
    @Log(title = "垃圾公司", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EnterprisesGarbage enterprisesGarbage)
    {
        return toAjax(enterprisesGarbageService.updateEnterprisesGarbage(enterprisesGarbage));
    }

    /**
     * 删除垃圾公司
     */
    @RequiresPermissions("system:garbage:remove")
    @Log(title = "垃圾公司", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(enterprisesGarbageService.deleteEnterprisesGarbageByIds(ids));
    }
}
