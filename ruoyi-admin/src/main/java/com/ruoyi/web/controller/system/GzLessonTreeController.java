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
import com.ruoyi.system.domain.GzLessonTree;
import com.ruoyi.system.service.IGzLessonTreeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 经验教训Controller
 * 
 * @author ruoyi
 * @date 2020-08-14
 */
@Controller
@RequestMapping("/system/tree")
public class GzLessonTreeController extends BaseController
{
    private String prefix = "system/tree";

    @Autowired
    private IGzLessonTreeService gzLessonTreeService;

    @RequiresPermissions("system:tree:view")
    @GetMapping()
    public String tree()
    {
        return prefix + "/tree";
    }

    /**
     * 查询经验教训树列表
     */
    @RequiresPermissions("system:tree:list")
    @PostMapping("/list")
    @ResponseBody
    public List<GzLessonTree> list(GzLessonTree gzLessonTree)
    {
        List<GzLessonTree> list = gzLessonTreeService.selectGzLessonTreeList(gzLessonTree);
        return list;
    }

    /**
     * 导出经验教训列表
     */
    @RequiresPermissions("system:tree:export")
    @Log(title = "经验教训", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GzLessonTree gzLessonTree)
    {
        List<GzLessonTree> list = gzLessonTreeService.selectGzLessonTreeList(gzLessonTree);
        ExcelUtil<GzLessonTree> util = new ExcelUtil<GzLessonTree>(GzLessonTree.class);
        return util.exportExcel(list, "tree");
    }

    /**
     * 新增经验教训
     */
    @GetMapping(value = { "/add/{id}", "/add/" })
    public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
    {
        if (StringUtils.isNotNull(id))
        {
            mmap.put("gzLessonTree", gzLessonTreeService.selectGzLessonTreeById(id));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存经验教训
     */
    @RequiresPermissions("system:tree:add")
    @Log(title = "经验教训", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GzLessonTree gzLessonTree)
    {
        return toAjax(gzLessonTreeService.insertGzLessonTree(gzLessonTree));
    }

    /**
     * 修改经验教训
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GzLessonTree gzLessonTree = gzLessonTreeService.selectGzLessonTreeById(id);
        mmap.put("gzLessonTree", gzLessonTree);
        return prefix + "/edit";
    }

    /**
     * 修改保存经验教训
     */
    @RequiresPermissions("system:tree:edit")
    @Log(title = "经验教训", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GzLessonTree gzLessonTree)
    {
        return toAjax(gzLessonTreeService.updateGzLessonTree(gzLessonTree));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:tree:remove")
    @Log(title = "经验教训", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("id") Long id)
    {
        return toAjax(gzLessonTreeService.deleteGzLessonTreeById(id));
    }

    /**
     * 选择经验教训树
     */
    @GetMapping(value = { "/selectTreeTree/{id}", "/selectTreeTree/" })
    public String selectTreeTree(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
    {
        if (StringUtils.isNotNull(id))
        {
            mmap.put("gzLessonTree", gzLessonTreeService.selectGzLessonTreeById(id));
        }
        return prefix + "/tree";
    }

    /**
     * 加载经验教训树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
        List<Ztree> ztrees = gzLessonTreeService.selectGzLessonTreeTree();
        return ztrees;
    }
}
