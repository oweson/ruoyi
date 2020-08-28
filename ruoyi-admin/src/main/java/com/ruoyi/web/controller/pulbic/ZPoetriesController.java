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
import com.ruoyi.system.domain.ZPoetries;
import com.ruoyi.system.service.IZPoetriesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 诗歌数据库Controller
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
@Controller
@RequestMapping("/system/poetries")
public class ZPoetriesController extends BaseController
{
    private String prefix = "system/poetries";

    @Autowired
    private IZPoetriesService zPoetriesService;

    @RequiresPermissions("system:poetries:view")
    @GetMapping()
    public String poetries()
    {
        return prefix + "/poetries";
    }

    /**
     * 查询诗歌数据库列表
     */
    @RequiresPermissions("system:poetries:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZPoetries zPoetries)
    {
        startPage();
        List<ZPoetries> list = zPoetriesService.selectZPoetriesList(zPoetries);
        return getDataTable(list);
    }

    /**
     * 导出诗歌数据库列表
     */
    @RequiresPermissions("system:poetries:export")
    @Log(title = "诗歌数据库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ZPoetries zPoetries)
    {
        List<ZPoetries> list = zPoetriesService.selectZPoetriesList(zPoetries);
        ExcelUtil<ZPoetries> util = new ExcelUtil<ZPoetries>(ZPoetries.class);
        return util.exportExcel(list, "poetries");
    }

    /**
     * 新增诗歌数据库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存诗歌数据库
     */
    @RequiresPermissions("system:poetries:add")
    @Log(title = "诗歌数据库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ZPoetries zPoetries)
    {
        return toAjax(zPoetriesService.insertZPoetries(zPoetries));
    }

    /**
     * 修改诗歌数据库
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ZPoetries zPoetries = zPoetriesService.selectZPoetriesById(id);
        mmap.put("zPoetries", zPoetries);
        return prefix + "/edit";
    }

    /**
     * 修改保存诗歌数据库
     */
    @RequiresPermissions("system:poetries:edit")
    @Log(title = "诗歌数据库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZPoetries zPoetries)
    {
        return toAjax(zPoetriesService.updateZPoetries(zPoetries));
    }

    /**
     * 删除诗歌数据库
     */
    @RequiresPermissions("system:poetries:remove")
    @Log(title = "诗歌数据库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(zPoetriesService.deleteZPoetriesByIds(ids));
    }
}
