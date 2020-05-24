package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.system.service.IGithubFeaturev1Service;
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
import com.ruoyi.system.domain.GithubFeaturev1;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * github特色技能描述Controller
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
@Controller
@RequestMapping("/system/featurev1")
public class GithubFeaturev1Controller extends BaseController
{
    private String prefix = "system/featurev1";

    @Autowired
    private IGithubFeaturev1Service githubFeaturev1Service;

    @RequiresPermissions("system:featurev1:view")
    @GetMapping()
    public String featurev1()
    {
        return prefix + "/featurev1";
    }

    /**
     * 查询github特色技能描述列表
     */
    @RequiresPermissions("system:featurev1:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GithubFeaturev1 githubFeaturev1)
    {
        startPage();
        List<GithubFeaturev1> list = githubFeaturev1Service.selectGithubFeaturev1List(githubFeaturev1);
        return getDataTable(list);
    }

    /**
     * 导出github特色技能描述列表
     */
    @RequiresPermissions("system:featurev1:export")
    @Log(title = "github特色技能描述", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GithubFeaturev1 githubFeaturev1)
    {
        List<GithubFeaturev1> list = githubFeaturev1Service.selectGithubFeaturev1List(githubFeaturev1);
        ExcelUtil<GithubFeaturev1> util = new ExcelUtil<GithubFeaturev1>(GithubFeaturev1.class);
        return util.exportExcel(list, "featurev1");
    }

    /**
     * 新增github特色技能描述
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存github特色技能描述
     */
    @RequiresPermissions("system:featurev1:add")
    @Log(title = "github特色技能描述", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GithubFeaturev1 githubFeaturev1)
    {
        return toAjax(githubFeaturev1Service.insertGithubFeaturev1(githubFeaturev1));
    }

    /**
     * 修改github特色技能描述
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GithubFeaturev1 githubFeaturev1 = githubFeaturev1Service.selectGithubFeaturev1ById(id);
        mmap.put("githubFeaturev1", githubFeaturev1);
        return prefix + "/edit";
    }

    /**
     * 修改保存github特色技能描述
     */
    @RequiresPermissions("system:featurev1:edit")
    @Log(title = "github特色技能描述", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GithubFeaturev1 githubFeaturev1)
    {
        return toAjax(githubFeaturev1Service.updateGithubFeaturev1(githubFeaturev1));
    }

    /**
     * 删除github特色技能描述
     */
    @RequiresPermissions("system:featurev1:remove")
    @Log(title = "github特色技能描述", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(githubFeaturev1Service.deleteGithubFeaturev1ByIds(ids));
    }
}
