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
import com.ruoyi.system.domain.CnInfoRegion;
import com.ruoyi.system.service.ICnInfoRegionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 中国地区信息Controller
 * 
 * @author ruoyi
 * @date 2021-01-26
 */
@Controller
@RequestMapping("/system/region")
public class CnInfoRegionController extends BaseController
{
    private String prefix = "system/region";

    @Autowired
    private ICnInfoRegionService cnInfoRegionService;

    @RequiresPermissions("system:region:view")
    @GetMapping()
    public String region()
    {
        return prefix + "/region";
    }

    /**
     * 查询中国地区信息树列表
     */
    @RequiresPermissions("system:region:list")
    @PostMapping("/list")
    @ResponseBody
    public List<CnInfoRegion> list(CnInfoRegion cnInfoRegion)
    {
        startPage();
        List<CnInfoRegion> list = cnInfoRegionService.selectCnInfoRegionList(cnInfoRegion);
        return list;
    }

    /**
     * 导出中国地区信息列表
     */
    @RequiresPermissions("system:region:export")
    @Log(title = "中国地区信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CnInfoRegion cnInfoRegion)
    {
        List<CnInfoRegion> list = cnInfoRegionService.selectCnInfoRegionList(cnInfoRegion);
        ExcelUtil<CnInfoRegion> util = new ExcelUtil<CnInfoRegion>(CnInfoRegion.class);
        return util.exportExcel(list, "region");
    }

    /**
     * 新增中国地区信息
     */
    @GetMapping(value = { "/add/{criId}", "/add/" })
    public String add(@PathVariable(value = "criId", required = false) Long criId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(criId))
        {
            mmap.put("cnInfoRegion", cnInfoRegionService.selectCnInfoRegionById(criId));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存中国地区信息
     */
    @RequiresPermissions("system:region:add")
    @Log(title = "中国地区信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CnInfoRegion cnInfoRegion)
    {
        return toAjax(cnInfoRegionService.insertCnInfoRegion(cnInfoRegion));
    }

    /**
     * 修改中国地区信息
     */
    @GetMapping("/edit/{criId}")
    public String edit(@PathVariable("criId") Long criId, ModelMap mmap)
    {
        CnInfoRegion cnInfoRegion = cnInfoRegionService.selectCnInfoRegionById(criId);
        mmap.put("cnInfoRegion", cnInfoRegion);
        return prefix + "/edit";
    }

    /**
     * 修改保存中国地区信息
     */
    @RequiresPermissions("system:region:edit")
    @Log(title = "中国地区信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CnInfoRegion cnInfoRegion)
    {
        return toAjax(cnInfoRegionService.updateCnInfoRegion(cnInfoRegion));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:region:remove")
    @Log(title = "中国地区信息", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{criId}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("criId") Long criId)
    {
        return toAjax(cnInfoRegionService.deleteCnInfoRegionById(criId));
    }

    /**
     * 选择中国地区信息树
     */
    @GetMapping(value = { "/selectRegionTree/{criId}", "/selectRegionTree/" })
    public String selectRegionTree(@PathVariable(value = "criId", required = false) Long criId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(criId))
        {
            mmap.put("cnInfoRegion", cnInfoRegionService.selectCnInfoRegionById(criId));
        }
        return prefix + "/tree";
    }

    /**
     * 加载中国地区信息树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
        List<Ztree> ztrees = cnInfoRegionService.selectCnInfoRegionTree();
        return ztrees;
    }
}
