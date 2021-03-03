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
import com.ruoyi.system.domain.MobileManagephone;
import com.ruoyi.system.service.IMobileManagephoneService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 通讯录管理Controller
 * 
 * @author ruoyi
 * @date 2021-02-28
 */
@Controller
@RequestMapping("/system/managephone")
public class MobileManagephoneController extends BaseController
{
    private String prefix = "system/managephone";

    @Autowired
    private IMobileManagephoneService mobileManagephoneService;

    @RequiresPermissions("system:managephone:view")
    @GetMapping()
    public String managephone()
    {
        return prefix + "/managephone";
    }

    /**
     * 查询通讯录管理列表
     */
    @RequiresPermissions("system:managephone:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MobileManagephone mobileManagephone)
    {
        startPage();
        List<MobileManagephone> list = mobileManagephoneService.selectMobileManagephoneList(mobileManagephone);
        return getDataTable(list);
    }

    /**
     * 导出通讯录管理列表
     */
    @RequiresPermissions("system:managephone:export")
    @Log(title = "通讯录管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MobileManagephone mobileManagephone)
    {
        List<MobileManagephone> list = mobileManagephoneService.selectMobileManagephoneList(mobileManagephone);
        ExcelUtil<MobileManagephone> util = new ExcelUtil<MobileManagephone>(MobileManagephone.class);
        return util.exportExcel(list, "managephone");
    }

    /**
     * 新增通讯录管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存通讯录管理
     */
    @RequiresPermissions("system:managephone:add")
    @Log(title = "通讯录管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MobileManagephone mobileManagephone)
    {
        return toAjax(mobileManagephoneService.insertMobileManagephone(mobileManagephone));
    }

    /**
     * 修改通讯录管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        MobileManagephone mobileManagephone = mobileManagephoneService.selectMobileManagephoneById(id);
        mmap.put("mobileManagephone", mobileManagephone);
        return prefix + "/edit";
    }

    /**
     * 修改保存通讯录管理
     */
    @RequiresPermissions("system:managephone:edit")
    @Log(title = "通讯录管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MobileManagephone mobileManagephone)
    {
        return toAjax(mobileManagephoneService.updateMobileManagephone(mobileManagephone));
    }

    /**
     * 删除通讯录管理
     */
    @RequiresPermissions("system:managephone:remove")
    @Log(title = "通讯录管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mobileManagephoneService.deleteMobileManagephoneByIds(ids));
    }
}
