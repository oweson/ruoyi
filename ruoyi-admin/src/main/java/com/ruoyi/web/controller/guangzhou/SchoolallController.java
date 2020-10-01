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
import com.ruoyi.system.domain.Schoolall;
import com.ruoyi.system.service.ISchoolallService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 高校查询终极版Controller
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
@Controller
@RequestMapping("/system/schoolall")
public class SchoolallController extends BaseController
{
    private String prefix = "system/schoolall";

    @Autowired
    private ISchoolallService schoolallService;

    @RequiresPermissions("system:schoolall:view")
    @GetMapping()
    public String schoolall()
    {
        return prefix + "/schoolall";
    }

    /**
     * 查询高校查询终极版列表
     */
    @RequiresPermissions("system:schoolall:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Schoolall schoolall)
    {
        startPage();
        List<Schoolall> list = schoolallService.selectSchoolallList(schoolall);
        return getDataTable(list);
    }

    /**
     * 导出高校查询终极版列表
     */
    @RequiresPermissions("system:schoolall:export")
    @Log(title = "高校查询终极版", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Schoolall schoolall)
    {
        List<Schoolall> list = schoolallService.selectSchoolallList(schoolall);
        ExcelUtil<Schoolall> util = new ExcelUtil<Schoolall>(Schoolall.class);
        return util.exportExcel(list, "schoolall");
    }

    /**
     * 新增高校查询终极版
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高校查询终极版
     */
    @RequiresPermissions("system:schoolall:add")
    @Log(title = "高校查询终极版", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Schoolall schoolall)
    {
        return toAjax(schoolallService.insertSchoolall(schoolall));
    }

    /**
     * 修改高校查询终极版
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Schoolall schoolall = schoolallService.selectSchoolallById(id);
        mmap.put("schoolall", schoolall);
        return prefix + "/edit";
    }

    /**
     * 修改保存高校查询终极版
     */
    @RequiresPermissions("system:schoolall:edit")
    @Log(title = "高校查询终极版", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Schoolall schoolall)
    {
        return toAjax(schoolallService.updateSchoolall(schoolall));
    }

    /**
     * 删除高校查询终极版
     */
    @RequiresPermissions("system:schoolall:remove")
    @Log(title = "高校查询终极版", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolallService.deleteSchoolallByIds(ids));
    }
}
