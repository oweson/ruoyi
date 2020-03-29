package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/3/23 9:10
 */
public class Demo3MonthTimeTest {
    /**
     * 1 获得每个季度时间的间隔
     */
    public static List<Long> reolveQuarter() {
        List<Long> quarter = new ArrayList<>();
        // 2019-12-23 09:16:42
        String HHMMSS = "HHmmss";
        String HH_MM_SS = "HH:mm:ss";
        String YYYYMMDD = "yyyyMMdd";
        String YYYY_MM_DD = "yyyy-MM-dd";
        String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
        String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
        String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
        Calendar calendar = Calendar.getInstance();
        Date nowAdays = calendar.getTime();
        calendar.add(Calendar.MONTH, -3);
        //得到前3个月
        Date formNow3Month = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        String format = sdf.format(formNow3Month);
        String currentTimes = sdf.format(nowAdays);
        System.out.println(currentTimes);
        System.out.println(format);
        quarter.add(formNow3Month.getTime());
        quarter.add(nowAdays.getTime());
        return quarter;

    }

    /**
     * 2 解析两个年度之间的间隔
     */
    public static List<Long> resolveYear() {
        List<Long> quarter = new ArrayList<>();
        // 2019-12-23 09:16:42
        String HHMMSS = "HHmmss";
        String HH_MM_SS = "HH:mm:ss";
        String YYYYMMDD = "yyyyMMdd";
        String YYYY_MM_DD = "yyyy-MM-dd";
        String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
        String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
        String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
        Calendar calendar = Calendar.getInstance();
        Date nowAdays = calendar.getTime();
        calendar.add(Calendar.YEAR, -1);
        //得到前3个月
        Date formNow3Month = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        String format = sdf.format(formNow3Month);
        String currentTimes = sdf.format(nowAdays);
        System.out.println(currentTimes);
        System.out.println(format);
        quarter.add(formNow3Month.getTime());
        quarter.add(nowAdays.getTime());
        return quarter;


    }

    public static void main(String[] args) {
        resolveYear();
        // 2019-12-23 09:16:42
//        String HHMMSS = "HHmmss";
//        String HH_MM_SS = "HH:mm:ss";
//        String YYYYMMDD = "yyyyMMdd";
//        String YYYY_MM_DD = "yyyy-MM-dd";
//        String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
//        String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
//        String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
//        Calendar calendar = Calendar.getInstance();
//        Date nowAdays = calendar.getTime();
//        calendar.add(Calendar.MONTH, -3);
//        //得到前3个月
//        Date formNow3Month = calendar.getTime();
//        SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
//        String format = sdf.format(formNow3Month);
//        String currentTimes = sdf.format(nowAdays);
//        System.out.println(currentTimes);
//        System.out.println(format);
    }
}
