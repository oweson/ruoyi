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
import com.ruoyi.system.domain.BorrowMoney;
import com.ruoyi.system.service.IBorrowMoneyService;
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
@RequestMapping("/system/money")
public class BorrowMoneyController extends BaseController
{
    private String prefix = "system/money";

    @Autowired
    private IBorrowMoneyService borrowMoneyService;

    @RequiresPermissions("system:money:view")
    @GetMapping()
    public String money()
    {
        return prefix + "/money";
    }

    /**
     * 查询borrow_money列表
     */
    @RequiresPermissions("system:money:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BorrowMoney borrowMoney)
    {
        startPage();
        List<BorrowMoney> list = borrowMoneyService.selectBorrowMoneyList(borrowMoney);
        return getDataTable(list);
    }

    /**
     * 导出borrow_money列表
     */
    @RequiresPermissions("system:money:export")
    @Log(title = "borrow_money", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BorrowMoney borrowMoney)
    {
        List<BorrowMoney> list = borrowMoneyService.selectBorrowMoneyList(borrowMoney);
        ExcelUtil<BorrowMoney> util = new ExcelUtil<BorrowMoney>(BorrowMoney.class);
        return util.exportExcel(list, "money");
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
    @RequiresPermissions("system:money:add")
    @Log(title = "borrow_money", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BorrowMoney borrowMoney)
    {
        return toAjax(borrowMoneyService.insertBorrowMoney(borrowMoney));
    }

    /**
     * 修改borrow_money
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BorrowMoney borrowMoney = borrowMoneyService.selectBorrowMoneyById(id);
        mmap.put("borrowMoney", borrowMoney);
        return prefix + "/edit";
    }

    /**
     * 修改保存borrow_money
     */
    @RequiresPermissions("system:money:edit")
    @Log(title = "borrow_money", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BorrowMoney borrowMoney)
    {
        return toAjax(borrowMoneyService.updateBorrowMoney(borrowMoney));
    }

    /**
     * 删除borrow_money
     */
    @RequiresPermissions("system:money:remove")
    @Log(title = "borrow_money", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(borrowMoneyService.deleteBorrowMoneyByIds(ids));
    }
}
