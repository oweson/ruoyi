package com.ruoyi.web.controller.oweson.demo;

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
import com.ruoyi.system.domain.GithubProject;
import com.ruoyi.system.service.IGithubProjectService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * github项目Controller
 * 
 * @author ruoyi
 * @date 2020-02-07
 */
@Controller
@RequestMapping("/system/project")
public class GithubProjectController extends BaseController
{
    private String prefix = "system/project";

    @Autowired
    private IGithubProjectService githubProjectService;

    @RequiresPermissions("system:project:view")
    @GetMapping()
    public String project()
    {
        return prefix + "/project";
    }

    /**
     * 查询github项目列表
     */
    @RequiresPermissions("system:project:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GithubProject githubProject)
    {
        startPage();
        List<GithubProject> list = githubProjectService.selectGithubProjectList(githubProject);
        return getDataTable(list);
    }

    /**
     * 导出github项目列表
     */
    @RequiresPermissions("system:project:export")
    @Log(title = "github项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GithubProject githubProject)
    {
        List<GithubProject> list = githubProjectService.selectGithubProjectList(githubProject);
        ExcelUtil<GithubProject> util = new ExcelUtil<GithubProject>(GithubProject.class);
        return util.exportExcel(list, "project");
    }

    /**
     * 新增github项目
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存github项目
     */
    @RequiresPermissions("system:project:add")
    @Log(title = "github项目", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GithubProject githubProject)
    {
        return toAjax(githubProjectService.insertGithubProject(githubProject));
    }

    /**
     * 修改github项目
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GithubProject githubProject = githubProjectService.selectGithubProjectById(id);
        mmap.put("githubProject", githubProject);
        return prefix + "/edit";
    }

    /**
     * 修改保存github项目
     */
    @RequiresPermissions("system:project:edit")
    @Log(title = "github项目", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GithubProject githubProject)
    {
        return toAjax(githubProjectService.updateGithubProject(githubProject));
    }

    /**
     * 删除github项目
     */
    @RequiresPermissions("system:project:remove")
    @Log(title = "github项目", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(githubProjectService.deleteGithubProjectByIds(ids));
    }
}
