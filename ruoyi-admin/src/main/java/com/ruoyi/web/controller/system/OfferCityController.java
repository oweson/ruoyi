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
import com.ruoyi.system.domain.OfferCity;
import com.ruoyi.system.service.IOfferCityService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 求职Controller
 * 
 * @author ruoyi
 * @date 2020-04-22
 */
@Controller
@RequestMapping("/system/city")
public class OfferCityController extends BaseController
{
    private String prefix = "system/city";

    @Autowired
    private IOfferCityService offerCityService;

    @RequiresPermissions("system:city:view")
    @GetMapping()
    public String city()
    {
        return prefix + "/city";
    }

    /**
     * 查询求职列表
     */
    @RequiresPermissions("system:city:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OfferCity offerCity)
    {
        startPage();
        List<OfferCity> list = offerCityService.selectOfferCityList(offerCity);
        return getDataTable(list);
    }

    /**
     * 导出求职列表
     */
    @RequiresPermissions("system:city:export")
    @Log(title = "求职", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OfferCity offerCity)
    {
        List<OfferCity> list = offerCityService.selectOfferCityList(offerCity);
        ExcelUtil<OfferCity> util = new ExcelUtil<OfferCity>(OfferCity.class);
        return util.exportExcel(list, "city");
    }

    /**
     * 新增求职
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存求职
     */
    @RequiresPermissions("system:city:add")
    @Log(title = "求职", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OfferCity offerCity)
    {
        return toAjax(offerCityService.insertOfferCity(offerCity));
    }

    /**
     * 修改求职
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        OfferCity offerCity = offerCityService.selectOfferCityById(id);
        mmap.put("offerCity", offerCity);
        return prefix + "/edit";
    }

    /**
     * 修改保存求职
     */
    @RequiresPermissions("system:city:edit")
    @Log(title = "求职", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OfferCity offerCity)
    {
        return toAjax(offerCityService.updateOfferCity(offerCity));
    }

    /**
     * 删除求职
     */
    @RequiresPermissions("system:city:remove")
    @Log(title = "求职", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(offerCityService.deleteOfferCityByIds(ids));
    }
}
