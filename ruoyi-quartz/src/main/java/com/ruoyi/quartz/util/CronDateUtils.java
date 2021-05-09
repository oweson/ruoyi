package com.ruoyi.quartz.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/3/9 14:27
 */
public class CronDateUtils {
    private static final String CRON_DATE_FORMAT = "ss mm HH dd MM ? yyyy";

    /**
     * string时间
     *
     * @return
     */
    public static String nowTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /***
     * 1
     * @param date 时间
     * @return cron类型的日期
     */
    public static String getCron(final Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
        String formatTimeStr = "";
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    /***
     * 2
     * @param cron Quartz cron的类型的日期
     * @return Date日期
     */

    public static Date getDate(final String cron) {


        if (cron == null) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
        Date date = null;
        try {
            date = sdf.parse(cron);
        } catch (ParseException e) {
            return null;
            // 此处缺少异常处理,自己根据需要添加
        }
        return date;
    }

    public static void main(String[] args) {
        System.out.println(getCron(new Date()));
    }


}
