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
import com.ruoyi.system.domain.ProjectError;
import com.ruoyi.system.service.IProjectErrorService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目中遇到的错误详情记录Controller
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
@Controller
@RequestMapping("/system/error")
public class ProjectErrorController extends BaseController
{
    private String prefix = "system/error";

    @Autowired
    private IProjectErrorService projectErrorService;

    @RequiresPermissions("system:error:view")
    @GetMapping()
    public String error01()
    {
        return prefix + "/error";
    }

    /**
     * 查询项目中遇到的错误详情记录列表
     */
    @RequiresPermissions("system:error:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProjectError projectError)
    {
        startPage();
        List<ProjectError> list = projectErrorService.selectProjectErrorList(projectError);
        return getDataTable(list);
    }

    /**
     * 导出项目中遇到的错误详情记录列表
     */
    @RequiresPermissions("system:error:export")
    @Log(title = "项目中遇到的错误详情记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProjectError projectError)
    {
        List<ProjectError> list = projectErrorService.selectProjectErrorList(projectError);
        ExcelUtil<ProjectError> util = new ExcelUtil<ProjectError>(ProjectError.class);
        return util.exportExcel(list, "error");
    }

    /**
     * 新增项目中遇到的错误详情记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存项目中遇到的错误详情记录
     */
    @RequiresPermissions("system:error:add")
    @Log(title = "项目中遇到的错误详情记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProjectError projectError)
    {
        return toAjax(projectErrorService.insertProjectError(projectError));
    }

    /**
     * 修改项目中遇到的错误详情记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ProjectError projectError = projectErrorService.selectProjectErrorById(id);
        mmap.put("projectError", projectError);
        return prefix + "/edit";
    }

    /**
     * 修改保存项目中遇到的错误详情记录
     */
    @RequiresPermissions("system:error:edit")
    @Log(title = "项目中遇到的错误详情记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProjectError projectError)
    {
        return toAjax(projectErrorService.updateProjectError(projectError));
    }

    /**
     * 删除项目中遇到的错误详情记录
     */
    @RequiresPermissions("system:error:remove")
    @Log(title = "项目中遇到的错误详情记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(projectErrorService.deleteProjectErrorByIds(ids));
    }
}
