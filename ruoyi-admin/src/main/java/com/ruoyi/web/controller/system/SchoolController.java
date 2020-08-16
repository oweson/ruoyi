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
import com.ruoyi.system.domain.School;
import com.ruoyi.system.service.ISchoolService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * schoolController
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
@Controller
@RequestMapping("/system/school")
public class SchoolController extends BaseController
{
    private String prefix = "system/school";

    @Autowired
    private ISchoolService schoolService;

    @RequiresPermissions("system:school:view")
    @GetMapping()
    public String school()
    {
        return prefix + "/school";
    }

    /**
     * 查询school列表
     */
    @RequiresPermissions("system:school:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(School school)
    {
        startPage();
        List<School> list = schoolService.selectSchoolList(school);
        return getDataTable(list);
    }

    /**
     * 导出school列表
     */
    @RequiresPermissions("system:school:export")
    @Log(title = "school", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(School school)
    {
        List<School> list = schoolService.selectSchoolList(school);
        ExcelUtil<School> util = new ExcelUtil<School>(School.class);
        return util.exportExcel(list, "school");
    }

    /**
     * 新增school
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存school
     */
    @RequiresPermissions("system:school:add")
    @Log(title = "school", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(School school)
    {
        return toAjax(schoolService.insertSchool(school));
    }

    /**
     * 修改school
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        School school = schoolService.selectSchoolById(id);
        mmap.put("school", school);
        return prefix + "/edit";
    }

    /**
     * 修改保存school
     */
    @RequiresPermissions("system:school:edit")
    @Log(title = "school", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(School school)
    {
        return toAjax(schoolService.updateSchool(school));
    }

    /**
     * 删除school
     */
    @RequiresPermissions("system:school:remove")
    @Log(title = "school", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolService.deleteSchoolByIds(ids));
    }
}
