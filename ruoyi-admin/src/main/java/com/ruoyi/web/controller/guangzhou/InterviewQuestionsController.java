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
import com.ruoyi.system.domain.InterviewQuestions;
import com.ruoyi.system.service.IInterviewQuestionsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 面试问题Controller
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Controller
@RequestMapping("/system/questions")
public class InterviewQuestionsController extends BaseController
{
    private String prefix = "system/questions";

    @Autowired
    private IInterviewQuestionsService interviewQuestionsService;

    @RequiresPermissions("system:questions:view")
    @GetMapping()
    public String questions()
    {
        return prefix + "/questions";
    }

    /**
     * 查询面试问题列表
     */
    @RequiresPermissions("system:questions:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InterviewQuestions interviewQuestions)
    {
        startPage();
        List<InterviewQuestions> list = interviewQuestionsService.selectInterviewQuestionsList(interviewQuestions);
        return getDataTable(list);
    }

    /**
     * 导出面试问题列表
     */
    @RequiresPermissions("system:questions:export")
    @Log(title = "面试问题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InterviewQuestions interviewQuestions)
    {
        List<InterviewQuestions> list = interviewQuestionsService.selectInterviewQuestionsList(interviewQuestions);
        ExcelUtil<InterviewQuestions> util = new ExcelUtil<InterviewQuestions>(InterviewQuestions.class);
        return util.exportExcel(list, "questions");
    }

    /**
     * 新增面试问题
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存面试问题
     */
    @RequiresPermissions("system:questions:add")
    @Log(title = "面试问题", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InterviewQuestions interviewQuestions)
    {
        return toAjax(interviewQuestionsService.insertInterviewQuestions(interviewQuestions));
    }

    /**
     * 修改面试问题
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InterviewQuestions interviewQuestions = interviewQuestionsService.selectInterviewQuestionsById(id);
        mmap.put("interviewQuestions", interviewQuestions);
        return prefix + "/edit";
    }

    /**
     * 修改保存面试问题
     */
    @RequiresPermissions("system:questions:edit")
    @Log(title = "面试问题", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InterviewQuestions interviewQuestions)
    {
        return toAjax(interviewQuestionsService.updateInterviewQuestions(interviewQuestions));
    }

    /**
     * 删除面试问题
     */
    @RequiresPermissions("system:questions:remove")
    @Log(title = "面试问题", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(interviewQuestionsService.deleteInterviewQuestionsByIds(ids));
    }
}
