package com.ruoyi.web.controller.system;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
import com.ruoyi.system.domain.GzLesson;
import com.ruoyi.system.service.IGzLessonService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

import javax.xml.crypto.Data;

/**
 * 经验教训Controller
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
@Controller
@RequestMapping("/system/lesson")
public class GzLessonController extends BaseController
{
    private String prefix = "system/lesson";

    @Autowired
    private IGzLessonService gzLessonService;

    @RequiresPermissions("system:lesson:view")
    @GetMapping()
    public String lesson()
    {
        return prefix + "/lesson";
    }

    /**
     * 查询经验教训列表
     */
    @RequiresPermissions("system:lesson:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GzLesson gzLesson)
    {
//        Map<String, Object> params = gzLesson.getParams();
//        Object beginCreateTime = params.get("beginCreateTime");
//        Object endCreateTime = params.get("endCreateTime");
//        gzLesson.setCreateTime((Date)beginCreateTime);
//        gzLesson.setUpdateTime((Date)endCreateTime);
        startPage();
        List<GzLesson> list = gzLessonService.selectGzLessonList(gzLesson);
        return getDataTable(list);
    }

    /**
     * 导出经验教训列表
     */
    @RequiresPermissions("system:lesson:export")
    @Log(title = "经验教训", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GzLesson gzLesson)
    {
        List<GzLesson> list = gzLessonService.selectGzLessonList(gzLesson);
        ExcelUtil<GzLesson> util = new ExcelUtil<GzLesson>(GzLesson.class);
        return util.exportExcel(list, "lesson");
    }

    /**
     * 新增经验教训
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存经验教训
     */
    @RequiresPermissions("system:lesson:add")
    @Log(title = "经验教训", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GzLesson gzLesson)
    {
        return toAjax(gzLessonService.insertGzLesson(gzLesson));
    }

    /**
     * 修改经验教训
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GzLesson gzLesson = gzLessonService.selectGzLessonById(id);
        mmap.put("gzLesson", gzLesson);
        return prefix + "/edit";
    }

    /**
     * 修改保存经验教训
     */
    @RequiresPermissions("system:lesson:edit")
    @Log(title = "经验教训", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GzLesson gzLesson)
    {
        gzLesson.setLastUpdateTime(new Date());
        return toAjax(gzLessonService.updateGzLesson(gzLesson));
    }

    /**
     * 删除经验教训
     */
    @RequiresPermissions("system:lesson:remove")
    @Log(title = "经验教训", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gzLessonService.deleteGzLessonByIds(ids));
    }
}
