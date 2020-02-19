package com.ruoyi.web.controller.oweson.demo;

import com.google.common.collect.Lists;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.oweson.domain.Card;
import com.ruoyi.system.service.CardService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/1/12 16:53
 */
@RestController
@RequestMapping("card")
public class CardController {
    @Autowired
    private CardService cardService;

    @RequiresPermissions("system:card:one")
    @RequestMapping("getCardById")
    public Card getCardById(Integer id) {
        return cardService.getCardById(id);
    }

    @RequiresPermissions("system:card:list")
    @RequestMapping("/list")
    public TableDataInfo listCard() {
        return null;

    }

    @RequestMapping("ry")
    public AjaxResult ry() {
        ArrayList<Card> objects = Lists.newArrayList();
        for (int i = 0; i < 15; i++) {
            Card card = new Card();
            card.setCode(i + 101 + "");
            card.setId(i);
            objects.add(card);


        }
        ExcelUtil<Card> excelUtil = new ExcelUtil<Card>(Card.class);
        return excelUtil.exportExcel(objects, "myTest");
    }

//    @RequestMapping("iheat")
//    public Object iheat(HttpServletResponse httpServletResponse) throws IOException {
//        ArrayList<Card> objects = Lists.newArrayList();
//        for (int i = 0; i < 15; i++) {
//            Card card = new Card();
//            card.setCode(i + 101 + "");
//            card.setId(i);
//            objects.add(card);
//
//
//        }
//        IheatExcelUtil.exportExcel(objects, "iheat导出测试", Card.class,
//                "iheat文件", httpServletResponse);
//        return "";
//    }

}
