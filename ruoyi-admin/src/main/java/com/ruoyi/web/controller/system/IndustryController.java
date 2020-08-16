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
import com.ruoyi.system.domain.Industry;
import com.ruoyi.system.service.IIndustryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * industryController
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
@Controller
@RequestMapping("/system/industry")
public class IndustryController extends BaseController
{
    private String prefix = "system/industry";

    @Autowired
    private IIndustryService industryService;

    @RequiresPermissions("system:industry:view")
    @GetMapping()
    public String industry()
    {
        return prefix + "/industry";
    }

    /**
     * 查询industry列表
     */
    @RequiresPermissions("system:industry:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Industry industry)
    {
        startPage();
        List<Industry> list = industryService.selectIndustryList(industry);
        return getDataTable(list);
    }

    /**
     * 导出industry列表
     */
    @RequiresPermissions("system:industry:export")
    @Log(title = "industry", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Industry industry)
    {
        List<Industry> list = industryService.selectIndustryList(industry);
        ExcelUtil<Industry> util = new ExcelUtil<Industry>(Industry.class);
        return util.exportExcel(list, "industry");
    }

    /**
     * 新增industry
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存industry
     */
    @RequiresPermissions("system:industry:add")
    @Log(title = "industry", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Industry industry)
    {
        return toAjax(industryService.insertIndustry(industry));
    }

    /**
     * 修改industry
     */
    @GetMapping("/edit/{code}")
    public String edit(@PathVariable("code") String code, ModelMap mmap)
    {
        Industry industry = industryService.selectIndustryById(code);
        mmap.put("industry", industry);
        return prefix + "/edit";
    }

    /**
     * 修改保存industry
     */
    @RequiresPermissions("system:industry:edit")
    @Log(title = "industry", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Industry industry)
    {
        return toAjax(industryService.updateIndustry(industry));
    }

    /**
     * 删除industry
     */
    @RequiresPermissions("system:industry:remove")
    @Log(title = "industry", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(industryService.deleteIndustryByIds(ids));
    }
}
