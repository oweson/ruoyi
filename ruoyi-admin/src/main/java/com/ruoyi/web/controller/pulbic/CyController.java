package com.ruoyi.web.controller.pulbic;

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
import com.ruoyi.system.domain.Cy;
import com.ruoyi.system.service.ICyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 成语Controller
 * 
 * @author ruoyi
 * @date 2020-09-25
 */
@Controller
@RequestMapping("/system/cy")
public class CyController extends BaseController
{
    private String prefix = "system/cy";

    @Autowired
    private ICyService cyService;

    @RequiresPermissions("system:cy:view")
    @GetMapping()
    public String cy()
    {
        return prefix + "/cy";
    }

    /**
     * 查询成语列表
     */
    @RequiresPermissions("system:cy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Cy cy)
    {
        startPage();
        List<Cy> list = cyService.selectCyList(cy);
        return getDataTable(list);
    }

    /**
     * 导出成语列表
     */
    @RequiresPermissions("system:cy:export")
    @Log(title = "成语", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Cy cy)
    {
        List<Cy> list = cyService.selectCyList(cy);
        ExcelUtil<Cy> util = new ExcelUtil<Cy>(Cy.class);
        return util.exportExcel(list, "cy");
    }

    /**
     * 新增成语
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存成语
     */
    @RequiresPermissions("system:cy:add")
    @Log(title = "成语", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Cy cy)
    {
        return toAjax(cyService.insertCy(cy));
    }

    /**
     * 修改成语
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Cy cy = cyService.selectCyById(id);
        mmap.put("cy", cy);
        return prefix + "/edit";
    }

    /**
     * 修改保存成语
     */
    @RequiresPermissions("system:cy:edit")
    @Log(title = "成语", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Cy cy)
    {
        return toAjax(cyService.updateCy(cy));
    }

    /**
     * 删除成语
     */
    @RequiresPermissions("system:cy:remove")
    @Log(title = "成语", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cyService.deleteCyByIds(ids));
    }
}
