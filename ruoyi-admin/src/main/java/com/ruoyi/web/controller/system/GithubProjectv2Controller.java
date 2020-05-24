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
import com.ruoyi.system.domain.GithubProjectv2;
import com.ruoyi.system.service.IGithubProjectv2Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * github_v2项目Controller
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
@Controller
@RequestMapping("/system/projectv2")
public class GithubProjectv2Controller extends BaseController
{
    private String prefix = "system/projectv2";

    @Autowired
    private IGithubProjectv2Service githubProjectv2Service;

    @RequiresPermissions("system:projectv2:view")
    @GetMapping()
    public String projectv2()
    {
        return prefix + "/projectv2";
    }

    /**
     * 查询github_v2项目列表
     */
    @RequiresPermissions("system:projectv2:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GithubProjectv2 githubProjectv2)
    {
        startPage();
        List<GithubProjectv2> list = githubProjectv2Service.selectGithubProjectv2List(githubProjectv2);
        return getDataTable(list);
    }

    /**
     * 导出github_v2项目列表
     */
    @RequiresPermissions("system:projectv2:export")
    @Log(title = "github_v2项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GithubProjectv2 githubProjectv2)
    {
        List<GithubProjectv2> list = githubProjectv2Service.selectGithubProjectv2List(githubProjectv2);
        ExcelUtil<GithubProjectv2> util = new ExcelUtil<GithubProjectv2>(GithubProjectv2.class);
        return util.exportExcel(list, "projectv2");
    }

    /**
     * 新增github_v2项目
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存github_v2项目
     */
    @RequiresPermissions("system:projectv2:add")
    @Log(title = "github_v2项目", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GithubProjectv2 githubProjectv2)
    {
        return toAjax(githubProjectv2Service.insertGithubProjectv2(githubProjectv2));
    }

    /**
     * 修改github_v2项目
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GithubProjectv2 githubProjectv2 = githubProjectv2Service.selectGithubProjectv2ById(id);
        mmap.put("githubProjectv2", githubProjectv2);
        return prefix + "/edit";
    }

    /**
     * 修改保存github_v2项目
     */
    @RequiresPermissions("system:projectv2:edit")
    @Log(title = "github_v2项目", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GithubProjectv2 githubProjectv2)
    {
        return toAjax(githubProjectv2Service.updateGithubProjectv2(githubProjectv2));
    }

    /**
     * 删除github_v2项目
     */
    @RequiresPermissions("system:projectv2:remove")
    @Log(title = "github_v2项目", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(githubProjectv2Service.deleteGithubProjectv2ByIds(ids));
    }
}
