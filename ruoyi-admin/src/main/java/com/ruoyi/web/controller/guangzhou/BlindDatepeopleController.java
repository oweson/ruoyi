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
import com.ruoyi.system.domain.BlindDatepeople;
import com.ruoyi.system.service.IBlindDatepeopleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 恋爱人员Controller
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Controller
@RequestMapping("/system/datepeople")
public class BlindDatepeopleController extends BaseController
{
    private String prefix = "system/datepeople";

    @Autowired
    private IBlindDatepeopleService blindDatepeopleService;

    @RequiresPermissions("system:datepeople:view")
    @GetMapping()
    public String datepeople()
    {
        return prefix + "/datepeople";
    }

    /**
     * 查询恋爱人员列表
     */
    @RequiresPermissions("system:datepeople:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlindDatepeople blindDatepeople)
    {
        startPage();
        List<BlindDatepeople> list = blindDatepeopleService.selectBlindDatepeopleList(blindDatepeople);
        return getDataTable(list);
    }

    /**
     * 导出恋爱人员列表
     */
    @RequiresPermissions("system:datepeople:export")
    @Log(title = "恋爱人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlindDatepeople blindDatepeople)
    {
        List<BlindDatepeople> list = blindDatepeopleService.selectBlindDatepeopleList(blindDatepeople);
        ExcelUtil<BlindDatepeople> util = new ExcelUtil<BlindDatepeople>(BlindDatepeople.class);
        return util.exportExcel(list, "datepeople");
    }

    /**
     * 新增恋爱人员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存恋爱人员
     */
    @RequiresPermissions("system:datepeople:add")
    @Log(title = "恋爱人员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlindDatepeople blindDatepeople)
    {
        return toAjax(blindDatepeopleService.insertBlindDatepeople(blindDatepeople));
    }

    /**
     * 修改恋爱人员
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BlindDatepeople blindDatepeople = blindDatepeopleService.selectBlindDatepeopleById(id);
        mmap.put("blindDatepeople", blindDatepeople);
        return prefix + "/edit";
    }

    /**
     * 修改保存恋爱人员
     */
    @RequiresPermissions("system:datepeople:edit")
    @Log(title = "恋爱人员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlindDatepeople blindDatepeople)
    {
        return toAjax(blindDatepeopleService.updateBlindDatepeople(blindDatepeople));
    }

    /**
     * 删除恋爱人员
     */
    @RequiresPermissions("system:datepeople:remove")
    @Log(title = "恋爱人员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blindDatepeopleService.deleteBlindDatepeopleByIds(ids));
    }
}
