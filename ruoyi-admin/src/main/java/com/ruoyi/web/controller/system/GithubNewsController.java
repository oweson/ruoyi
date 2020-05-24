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
import com.ruoyi.system.domain.GithubNews;
import com.ruoyi.system.service.IGithubNewsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 新闻Controller
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Controller
@RequestMapping("/system/news")
public class GithubNewsController extends BaseController
{
    private String prefix = "system/news";

    @Autowired
    private IGithubNewsService githubNewsService;

    @RequiresPermissions("system:news:view")
    @GetMapping()
    public String news()
    {
        return prefix + "/news";
    }

    /**
     * 查询新闻列表
     */
    @RequiresPermissions("system:news:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GithubNews githubNews)
    {
        startPage();
        List<GithubNews> list = githubNewsService.selectGithubNewsList(githubNews);
        return getDataTable(list);
    }

    /**
     * 导出新闻列表
     */
    @RequiresPermissions("system:news:export")
    @Log(title = "新闻", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GithubNews githubNews)
    {
        List<GithubNews> list = githubNewsService.selectGithubNewsList(githubNews);
        ExcelUtil<GithubNews> util = new ExcelUtil<GithubNews>(GithubNews.class);
        return util.exportExcel(list, "news");
    }

    /**
     * 新增新闻
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新闻
     */
    @RequiresPermissions("system:news:add")
    @Log(title = "新闻", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GithubNews githubNews)
    {
        return toAjax(githubNewsService.insertGithubNews(githubNews));
    }

    /**
     * 修改新闻
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GithubNews githubNews = githubNewsService.selectGithubNewsById(id);
        mmap.put("githubNews", githubNews);
        return prefix + "/edit";
    }

    /**
     * 修改保存新闻
     */
    @RequiresPermissions("system:news:edit")
    @Log(title = "新闻", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GithubNews githubNews)
    {
        return toAjax(githubNewsService.updateGithubNews(githubNews));
    }

    /**
     * 删除新闻
     */
    @RequiresPermissions("system:news:remove")
    @Log(title = "新闻", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(githubNewsService.deleteGithubNewsByIds(ids));
    }
}
