package com.ruoyi.web.controller.pulbic;

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
import com.ruoyi.system.domain.Strategy;
import com.ruoyi.system.service.IStrategyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收藏Controller
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
@Controller
@RequestMapping("/system/strategy")
public class StrategyController extends BaseController
{
    private String prefix = "system/strategy";

    @Autowired
    private IStrategyService strategyService;

    @RequiresPermissions("system:strategy:view")
    @GetMapping()
    public String strategy()
    {
        return prefix + "/strategy";
    }

    /**
     * 查询收藏列表
     */
    @RequiresPermissions("system:strategy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Strategy strategy)
    {
        startPage();
        List<Strategy> list = strategyService.selectStrategyList(strategy);
        return getDataTable(list);
    }

    /**
     * 导出收藏列表
     */
    @RequiresPermissions("system:strategy:export")
    @Log(title = "收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Strategy strategy)
    {
        List<Strategy> list = strategyService.selectStrategyList(strategy);
        ExcelUtil<Strategy> util = new ExcelUtil<Strategy>(Strategy.class);
        return util.exportExcel(list, "strategy");
    }

    /**
     * 新增收藏
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存收藏
     */
    @RequiresPermissions("system:strategy:add")
    @Log(title = "收藏", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Strategy strategy)
    {
        return toAjax(strategyService.insertStrategy(strategy));
    }

    /**
     * 修改收藏
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Strategy strategy = strategyService.selectStrategyById(id);
        mmap.put("strategy", strategy);
        return prefix + "/edit";
    }

    /**
     * 修改保存收藏
     */
    @RequiresPermissions("system:strategy:edit")
    @Log(title = "收藏", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Strategy strategy)
    {
        return toAjax(strategyService.updateStrategy(strategy));
    }

    /**
     * 删除收藏
     */
    @RequiresPermissions("system:strategy:remove")
    @Log(title = "收藏", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(strategyService.deleteStrategyByIds(ids));
    }
}
