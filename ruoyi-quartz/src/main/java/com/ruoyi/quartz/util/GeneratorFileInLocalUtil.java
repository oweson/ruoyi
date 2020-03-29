//package com.ruoyi.quartz.util;
//
//import org.apache.commons.beanutils.DynaBean;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.text.NumberFormat;
//
///**
// * the class is create by @Author:oweson
// *
// * @Date：2020/3/9 15:39
// */
//public class GeneratorFileInLocalUtil {
//    /**
//     *      * 生成excel
//     *      * @throws IOException 
//     *      
//     */
//    public static void createExcel(String list) throws IOException {
////创建HSSFWorkbook对象(excel的文档对象)  
//        HSSFWorkbook wb = new HSSFWorkbook();
//// 建立新的sheet对象（excel的表单）
//        HSSFSheet sheet = wb.createSheet("sheet1");
//        // 在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
//        HSSFRow row0 = sheet.createRow(0);
//// 添加表头
//// row0.createCell(0).setCellValue("测站名称");
//        row0.createCell(1).setCellValue("测站代码");
//        row0.createCell(2).setCellValue("对象名称");
//        row0.createCell(3).setCellValue("断面名称");
//        row0.createCell(4).setCellValue("断面级别");
//        row0.createCell(5).setCellValue("检测时间");
//        row0.createCell(6).setCellValue("水期代码");
//        for (int i = 0; i < wrwmclist.size(); i++) {
//            String wrwmc = wrwmclist.get(i);
//            row0.createCell(7 + i).setCellValue(wrwmc);
//            if (i == wrwmclist.size() - 1) {
//                row0.createCell(7 + i + 1).setCellValue("备注");
//            }
//        }
//
//        //格式化数字
//        NumberFormat nf = NumberFormat.getInstance();
//// 创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
//        // 在sheet里创建往下的行
//        for (int i = 0; i < datalist.size(); i++) {
//            DynaBean db = datalist.get(i);
//            HSSFRow row = sheet.createRow(i + 1);
//            row.createCell(0).setCellValue(db.get("SSXZQ") != null ? db.get("SSXZQ").toString() : "");
//            row.createCell(1).setCellValue(db.get("ORGID") != null ? db.get("ORGID").toString() : "");
//            row.createCell(2).setCellValue(db.get("DXMC") != null ? db.get("DXMC").toString() : "");
//            row.createCell(3).setCellValue(db.get("CDMC") != null ? db.get("CDMC").toString() : "");
//            String jgjb = db.get("JGJB") != null ? db.get("JGJB").toString() : "";
//            row.createCell(4).setCellValue(dmjbMap(jgjb));
//            row.createCell(5).setCellValue(db.get("CYSJ") != null ? db.get("CYSJ").toString() : "");
//            row.createCell(6).setCellValue(db.get("SQDM") != null ? db.get("SQDM").toString() : "");
//            for (int n = 0; n < fxxmdmlist.size(); n++) {
//                String wrwdm = fxxmdmlist.get(n);
//                String strnum = "0";
//                if (db.get(wrwdm) != null) {
//                    strnum = subZeroAndDot(db.get(wrwdm).toString());//去掉多余的 0 
//                    strnum = new BigDecimal(strnum).toPlainString();//避免科学计数
//                    strnum = nf.format(Double.parseDouble(strnum));//去掉  值为 0 的所有小数
//                }
//                row.createCell(7 + n).setCellValue(strnum);
//                if (n == fxxmdmlist.size() - 1) {
//                    row.createCell(7 + n + 1).setCellValue(db.get("BZ") != null ? db.get("BZ").toString() : "");
//                }
//            }
//        }
////判断是否存在目录. 不存在则创建
//        isChartPathExist(filepath);
//        //输出Excel文件1  
//        FileOutputStream output = new FileOutputStream(filepath + filename);
//        wb.write(output);
//        //写入磁盘  
//        output.close();
//    }
//
//
//}
