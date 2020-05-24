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
import com.ruoyi.system.domain.ThreadTransferAccounts;
import com.ruoyi.system.service.IThreadTransferAccountsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 并发测试线程安全用户交易测试Controller
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Controller
@RequestMapping("/system/accounts")
public class ThreadTransferAccountsController extends BaseController
{
    private String prefix = "system/accounts";

    @Autowired
    private IThreadTransferAccountsService threadTransferAccountsService;

    @RequiresPermissions("system:accounts:view")
    @GetMapping()
    public String accounts()
    {
        return prefix + "/accounts";
    }

    /**
     * 查询并发测试线程安全用户交易测试列表
     */
    @RequiresPermissions("system:accounts:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ThreadTransferAccounts threadTransferAccounts)
    {
        startPage();
        List<ThreadTransferAccounts> list = threadTransferAccountsService.selectThreadTransferAccountsList(threadTransferAccounts);
        return getDataTable(list);
    }

    /**
     * 导出并发测试线程安全用户交易测试列表
     */
    @RequiresPermissions("system:accounts:export")
    @Log(title = "并发测试线程安全用户交易测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ThreadTransferAccounts threadTransferAccounts)
    {
        List<ThreadTransferAccounts> list = threadTransferAccountsService.selectThreadTransferAccountsList(threadTransferAccounts);
        ExcelUtil<ThreadTransferAccounts> util = new ExcelUtil<ThreadTransferAccounts>(ThreadTransferAccounts.class);
        return util.exportExcel(list, "accounts");
    }

    /**
     * 新增并发测试线程安全用户交易测试
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存并发测试线程安全用户交易测试
     */
    @RequiresPermissions("system:accounts:add")
    @Log(title = "并发测试线程安全用户交易测试", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ThreadTransferAccounts threadTransferAccounts)
    {
        return toAjax(threadTransferAccountsService.insertThreadTransferAccounts(threadTransferAccounts));
    }

    /**
     * 修改并发测试线程安全用户交易测试
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ThreadTransferAccounts threadTransferAccounts = threadTransferAccountsService.selectThreadTransferAccountsById(id);
        mmap.put("threadTransferAccounts", threadTransferAccounts);
        return prefix + "/edit";
    }

    /**
     * 修改保存并发测试线程安全用户交易测试
     */
    @RequiresPermissions("system:accounts:edit")
    @Log(title = "并发测试线程安全用户交易测试", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ThreadTransferAccounts threadTransferAccounts)
    {
        return toAjax(threadTransferAccountsService.updateThreadTransferAccounts(threadTransferAccounts));
    }

    /**
     * 删除并发测试线程安全用户交易测试
     */
    @RequiresPermissions("system:accounts:remove")
    @Log(title = "并发测试线程安全用户交易测试", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(threadTransferAccountsService.deleteThreadTransferAccountsByIds(ids));
    }
}
