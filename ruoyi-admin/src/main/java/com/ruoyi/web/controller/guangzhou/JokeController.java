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
import com.ruoyi.system.domain.Joke;
import com.ruoyi.system.service.IJokeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 段子Controller
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
@Controller
@RequestMapping("/system/joke")
public class JokeController extends BaseController
{
    private String prefix = "system/joke";

    @Autowired
    private IJokeService jokeService;

    @RequiresPermissions("system:joke:view")
    @GetMapping()
    public String joke()
    {
        return prefix + "/joke";
    }

    /**
     * 查询段子列表
     */
    @RequiresPermissions("system:joke:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Joke joke)
    {
        startPage();
        List<Joke> list = jokeService.selectJokeList(joke);
        return getDataTable(list);
    }

    /**
     * 导出段子列表
     */
    @RequiresPermissions("system:joke:export")
    @Log(title = "段子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Joke joke)
    {
        List<Joke> list = jokeService.selectJokeList(joke);
        ExcelUtil<Joke> util = new ExcelUtil<Joke>(Joke.class);
        return util.exportExcel(list, "joke");
    }

    /**
     * 新增段子
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存段子
     */
    @RequiresPermissions("system:joke:add")
    @Log(title = "段子", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Joke joke)
    {
        return toAjax(jokeService.insertJoke(joke));
    }

    /**
     * 修改段子
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Joke joke = jokeService.selectJokeById(id);
        mmap.put("joke", joke);
        return prefix + "/edit";
    }

    /**
     * 修改保存段子
     */
    @RequiresPermissions("system:joke:edit")
    @Log(title = "段子", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Joke joke)
    {
        return toAjax(jokeService.updateJoke(joke));
    }

    /**
     * 删除段子
     */
    @RequiresPermissions("system:joke:remove")
    @Log(title = "段子", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jokeService.deleteJokeByIds(ids));
    }
}
