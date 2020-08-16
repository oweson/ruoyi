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
import com.ruoyi.system.domain.Mobile;
import com.ruoyi.system.service.IMobileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 全国手机号码段归属地Controller
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
@Controller
@RequestMapping("/system/mobile")
public class MobileController extends BaseController
{
    private String prefix = "system/mobile";

    @Autowired
    private IMobileService mobileService;

    @RequiresPermissions("system:mobile:view")
    @GetMapping()
    public String mobile()
    {
        return prefix + "/mobile";
    }

    /**
     * 查询全国手机号码段归属地列表
     */
    @RequiresPermissions("system:mobile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Mobile mobile)
    {
        startPage();
        List<Mobile> list = mobileService.selectMobileList(mobile);
        return getDataTable(list);
    }

    /**
     * 导出全国手机号码段归属地列表
     */
    @RequiresPermissions("system:mobile:export")
    @Log(title = "全国手机号码段归属地", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Mobile mobile)
    {
        List<Mobile> list = mobileService.selectMobileList(mobile);
        ExcelUtil<Mobile> util = new ExcelUtil<Mobile>(Mobile.class);
        return util.exportExcel(list, "mobile");
    }

    /**
     * 新增全国手机号码段归属地
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存全国手机号码段归属地
     */
    @RequiresPermissions("system:mobile:add")
    @Log(title = "全国手机号码段归属地", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Mobile mobile)
    {
        return toAjax(mobileService.insertMobile(mobile));
    }

    /**
     * 修改全国手机号码段归属地
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Mobile mobile = mobileService.selectMobileById(id);
        mmap.put("mobile", mobile);
        return prefix + "/edit";
    }

    /**
     * 修改保存全国手机号码段归属地
     */
    @RequiresPermissions("system:mobile:edit")
    @Log(title = "全国手机号码段归属地", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Mobile mobile)
    {
        return toAjax(mobileService.updateMobile(mobile));
    }

    /**
     * 删除全国手机号码段归属地
     */
    @RequiresPermissions("system:mobile:remove")
    @Log(title = "全国手机号码段归属地", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mobileService.deleteMobileByIds(ids));
    }
}
