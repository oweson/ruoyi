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
import com.ruoyi.system.domain.Mission;
import com.ruoyi.system.service.IMissionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目精锐Controller
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Controller
@RequestMapping("/system/mission")
public class MissionController extends BaseController
{
    private String prefix = "system/mission";

    @Autowired
    private IMissionService missionService;

    @RequiresPermissions("system:mission:view")
    @GetMapping()
    public String mission()
    {
        return prefix + "/mission";
    }

    /**
     * 查询项目精锐列表
     */
    @RequiresPermissions("system:mission:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Mission mission)
    {
        startPage();
        List<Mission> list = missionService.selectMissionList(mission);
        return getDataTable(list);
    }

    /**
     * 导出项目精锐列表
     */
    @RequiresPermissions("system:mission:export")
    @Log(title = "项目精锐", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Mission mission)
    {
        List<Mission> list = missionService.selectMissionList(mission);
        ExcelUtil<Mission> util = new ExcelUtil<Mission>(Mission.class);
        return util.exportExcel(list, "mission");
    }

    /**
     * 新增项目精锐
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存项目精锐
     */
    @RequiresPermissions("system:mission:add")
    @Log(title = "项目精锐", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Mission mission)
    {
        return toAjax(missionService.insertMission(mission));
    }

    /**
     * 修改项目精锐
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Mission mission = missionService.selectMissionById(id);
        mmap.put("mission", mission);
        return prefix + "/edit";
    }

    /**
     * 修改保存项目精锐
     */
    @RequiresPermissions("system:mission:edit")
    @Log(title = "项目精锐", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Mission mission)
    {
        return toAjax(missionService.updateMission(mission));
    }

    /**
     * 删除项目精锐
     */
    @RequiresPermissions("system:mission:remove")
    @Log(title = "项目精锐", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(missionService.deleteMissionByIds(ids));
    }
}
