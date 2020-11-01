package com.ruoyi.web.controller.guangzhou;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ruoyi.system.mapper.TIdcardMapper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TIdcard;
import com.ruoyi.system.service.ITIdcardService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

import javax.annotation.PostConstruct;

/**
 * 身份证查询Controller
 *
 * @author ruoyi
 * @date 2020-09-29
 */
@Controller
@RequestMapping("/system/idcard")
public class TIdcardController extends BaseController {

    private String prefix = "system/idcard";

    @Autowired
    private ITIdcardService tIdcardService;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    TIdcardMapper idcardMapper;

    @RequiresPermissions("system:idcard:view")
    @GetMapping()
    public String idcard() {
        return prefix + "/idcard";
    }

    /**
     * 查询身份证查询列表
     */
    @RequiresPermissions("system:idcard:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TIdcard tIdcard) {
        startPage();
        List<TIdcard> list = tIdcardService.selectTIdcardList(tIdcard);
        return getDataTable(list);
    }

    /**
     * 导出身份证查询列表
     */
    @RequiresPermissions("system:idcard:export")
    @Log(title = "身份证查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TIdcard tIdcard) {
        List<TIdcard> list = tIdcardService.selectTIdcardList(tIdcard);
        ExcelUtil<TIdcard> util = new ExcelUtil<TIdcard>(TIdcard.class);
        return util.exportExcel(list, "idcard");
    }

    /**
     * 新增身份证查询
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存身份证查询
     */
    @RequiresPermissions("system:idcard:add")
    @Log(title = "身份证查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TIdcard tIdcard) {
        Set<Integer> integerList = new HashSet<>();
        // todo 手机号处理
        SetOperations setOperations = redisTemplate.opsForSet();
        Set members = setOperations.members("idcard");
        HashSet hashSet= new HashSet();
        for (Object member : members) {
             hashSet = (HashSet) member;
        }
        if (setOperations.size("idcard") != 0) {
            if (hashSet.contains(tIdcard.getfCode())) {
                return error("新增身份证信息'" + tIdcard.getfCode() + "'失败，号码已存在！");

            }
            integerList.addAll(hashSet);
            integerList.add(tIdcard.getfCode());
            setOperations.add("idcard", integerList);




        } else {
            List<TIdcard> tIdcards = idcardMapper.listAll();
            integerList.add(tIdcard.getfCode());
            tIdcards.forEach(item->integerList.add(item.getfCode()));
            setOperations.add("idcard", integerList);


        }
        return toAjax(tIdcardService.insertTIdcard(tIdcard));
    }

    /**
     * 修改身份证查询
     */
    @GetMapping("/edit/{fCode}")
    public String edit(@PathVariable("fCode") Integer fCode, ModelMap mmap) {
        TIdcard tIdcard = tIdcardService.selectTIdcardById(fCode);
        mmap.put("tIdcard", tIdcard);
        return prefix + "/edit";
    }

    /**
     * 修改保存身份证查询
     */
    @RequiresPermissions("system:idcard:edit")
    @Log(title = "身份证查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TIdcard tIdcard) {
        return toAjax(tIdcardService.updateTIdcard(tIdcard));
    }

    /**
     * 删除身份证查询
     */
    @RequiresPermissions("system:idcard:remove")
    @Log(title = "身份证查询", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tIdcardService.deleteTIdcardByIds(ids));
    }
}
