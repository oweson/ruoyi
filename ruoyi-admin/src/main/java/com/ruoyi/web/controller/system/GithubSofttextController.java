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
import com.ruoyi.system.domain.GithubSofttext;
import com.ruoyi.system.service.IGithubSofttextService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 软文Controller
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Controller
@RequestMapping("/system/softtext")
public class GithubSofttextController extends BaseController
{
    private String prefix = "system/softtext";

    @Autowired
    private IGithubSofttextService githubSofttextService;

    @RequiresPermissions("system:softtext:view")
    @GetMapping()
    public String softtext()
    {
        return prefix + "/softtext";
    }

    /**
     * 查询软文列表
     */
    @RequiresPermissions("system:softtext:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GithubSofttext githubSofttext)
    {
        startPage();
        List<GithubSofttext> list = githubSofttextService.selectGithubSofttextList(githubSofttext);
        return getDataTable(list);
    }

    /**
     * 导出软文列表
     */
    @RequiresPermissions("system:softtext:export")
    @Log(title = "软文", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GithubSofttext githubSofttext)
    {
        List<GithubSofttext> list = githubSofttextService.selectGithubSofttextList(githubSofttext);
        ExcelUtil<GithubSofttext> util = new ExcelUtil<GithubSofttext>(GithubSofttext.class);
        return util.exportExcel(list, "softtext");
    }

    /**
     * 新增软文
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存软文
     */
    @RequiresPermissions("system:softtext:add")
    @Log(title = "软文", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GithubSofttext githubSofttext)
    {
        return toAjax(githubSofttextService.insertGithubSofttext(githubSofttext));
    }

    /**
     * 修改软文
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GithubSofttext githubSofttext = githubSofttextService.selectGithubSofttextById(id);
        mmap.put("githubSofttext", githubSofttext);
        return prefix + "/edit";
    }

    /**
     * 修改保存软文
     */
    @RequiresPermissions("system:softtext:edit")
    @Log(title = "软文", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GithubSofttext githubSofttext)
    {
        return toAjax(githubSofttextService.updateGithubSofttext(githubSofttext));
    }

    /**
     * 删除软文
     */
    @RequiresPermissions("system:softtext:remove")
    @Log(title = "软文", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(githubSofttextService.deleteGithubSofttextByIds(ids));
    }
}
