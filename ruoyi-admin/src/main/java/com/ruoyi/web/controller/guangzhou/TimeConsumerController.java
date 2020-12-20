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
import com.ruoyi.system.domain.TimeConsumer;
import com.ruoyi.system.service.ITimeConsumerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 时间管理Controller
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
@Controller
@RequestMapping("/system/consumer")
public class TimeConsumerController extends BaseController
{
    private String prefix = "system/consumer";

    @Autowired
    private ITimeConsumerService timeConsumerService;

    @RequiresPermissions("system:consumer:view")
    @GetMapping()
    public String consumer()
    {
        return prefix + "/consumer";
    }

    /**
     * 查询时间管理树列表
     */
    @RequiresPermissions("system:consumer:list")
    @PostMapping("/list")
    @ResponseBody
    public List<TimeConsumer> list(TimeConsumer timeConsumer)
    {
        List<TimeConsumer> list = timeConsumerService.selectTimeConsumerList(timeConsumer);
        return list;
    }

    /**
     * 导出时间管理列表
     */
    @RequiresPermissions("system:consumer:export")
    @Log(title = "时间管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TimeConsumer timeConsumer)
    {
        List<TimeConsumer> list = timeConsumerService.selectTimeConsumerList(timeConsumer);
        ExcelUtil<TimeConsumer> util = new ExcelUtil<TimeConsumer>(TimeConsumer.class);
        return util.exportExcel(list, "consumer");
    }

    /**
     * 新增时间管理
     */
    @GetMapping(value = { "/add/{id}", "/add/" })
    public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
    {
        if (StringUtils.isNotNull(id))
        {
            mmap.put("timeConsumer", timeConsumerService.selectTimeConsumerById(id));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存时间管理
     */
    @RequiresPermissions("system:consumer:add")
    @Log(title = "时间管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TimeConsumer timeConsumer)
    {
        return toAjax(timeConsumerService.insertTimeConsumer(timeConsumer));
    }

    /**
     * 修改时间管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TimeConsumer timeConsumer = timeConsumerService.selectTimeConsumerById(id);
        mmap.put("timeConsumer", timeConsumer);
        return prefix + "/edit";
    }

    /**
     * 修改保存时间管理
     */
    @RequiresPermissions("system:consumer:edit")
    @Log(title = "时间管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TimeConsumer timeConsumer)
    {
        return toAjax(timeConsumerService.updateTimeConsumer(timeConsumer));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:consumer:remove")
    @Log(title = "时间管理", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("id") Long id)
    {
        return toAjax(timeConsumerService.deleteTimeConsumerById(id));
    }

    /**
     * 选择时间管理树
     */
    @GetMapping(value = { "/selectConsumerTree/{id}", "/selectConsumerTree/" })
    public String selectConsumerTree(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
    {
        if (StringUtils.isNotNull(id))
        {
            mmap.put("timeConsumer", timeConsumerService.selectTimeConsumerById(id));
        }
        return prefix + "/tree";
    }

    /**
     * 加载时间管理树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
        List<Ztree> ztrees = timeConsumerService.selectTimeConsumerTree();
        return ztrees;
    }
}
