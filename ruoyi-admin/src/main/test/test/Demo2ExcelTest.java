package test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.oweson.domain.Card;
import org.junit.Test;

import java.util.ArrayList;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/19 9:09
 */
public class Demo2ExcelTest {
    @Test
    public void demo1(){
        ArrayList<Card> objects = Lists.newArrayList();
        for (int i = 0; i < 15; i++) {
            Card card = new Card();
            card.setCode(i+101+"");
            card.setId(i);
            objects.add(card);


        }
        ExcelUtil<Card> excelUtil = new ExcelUtil<Card>(Card.class);
        AjaxResult myTest = excelUtil.exportExcel(objects, "myTest");
        System.out.println(JSON.toJSONString(myTest));

    }
//    public Object iheat() throws IOException {
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
//                "iheat文件", );
//        return "";
//    }
}
