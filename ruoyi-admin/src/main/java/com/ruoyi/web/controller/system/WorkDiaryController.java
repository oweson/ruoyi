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
import com.ruoyi.system.domain.WorkDiary;
import com.ruoyi.system.service.IWorkDiaryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工作日报Controller
 * 
 * @author ruoyi
 * @date 2020-12-22
 */
@Controller
@RequestMapping("/system/diary")
public class WorkDiaryController extends BaseController
{
    private String prefix = "system/diary";

    @Autowired
    private IWorkDiaryService workDiaryService;

    @RequiresPermissions("system:diary:view")
    @GetMapping()
    public String diary()
    {
        return prefix + "/diary";
    }

    /**
     * 查询工作日报列表
     */
    @RequiresPermissions("system:diary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WorkDiary workDiary)
    {
        startPage();
        List<WorkDiary> list = workDiaryService.selectWorkDiaryList(workDiary);
        return getDataTable(list);
    }

    /**
     * 导出工作日报列表
     */
    @RequiresPermissions("system:diary:export")
    @Log(title = "工作日报", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WorkDiary workDiary)
    {
        List<WorkDiary> list = workDiaryService.selectWorkDiaryList(workDiary);
        ExcelUtil<WorkDiary> util = new ExcelUtil<WorkDiary>(WorkDiary.class);
        return util.exportExcel(list, "diary");
    }

    /**
     * 新增工作日报
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工作日报
     */
    @RequiresPermissions("system:diary:add")
    @Log(title = "工作日报", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WorkDiary workDiary)
    {
        return toAjax(workDiaryService.insertWorkDiary(workDiary));
    }

    /**
     * 修改工作日报
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        WorkDiary workDiary = workDiaryService.selectWorkDiaryById(id);
        mmap.put("workDiary", workDiary);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作日报
     */
    @RequiresPermissions("system:diary:edit")
    @Log(title = "工作日报", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WorkDiary workDiary)
    {
        return toAjax(workDiaryService.updateWorkDiary(workDiary));
    }

    /**
     * 删除工作日报
     */
    @RequiresPermissions("system:diary:remove")
    @Log(title = "工作日报", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(workDiaryService.deleteWorkDiaryByIds(ids));
    }
}
