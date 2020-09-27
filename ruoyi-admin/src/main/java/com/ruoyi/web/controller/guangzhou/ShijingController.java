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
import com.ruoyi.system.domain.Shijing;
import com.ruoyi.system.service.IShijingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * shijingController
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Controller
@RequestMapping("/system/shijing")
public class ShijingController extends BaseController
{
    private String prefix = "system/shijing";

    @Autowired
    private IShijingService shijingService;

    @RequiresPermissions("system:shijing:view")
    @GetMapping()
    public String shijing()
    {
        return prefix + "/shijing";
    }

    /**
     * 查询shijing列表
     */
    @RequiresPermissions("system:shijing:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Shijing shijing)
    {
        startPage();
        List<Shijing> list = shijingService.selectShijingList(shijing);
        return getDataTable(list);
    }

    /**
     * 导出shijing列表
     */
    @RequiresPermissions("system:shijing:export")
    @Log(title = "shijing", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Shijing shijing)
    {
        List<Shijing> list = shijingService.selectShijingList(shijing);
        ExcelUtil<Shijing> util = new ExcelUtil<Shijing>(Shijing.class);
        return util.exportExcel(list, "shijing");
    }

    /**
     * 新增shijing
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存shijing
     */
    @RequiresPermissions("system:shijing:add")
    @Log(title = "shijing", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Shijing shijing)
    {
        return toAjax(shijingService.insertShijing(shijing));
    }

    /**
     * 修改shijing
     */
    @GetMapping("/edit/{title}")
    public String edit(@PathVariable("title") String title, ModelMap mmap)
    {
        Shijing shijing = shijingService.selectShijingById(title);
        mmap.put("shijing", shijing);
        return prefix + "/edit";
    }

    /**
     * 修改保存shijing
     */
    @RequiresPermissions("system:shijing:edit")
    @Log(title = "shijing", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Shijing shijing)
    {
        return toAjax(shijingService.updateShijing(shijing));
    }

    /**
     * 删除shijing
     */
    @RequiresPermissions("system:shijing:remove")
    @Log(title = "shijing", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(shijingService.deleteShijingByIds(ids));
    }
}
