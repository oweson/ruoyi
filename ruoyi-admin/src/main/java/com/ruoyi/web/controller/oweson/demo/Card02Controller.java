package com.ruoyi.web.controller.oweson.demo;

import java.util.List;

import com.ruoyi.common.exception.BusinessException;
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
import com.ruoyi.system.domain.Card02;
import com.ruoyi.system.service.ICard02Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

import javax.management.RuntimeOperationsException;

/**
 * 身份证Controller
 *
 * @author ruoyi
 * @date 2020-02-05
 */
@Controller
@RequestMapping("/system/card02")
public class Card02Controller extends BaseController {
    private String prefix = "system/card02";

    @Autowired
    private ICard02Service card02Service;

    @RequiresPermissions("system:card02:view")
    @GetMapping()
    public String card02() {
        return prefix + "/card02";
    }

    /**
     * 查询身份证列表
     */
    @RequiresPermissions("system:card02:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Card02 card02) {
        startPage();
        List<Card02> list = card02Service.selectCard02List(card02);
        return getDataTable(list);
    }

    /**
     * 导出身份证列表
     */
    @RequiresPermissions("system:card02:export")
    @Log(title = "身份证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Card02 card02) {
        List<Card02> list = card02Service.selectCard02List(card02);
        ExcelUtil<Card02> util = new ExcelUtil<Card02>(Card02.class);
        return util.exportExcel(list, "card02");
    }

    /**
     * 新增身份证
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存身份证
     */
    @RequiresPermissions("system:card02:add")
    @Log(title = "身份证", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Card02 card02) {
        Object checkCard = checkCard(card02);
        if (checkCard != null) {
            throw new BusinessException("新增错误： 原因如下：" + checkCard.toString());
        }
        return toAjax(card02Service.insertCard02(card02));
    }

    /**
     * 修改身份证
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        Card02 card02 = card02Service.selectCard02ById(id);
        mmap.put("card02", card02);
        return prefix + "/edit";
    }

    /**
     * 修改保存身份证
     */
    @RequiresPermissions("system:card02:edit")
    @Log(title = "身份证", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Card02 card02) {
        RuntimeException runtimeException=null;
        Object checkCard = checkCard(card02);
        if (checkCard != null) {
            throw new BusinessException("修改错误： 原因如下：" + checkCard.toString());
        }
        return toAjax(card02Service.updateCard02(card02));
    }

    /**
     * 删除身份证
     */
    @RequiresPermissions("system:card02:remove")
    @Log(title = "身份证", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(card02Service.deleteCard02ByIds(ids));
    }

    private Object checkCard(Card02 card02) {
        if (card02 == null) {
            return "card不可为空";
        }
        if (card02.getCode().length() < 6) {
            return "身份证号码太短啦";
        }
        return null;
    }
}
