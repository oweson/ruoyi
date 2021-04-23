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
import com.ruoyi.system.domain.WorkExperience;
import com.ruoyi.system.service.IWorkExperienceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工作经历Controller
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
@Controller
@RequestMapping("/system/experience")
public class WorkExperienceController extends BaseController
{
    private String prefix = "system/experience";

    @Autowired
    private IWorkExperienceService workExperienceService;

    @RequiresPermissions("system:experience:view")
    @GetMapping()
    public String experience()
    {
        return prefix + "/experience";
    }

    /**
     * 查询工作经历列表
     */
    @RequiresPermissions("system:experience:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WorkExperience workExperience)
    {
        startPage();
        List<WorkExperience> list = workExperienceService.selectWorkExperienceList(workExperience);
        return getDataTable(list);
    }

    /**
     * 导出工作经历列表
     */
    @RequiresPermissions("system:experience:export")
    @Log(title = "工作经历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WorkExperience workExperience)
    {
        List<WorkExperience> list = workExperienceService.selectWorkExperienceList(workExperience);
        ExcelUtil<WorkExperience> util = new ExcelUtil<WorkExperience>(WorkExperience.class);
        return util.exportExcel(list, "工作经历数据");
    }

    /**
     * 新增工作经历
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工作经历
     */
    @RequiresPermissions("system:experience:add")
    @Log(title = "工作经历", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WorkExperience workExperience)
    {
        return toAjax(workExperienceService.insertWorkExperience(workExperience));
    }

    /**
     * 修改工作经历
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        WorkExperience workExperience = workExperienceService.selectWorkExperienceById(id);
        mmap.put("workExperience", workExperience);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作经历
     */
    @RequiresPermissions("system:experience:edit")
    @Log(title = "工作经历", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WorkExperience workExperience)
    {
        return toAjax(workExperienceService.updateWorkExperience(workExperience));
    }

    /**
     * 删除工作经历
     */
    @RequiresPermissions("system:experience:remove")
    @Log(title = "工作经历", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(workExperienceService.deleteWorkExperienceByIds(ids));
    }
}
