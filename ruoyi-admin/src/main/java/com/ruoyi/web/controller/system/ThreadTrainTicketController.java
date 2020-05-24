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
import com.ruoyi.system.domain.ThreadTrainTicket;
import com.ruoyi.system.service.IThreadTrainTicketService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 并发测试线程安全火车票测试Controller
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Controller
@RequestMapping("/system/ticket")
public class ThreadTrainTicketController extends BaseController
{
    private String prefix = "system/ticket";

    @Autowired
    private IThreadTrainTicketService threadTrainTicketService;

    @RequiresPermissions("system:ticket:view")
    @GetMapping()
    public String ticket()
    {
        return prefix + "/ticket";
    }

    /**
     * 查询并发测试线程安全火车票测试列表
     */
    @RequiresPermissions("system:ticket:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ThreadTrainTicket threadTrainTicket)
    {
        startPage();
        List<ThreadTrainTicket> list = threadTrainTicketService.selectThreadTrainTicketList(threadTrainTicket);
        return getDataTable(list);
    }

    /**
     * 导出并发测试线程安全火车票测试列表
     */
    @RequiresPermissions("system:ticket:export")
    @Log(title = "并发测试线程安全火车票测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ThreadTrainTicket threadTrainTicket)
    {
        List<ThreadTrainTicket> list = threadTrainTicketService.selectThreadTrainTicketList(threadTrainTicket);
        ExcelUtil<ThreadTrainTicket> util = new ExcelUtil<ThreadTrainTicket>(ThreadTrainTicket.class);
        return util.exportExcel(list, "ticket");
    }

    /**
     * 新增并发测试线程安全火车票测试
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存并发测试线程安全火车票测试
     */
    @RequiresPermissions("system:ticket:add")
    @Log(title = "并发测试线程安全火车票测试", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ThreadTrainTicket threadTrainTicket)
    {
        return toAjax(threadTrainTicketService.insertThreadTrainTicket(threadTrainTicket));
    }

    /**
     * 修改并发测试线程安全火车票测试
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ThreadTrainTicket threadTrainTicket = threadTrainTicketService.selectThreadTrainTicketById(id);
        mmap.put("threadTrainTicket", threadTrainTicket);
        return prefix + "/edit";
    }

    /**
     * 修改保存并发测试线程安全火车票测试
     */
    @RequiresPermissions("system:ticket:edit")
    @Log(title = "并发测试线程安全火车票测试", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ThreadTrainTicket threadTrainTicket)
    {
        return toAjax(threadTrainTicketService.updateThreadTrainTicket(threadTrainTicket));
    }

    /**
     * 删除并发测试线程安全火车票测试
     */
    @RequiresPermissions("system:ticket:remove")
    @Log(title = "并发测试线程安全火车票测试", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(threadTrainTicketService.deleteThreadTrainTicketByIds(ids));
    }
}
