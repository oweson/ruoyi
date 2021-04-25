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
import com.ruoyi.system.domain.BusinessOpportunity;
import com.ruoyi.system.service.IBusinessOpportunityService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商机管理Controller
 * 
 * @author ruoyi
 * @date 2021-04-24
 */
@Controller
@RequestMapping("/system/opportunity")
public class BusinessOpportunityController extends BaseController
{
    private String prefix = "system/opportunity";

    @Autowired
    private IBusinessOpportunityService businessOpportunityService;

    @RequiresPermissions("system:opportunity:view")
    @GetMapping()
    public String opportunity()
    {
        return prefix + "/opportunity";
    }

    /**
     * 查询商机管理列表
     */
    @RequiresPermissions("system:opportunity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusinessOpportunity businessOpportunity)
    {
        startPage();
        List<BusinessOpportunity> list = businessOpportunityService.selectBusinessOpportunityList(businessOpportunity);
        return getDataTable(list);
    }

    /**
     * 导出商机管理列表
     */
    @RequiresPermissions("system:opportunity:export")
    @Log(title = "商机管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BusinessOpportunity businessOpportunity)
    {
        List<BusinessOpportunity> list = businessOpportunityService.selectBusinessOpportunityList(businessOpportunity);
        ExcelUtil<BusinessOpportunity> util = new ExcelUtil<BusinessOpportunity>(BusinessOpportunity.class);
        return util.exportExcel(list, "商机管理数据");
    }

    /**
     * 新增商机管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商机管理
     */
    @RequiresPermissions("system:opportunity:add")
    @Log(title = "商机管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BusinessOpportunity businessOpportunity)
    {
        return toAjax(businessOpportunityService.insertBusinessOpportunity(businessOpportunity));
    }

    /**
     * 修改商机管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BusinessOpportunity businessOpportunity = businessOpportunityService.selectBusinessOpportunityById(id);
        mmap.put("businessOpportunity", businessOpportunity);
        return prefix + "/edit";
    }

    /**
     * 修改保存商机管理
     */
    @RequiresPermissions("system:opportunity:edit")
    @Log(title = "商机管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusinessOpportunity businessOpportunity)
    {
        return toAjax(businessOpportunityService.updateBusinessOpportunity(businessOpportunity));
    }

    /**
     * 删除商机管理
     */
    @RequiresPermissions("system:opportunity:remove")
    @Log(title = "商机管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(businessOpportunityService.deleteBusinessOpportunityByIds(ids));
    }
}
