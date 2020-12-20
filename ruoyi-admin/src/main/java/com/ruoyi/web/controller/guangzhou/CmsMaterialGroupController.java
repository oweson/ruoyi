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
import com.ruoyi.system.domain.CmsMaterialGroup;
import com.ruoyi.system.service.ICmsMaterialGroupService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 素材Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/system/group")
public class CmsMaterialGroupController extends BaseController
{
    private String prefix = "system/group";

    @Autowired
    private ICmsMaterialGroupService cmsMaterialGroupService;

    @RequiresPermissions("system:group:view")
    @GetMapping()
    public String group()
    {
        return prefix + "/group";
    }

    /**
     * 查询素材树列表
     */
    @RequiresPermissions("system:group:list")
    @PostMapping("/list")
    @ResponseBody
    public List<CmsMaterialGroup> list(CmsMaterialGroup cmsMaterialGroup)
    {
        List<CmsMaterialGroup> list = cmsMaterialGroupService.selectCmsMaterialGroupList(cmsMaterialGroup);
        return list;
    }

    /**
     * 导出素材列表
     */
    @RequiresPermissions("system:group:export")
    @Log(title = "素材", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CmsMaterialGroup cmsMaterialGroup)
    {
        List<CmsMaterialGroup> list = cmsMaterialGroupService.selectCmsMaterialGroupList(cmsMaterialGroup);
        ExcelUtil<CmsMaterialGroup> util = new ExcelUtil<CmsMaterialGroup>(CmsMaterialGroup.class);
        return util.exportExcel(list, "group");
    }

    /**
     * 新增素材
     */
    @GetMapping(value = { "/add/{groupId}", "/add/" })
    public String add(@PathVariable(value = "groupId", required = false) Long groupId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(groupId))
        {
            mmap.put("cmsMaterialGroup", cmsMaterialGroupService.selectCmsMaterialGroupById(groupId));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存素材
     */
    @RequiresPermissions("system:group:add")
    @Log(title = "素材", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CmsMaterialGroup cmsMaterialGroup)
    {
        return toAjax(cmsMaterialGroupService.insertCmsMaterialGroup(cmsMaterialGroup));
    }

    /**
     * 修改素材
     */
    @GetMapping("/edit/{groupId}")
    public String edit(@PathVariable("groupId") Long groupId, ModelMap mmap)
    {
        CmsMaterialGroup cmsMaterialGroup = cmsMaterialGroupService.selectCmsMaterialGroupById(groupId);
        mmap.put("cmsMaterialGroup", cmsMaterialGroup);
        return prefix + "/edit";
    }

    /**
     * 修改保存素材
     */
    @RequiresPermissions("system:group:edit")
    @Log(title = "素材", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CmsMaterialGroup cmsMaterialGroup)
    {
        return toAjax(cmsMaterialGroupService.updateCmsMaterialGroup(cmsMaterialGroup));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:group:remove")
    @Log(title = "素材", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{groupId}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("groupId") Long groupId)
    {
        return toAjax(cmsMaterialGroupService.deleteCmsMaterialGroupById(groupId));
    }

    /**
     * 选择素材树
     */
    @GetMapping(value = { "/selectGroupTree/{groupId}", "/selectGroupTree/" })
    public String selectGroupTree(@PathVariable(value = "groupId", required = false) Long groupId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(groupId))
        {
            mmap.put("cmsMaterialGroup", cmsMaterialGroupService.selectCmsMaterialGroupById(groupId));
        }
        return prefix + "/tree";
    }

    /**
     * 加载素材树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
        List<Ztree> ztrees = cmsMaterialGroupService.selectCmsMaterialGroupTree();
        return ztrees;
    }
}
