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
import com.ruoyi.system.domain.DbBackups;
import com.ruoyi.system.service.IDbBackupsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * borrow_moneyController
 * 
 * @author ruoyi
 * @date 2020-11-23
 */
@Controller
@RequestMapping("/system/backups")
public class DbBackupsController extends BaseController
{
    private String prefix = "system/backups";

    @Autowired
    private IDbBackupsService dbBackupsService;

    @RequiresPermissions("system:backups:view")
    @GetMapping()
    public String backups()
    {
        return prefix + "/backups";
    }

    /**
     * 查询borrow_money列表
     */
    @RequiresPermissions("system:backups:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DbBackups dbBackups)
    {
        startPage();
        List<DbBackups> list = dbBackupsService.selectDbBackupsList(dbBackups);
        return getDataTable(list);
    }

    /**
     * 导出borrow_money列表
     */
    @RequiresPermissions("system:backups:export")
    @Log(title = "borrow_money", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DbBackups dbBackups)
    {
        List<DbBackups> list = dbBackupsService.selectDbBackupsList(dbBackups);
        ExcelUtil<DbBackups> util = new ExcelUtil<DbBackups>(DbBackups.class);
        return util.exportExcel(list, "backups");
    }

    /**
     * 新增borrow_money
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存borrow_money
     */
    @RequiresPermissions("system:backups:add")
    @Log(title = "borrow_money", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DbBackups dbBackups)
    {
        return toAjax(dbBackupsService.insertDbBackups(dbBackups));
    }

    /**
     * 修改borrow_money
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DbBackups dbBackups = dbBackupsService.selectDbBackupsById(id);
        mmap.put("dbBackups", dbBackups);
        return prefix + "/edit";
    }

    /**
     * 修改保存borrow_money
     */
    @RequiresPermissions("system:backups:edit")
    @Log(title = "borrow_money", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DbBackups dbBackups)
    {
        return toAjax(dbBackupsService.updateDbBackups(dbBackups));
    }

    /**
     * 删除borrow_money
     */
    @RequiresPermissions("system:backups:remove")
    @Log(title = "borrow_money", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dbBackupsService.deleteDbBackupsByIds(ids));
    }
    @Log(title = "borrow_money", businessType = BusinessType.DELETE)
    @RequestMapping( "/backupDb")
    @ResponseBody
    public AjaxResult backupsDb(String id)
    {
        return toAjax(dbBackupsService.backupDB(id));
    }
}
