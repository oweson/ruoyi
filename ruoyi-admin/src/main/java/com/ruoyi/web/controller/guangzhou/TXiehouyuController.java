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
import com.ruoyi.system.domain.TXiehouyu;
import com.ruoyi.system.service.ITXiehouyuService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 歇后语Controller
 * 
 * @author ruoyi
 * @date 2021-05-16
 */
@Controller
@RequestMapping("/system/xiehouyu")
public class TXiehouyuController extends BaseController
{
    private String prefix = "system/xiehouyu";

    @Autowired
    private ITXiehouyuService tXiehouyuService;

    @RequiresPermissions("system:xiehouyu:view")
    @GetMapping()
    public String xiehouyu()
    {
        return prefix + "/xiehouyu";
    }

    /**
     * 查询歇后语列表
     */
    @RequiresPermissions("system:xiehouyu:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TXiehouyu tXiehouyu)
    {
        startPage();
        List<TXiehouyu> list = tXiehouyuService.selectTXiehouyuList(tXiehouyu);
        return getDataTable(list);
    }

    /**
     * 导出歇后语列表
     */
    @RequiresPermissions("system:xiehouyu:export")
    @Log(title = "歇后语", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TXiehouyu tXiehouyu)
    {
        List<TXiehouyu> list = tXiehouyuService.selectTXiehouyuList(tXiehouyu);
        ExcelUtil<TXiehouyu> util = new ExcelUtil<TXiehouyu>(TXiehouyu.class);
        return util.exportExcel(list, "歇后语数据");
    }

    /**
     * 新增歇后语
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存歇后语
     */
    @RequiresPermissions("system:xiehouyu:add")
    @Log(title = "歇后语", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TXiehouyu tXiehouyu)
    {
        return toAjax(tXiehouyuService.insertTXiehouyu(tXiehouyu));
    }

    /**
     * 修改歇后语
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TXiehouyu tXiehouyu = tXiehouyuService.selectTXiehouyuById(id);
        mmap.put("tXiehouyu", tXiehouyu);
        return prefix + "/edit";
    }

    /**
     * 修改保存歇后语
     */
    @RequiresPermissions("system:xiehouyu:edit")
    @Log(title = "歇后语", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TXiehouyu tXiehouyu)
    {
        return toAjax(tXiehouyuService.updateTXiehouyu(tXiehouyu));
    }

    /**
     * 删除歇后语
     */
    @RequiresPermissions("system:xiehouyu:remove")
    @Log(title = "歇后语", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tXiehouyuService.deleteTXiehouyuByIds(ids));
    }
}
