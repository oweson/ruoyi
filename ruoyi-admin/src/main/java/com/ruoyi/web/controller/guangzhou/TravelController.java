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
import com.ruoyi.system.domain.Travel;
import com.ruoyi.system.service.ITravelService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 旅游Controller
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
@Controller
@RequestMapping("/system/travel")
public class TravelController extends BaseController
{
    private String prefix = "system/travel";

    @Autowired
    private ITravelService travelService;

    @RequiresPermissions("system:travel:view")
    @GetMapping()
    public String travel()
    {
        return prefix + "/travel";
    }

    /**
     * 查询旅游列表
     */
    @RequiresPermissions("system:travel:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Travel travel)
    {
        //System.out.println(1/0);
        startPage();
        List<Travel> list = travelService.selectTravelList(travel);
        return getDataTable(list);
    }

    /**
     * 导出旅游列表
     */
    @RequiresPermissions("system:travel:export")
    @Log(title = "旅游", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Travel travel)
    {
        List<Travel> list = travelService.selectTravelList(travel);
        ExcelUtil<Travel> util = new ExcelUtil<Travel>(Travel.class);
        return util.exportExcel(list, "travel");
    }

    /**
     * 新增旅游
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存旅游
     */
    @RequiresPermissions("system:travel:add")
    @Log(title = "旅游", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Travel travel)
    {
        return toAjax(travelService.insertTravel(travel));
    }

    /**
     * 修改旅游
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Travel travel = travelService.selectTravelById(id);
        mmap.put("travel", travel);
        return prefix + "/edit";
    }

    /**
     * 修改保存旅游
     */
    @RequiresPermissions("system:travel:edit")
    @Log(title = "旅游", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Travel travel)
    {
        return toAjax(travelService.updateTravel(travel));
    }

    /**
     * 删除旅游
     */
    @RequiresPermissions("system:travel:remove")
    @Log(title = "旅游", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(travelService.deleteTravelByIds(ids));
    }
}
