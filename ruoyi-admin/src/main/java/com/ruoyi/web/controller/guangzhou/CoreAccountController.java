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
import com.ruoyi.system.domain.CoreAccount;
import com.ruoyi.system.service.ICoreAccountService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 账号管理Controller
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
@Controller
@RequestMapping("/system/account")
public class CoreAccountController extends BaseController
{
    private String prefix = "system/account";

    @Autowired
    private ICoreAccountService coreAccountService;

    @RequiresPermissions("system:account:view")
    @GetMapping()
    public String account()
    {
        return prefix + "/account";
    }

    /**
     * 查询账号管理列表
     */
    @RequiresPermissions("system:account:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CoreAccount coreAccount)
    {
        startPage();
        List<CoreAccount> list = coreAccountService.selectCoreAccountList(coreAccount);
        return getDataTable(list);
    }

    /**
     * 导出账号管理列表
     */
    @RequiresPermissions("system:account:export")
    @Log(title = "账号管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CoreAccount coreAccount)
    {
        List<CoreAccount> list = coreAccountService.selectCoreAccountList(coreAccount);
        ExcelUtil<CoreAccount> util = new ExcelUtil<CoreAccount>(CoreAccount.class);
        return util.exportExcel(list, "账号管理数据");
    }

    /**
     * 新增账号管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存账号管理
     */
    @RequiresPermissions("system:account:add")
    @Log(title = "账号管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CoreAccount coreAccount)
    {
        return toAjax(coreAccountService.insertCoreAccount(coreAccount));
    }

    /**
     * 修改账号管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        CoreAccount coreAccount = coreAccountService.selectCoreAccountById(id);
        mmap.put("coreAccount", coreAccount);
        return prefix + "/edit";
    }

    /**
     * 修改保存账号管理
     */
    @RequiresPermissions("system:account:edit")
    @Log(title = "账号管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CoreAccount coreAccount)
    {
        return toAjax(coreAccountService.updateCoreAccount(coreAccount));
    }

    /**
     * 删除账号管理
     */
    @RequiresPermissions("system:account:remove")
    @Log(title = "账号管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(coreAccountService.deleteCoreAccountByIds(ids));
    }
}
