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
import com.ruoyi.system.domain.LifeAchievement;
import com.ruoyi.system.service.ILifeAchievementService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 每天成就Controller
 * 
 * @author ruoyi
 * @date 2021-05-03
 */
@Controller
@RequestMapping("/system/achievement")
public class LifeAchievementController extends BaseController
{
    private String prefix = "system/achievement";

    @Autowired
    private ILifeAchievementService lifeAchievementService;

    @RequiresPermissions("system:achievement:view")
    @GetMapping()
    public String achievement()
    {
        return prefix + "/achievement";
    }

    /**
     * 查询每天成就列表
     */
    @RequiresPermissions("system:achievement:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LifeAchievement lifeAchievement)
    {
        startPage();
        List<LifeAchievement> list = lifeAchievementService.selectLifeAchievementList(lifeAchievement);
        return getDataTable(list);
    }

    /**
     * 导出每天成就列表
     */
    @RequiresPermissions("system:achievement:export")
    @Log(title = "每天成就", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LifeAchievement lifeAchievement)
    {
        List<LifeAchievement> list = lifeAchievementService.selectLifeAchievementList(lifeAchievement);
        ExcelUtil<LifeAchievement> util = new ExcelUtil<LifeAchievement>(LifeAchievement.class);
        return util.exportExcel(list, "每天成就数据");
    }

    /**
     * 新增每天成就
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存每天成就
     */
    @RequiresPermissions("system:achievement:add")
    @Log(title = "每天成就", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LifeAchievement lifeAchievement)
    {
        return toAjax(lifeAchievementService.insertLifeAchievement(lifeAchievement));
    }

    /**
     * 修改每天成就
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LifeAchievement lifeAchievement = lifeAchievementService.selectLifeAchievementById(id);
        mmap.put("lifeAchievement", lifeAchievement);
        return prefix + "/edit";
    }

    /**
     * 修改保存每天成就
     */
    @RequiresPermissions("system:achievement:edit")
    @Log(title = "每天成就", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LifeAchievement lifeAchievement)
    {
        return toAjax(lifeAchievementService.updateLifeAchievement(lifeAchievement));
    }

    /**
     * 删除每天成就
     */
    @RequiresPermissions("system:achievement:remove")
    @Log(title = "每天成就", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lifeAchievementService.deleteLifeAchievementByIds(ids));
    }
}
