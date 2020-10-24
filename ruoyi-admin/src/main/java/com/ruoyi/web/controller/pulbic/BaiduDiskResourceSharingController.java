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
import com.ruoyi.system.domain.BaiduDiskResourceSharing;
import com.ruoyi.system.service.IBaiduDiskResourceSharingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 资源分享Controller
 * 
 * @author oweson
 * @date 2020-10-24
 */
@Controller
@RequestMapping("/system/sharing")
public class BaiduDiskResourceSharingController extends BaseController
{
    private String prefix = "system/sharing";

    @Autowired
    private IBaiduDiskResourceSharingService baiduDiskResourceSharingService;

    @RequiresPermissions("system:sharing:view")
    @GetMapping()
    public String sharing()
    {
        return prefix + "/sharing";
    }

    /**
     * 查询资源分享列表
     */
    @RequiresPermissions("system:sharing:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BaiduDiskResourceSharing baiduDiskResourceSharing)
    {
        startPage();
        List<BaiduDiskResourceSharing> list = baiduDiskResourceSharingService.selectBaiduDiskResourceSharingList(baiduDiskResourceSharing);
        return getDataTable(list);
    }

    /**
     * 导出资源分享列表
     */
    @RequiresPermissions("system:sharing:export")
    @Log(title = "资源分享", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BaiduDiskResourceSharing baiduDiskResourceSharing)
    {
        List<BaiduDiskResourceSharing> list = baiduDiskResourceSharingService.selectBaiduDiskResourceSharingList(baiduDiskResourceSharing);
        ExcelUtil<BaiduDiskResourceSharing> util = new ExcelUtil<BaiduDiskResourceSharing>(BaiduDiskResourceSharing.class);
        return util.exportExcel(list, "sharing");
    }

    /**
     * 新增资源分享
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存资源分享
     */
    @RequiresPermissions("system:sharing:add")
    @Log(title = "资源分享", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BaiduDiskResourceSharing baiduDiskResourceSharing)
    {
        return toAjax(baiduDiskResourceSharingService.insertBaiduDiskResourceSharing(baiduDiskResourceSharing));
    }

    /**
     * 修改资源分享
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BaiduDiskResourceSharing baiduDiskResourceSharing = baiduDiskResourceSharingService.selectBaiduDiskResourceSharingById(id);
        mmap.put("baiduDiskResourceSharing", baiduDiskResourceSharing);
        return prefix + "/edit";
    }

    /**
     * 修改保存资源分享
     */
    @RequiresPermissions("system:sharing:edit")
    @Log(title = "资源分享", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BaiduDiskResourceSharing baiduDiskResourceSharing)
    {
        return toAjax(baiduDiskResourceSharingService.updateBaiduDiskResourceSharing(baiduDiskResourceSharing));
    }

    /**
     * 删除资源分享
     */
    @RequiresPermissions("system:sharing:remove")
    @Log(title = "资源分享", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(baiduDiskResourceSharingService.deleteBaiduDiskResourceSharingByIds(ids));
    }
}
