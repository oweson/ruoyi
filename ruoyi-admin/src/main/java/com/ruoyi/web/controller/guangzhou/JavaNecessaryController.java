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
import com.ruoyi.system.domain.JavaNecessary;
import com.ruoyi.system.service.IJavaNecessaryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 求职技术Controller
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Controller
@RequestMapping("/system/necessary")
public class JavaNecessaryController extends BaseController
{
    private String prefix = "system/necessary";

    @Autowired
    private IJavaNecessaryService javaNecessaryService;

    @RequiresPermissions("system:necessary:view")
    @GetMapping()
    public String necessary()
    {
        return prefix + "/necessary";
    }

    /**
     * 查询求职技术列表
     */
    @RequiresPermissions("system:necessary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JavaNecessary javaNecessary)
    {
        startPage();
        List<JavaNecessary> list = javaNecessaryService.selectJavaNecessaryList(javaNecessary);
        return getDataTable(list);
    }

    /**
     * 导出求职技术列表
     */
    @RequiresPermissions("system:necessary:export")
    @Log(title = "求职技术", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JavaNecessary javaNecessary)
    {
        List<JavaNecessary> list = javaNecessaryService.selectJavaNecessaryList(javaNecessary);
        ExcelUtil<JavaNecessary> util = new ExcelUtil<JavaNecessary>(JavaNecessary.class);
        return util.exportExcel(list, "necessary");
    }

    /**
     * 新增求职技术
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存求职技术
     */
    @RequiresPermissions("system:necessary:add")
    @Log(title = "求职技术", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JavaNecessary javaNecessary)
    {
        return toAjax(javaNecessaryService.insertJavaNecessary(javaNecessary));
    }

    /**
     * 修改求职技术
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        JavaNecessary javaNecessary = javaNecessaryService.selectJavaNecessaryById(id);
        mmap.put("javaNecessary", javaNecessary);
        return prefix + "/edit";
    }

    /**
     * 修改保存求职技术
     */
    @RequiresPermissions("system:necessary:edit")
    @Log(title = "求职技术", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JavaNecessary javaNecessary)
    {
        return toAjax(javaNecessaryService.updateJavaNecessary(javaNecessary));
    }

    /**
     * 删除求职技术
     */
    @RequiresPermissions("system:necessary:remove")
    @Log(title = "求职技术", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(javaNecessaryService.deleteJavaNecessaryByIds(ids));
    }
}
