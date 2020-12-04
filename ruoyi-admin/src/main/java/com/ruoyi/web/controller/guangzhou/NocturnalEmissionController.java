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
import com.ruoyi.system.domain.NocturnalEmission;
import com.ruoyi.system.service.INocturnalEmissionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 遗精记录Controller
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Controller
@RequestMapping("/system/emission")
public class NocturnalEmissionController extends BaseController
{
    private String prefix = "system/emission";

    @Autowired
    private INocturnalEmissionService nocturnalEmissionService;

    @RequiresPermissions("system:emission:view")
    @GetMapping()
    public String emission()
    {
        return prefix + "/emission";
    }

    /**
     * 查询遗精记录列表
     */
    @RequiresPermissions("system:emission:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NocturnalEmission nocturnalEmission)
    {
        startPage();
        List<NocturnalEmission> list = nocturnalEmissionService.selectNocturnalEmissionList(nocturnalEmission);
        return getDataTable(list);
    }

    /**
     * 导出遗精记录列表
     */
    @RequiresPermissions("system:emission:export")
    @Log(title = "遗精记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NocturnalEmission nocturnalEmission)
    {
        List<NocturnalEmission> list = nocturnalEmissionService.selectNocturnalEmissionList(nocturnalEmission);
        ExcelUtil<NocturnalEmission> util = new ExcelUtil<NocturnalEmission>(NocturnalEmission.class);
        return util.exportExcel(list, "emission");
    }

    /**
     * 新增遗精记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存遗精记录
     */
    @RequiresPermissions("system:emission:add")
    @Log(title = "遗精记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NocturnalEmission nocturnalEmission)
    {
        return toAjax(nocturnalEmissionService.insertNocturnalEmission(nocturnalEmission));
    }

    /**
     * 修改遗精记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NocturnalEmission nocturnalEmission = nocturnalEmissionService.selectNocturnalEmissionById(id);
        mmap.put("nocturnalEmission", nocturnalEmission);
        return prefix + "/edit";
    }

    /**
     * 修改保存遗精记录
     */
    @RequiresPermissions("system:emission:edit")
    @Log(title = "遗精记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NocturnalEmission nocturnalEmission)
    {
        return toAjax(nocturnalEmissionService.updateNocturnalEmission(nocturnalEmission));
    }

    /**
     * 删除遗精记录
     */
    @RequiresPermissions("system:emission:remove")
    @Log(title = "遗精记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nocturnalEmissionService.deleteNocturnalEmissionByIds(ids));
    }
}
