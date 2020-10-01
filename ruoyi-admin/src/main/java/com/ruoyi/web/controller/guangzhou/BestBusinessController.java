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
import com.ruoyi.system.domain.BestBusiness;
import com.ruoyi.system.service.IBestBusinessService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 优秀公司关注Controller
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Controller
@RequestMapping("/system/business")
public class BestBusinessController extends BaseController
{
    private String prefix = "system/business";

    @Autowired
    private IBestBusinessService bestBusinessService;

    @RequiresPermissions("system:business:view")
    @GetMapping()
    public String business()
    {
        return prefix + "/business";
    }

    /**
     * 查询优秀公司关注列表
     */
    @RequiresPermissions("system:business:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BestBusiness bestBusiness)
    {
        startPage();
        List<BestBusiness> list = bestBusinessService.selectBestBusinessList(bestBusiness);
        return getDataTable(list);
    }

    /**
     * 导出优秀公司关注列表
     */
    @RequiresPermissions("system:business:export")
    @Log(title = "优秀公司关注", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BestBusiness bestBusiness)
    {
        List<BestBusiness> list = bestBusinessService.selectBestBusinessList(bestBusiness);
        ExcelUtil<BestBusiness> util = new ExcelUtil<BestBusiness>(BestBusiness.class);
        return util.exportExcel(list, "business");
    }

    /**
     * 新增优秀公司关注
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存优秀公司关注
     */
    @RequiresPermissions("system:business:add")
    @Log(title = "优秀公司关注", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BestBusiness bestBusiness)
    {
        return toAjax(bestBusinessService.insertBestBusiness(bestBusiness));
    }

    /**
     * 修改优秀公司关注
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        BestBusiness bestBusiness = bestBusinessService.selectBestBusinessById(id);
        mmap.put("bestBusiness", bestBusiness);
        return prefix + "/edit";
    }

    /**
     * 修改保存优秀公司关注
     */
    @RequiresPermissions("system:business:edit")
    @Log(title = "优秀公司关注", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BestBusiness bestBusiness)
    {
        return toAjax(bestBusinessService.updateBestBusiness(bestBusiness));
    }

    /**
     * 删除优秀公司关注
     */
    @RequiresPermissions("system:business:remove")
    @Log(title = "优秀公司关注", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bestBusinessService.deleteBestBusinessByIds(ids));
    }
}
