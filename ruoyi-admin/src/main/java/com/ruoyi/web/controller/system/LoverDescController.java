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
import com.ruoyi.system.domain.LoverDesc;
import com.ruoyi.system.service.ILoverDescService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 求偶标准Controller
 * 
 * @author ruoyi
 * @date 2020-04-04
 */
@Controller
@RequestMapping("/system/desc")
public class LoverDescController extends BaseController
{
    private String prefix = "system/desc";

    @Autowired
    private ILoverDescService loverDescService;

    @RequiresPermissions("system:desc:view")
    @GetMapping()
    public String desc()
    {
        return prefix + "/desc";
    }

    /**
     * 查询求偶标准列表
     */
    @RequiresPermissions("system:desc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoverDesc loverDesc)
    {
        startPage();
        List<LoverDesc> list = loverDescService.selectLoverDescList(loverDesc);
        return getDataTable(list);
    }

    /**
     * 导出求偶标准列表
     */
    @RequiresPermissions("system:desc:export")
    @Log(title = "求偶标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoverDesc loverDesc)
    {
        List<LoverDesc> list = loverDescService.selectLoverDescList(loverDesc);
        ExcelUtil<LoverDesc> util = new ExcelUtil<LoverDesc>(LoverDesc.class);
        return util.exportExcel(list, "desc");
    }

    /**
     * 新增求偶标准
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存求偶标准
     */
    @RequiresPermissions("system:desc:add")
    @Log(title = "求偶标准", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoverDesc loverDesc)
    {
        return toAjax(loverDescService.insertLoverDesc(loverDesc));
    }

    /**
     * 修改求偶标准
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LoverDesc loverDesc = loverDescService.selectLoverDescById(id);
        mmap.put("loverDesc", loverDesc);
        return prefix + "/edit";
    }

    /**
     * 修改保存求偶标准
     */
    @RequiresPermissions("system:desc:edit")
    @Log(title = "求偶标准", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoverDesc loverDesc)
    {
        return toAjax(loverDescService.updateLoverDesc(loverDesc));
    }

    /**
     * 删除求偶标准
     */
    @RequiresPermissions("system:desc:remove")
    @Log(title = "求偶标准", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(loverDescService.deleteLoverDescByIds(ids));
    }
}
