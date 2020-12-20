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
import com.ruoyi.system.domain.Babystudent;
import com.ruoyi.system.service.IBabystudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * babynameController
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
@Controller
@RequestMapping("/system/babystudent")
public class BabystudentController extends BaseController
{
    private String prefix = "system/babystudent";

    @Autowired
    private IBabystudentService babystudentService;

    @RequiresPermissions("system:babystudent:view")
    @GetMapping()
    public String babystudent()
    {
        return prefix + "/babystudent";
    }

    /**
     * 查询babyname列表
     */
    @RequiresPermissions("system:babystudent:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Babystudent babystudent)
    {
        startPage();
        List<Babystudent> list = babystudentService.selectBabystudentList(babystudent);
        return getDataTable(list);
    }

    /**
     * 导出babyname列表
     */
    @RequiresPermissions("system:babystudent:export")
    @Log(title = "babyname", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Babystudent babystudent)
    {
        List<Babystudent> list = babystudentService.selectBabystudentList(babystudent);
        ExcelUtil<Babystudent> util = new ExcelUtil<Babystudent>(Babystudent.class);
        return util.exportExcel(list, "babystudent");
    }

    /**
     * 新增babyname
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存babyname
     */
    @RequiresPermissions("system:babystudent:add")
    @Log(title = "babyname", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Babystudent babystudent)
    {
        return toAjax(babystudentService.insertBabystudent(babystudent));
    }

    /**
     * 修改babyname
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Babystudent babystudent = babystudentService.selectBabystudentById(id);
        mmap.put("babystudent", babystudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存babyname
     */
    @RequiresPermissions("system:babystudent:edit")
    @Log(title = "babyname", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Babystudent babystudent)
    {
        return toAjax(babystudentService.updateBabystudent(babystudent));
    }

    /**
     * 删除babyname
     */
    @RequiresPermissions("system:babystudent:remove")
    @Log(title = "babyname", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(babystudentService.deleteBabystudentByIds(ids));
    }
}
