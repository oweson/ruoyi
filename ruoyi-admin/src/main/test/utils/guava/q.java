package utils.guava;

import com.ruoyi.common.utils.StringUtils;
import org.thymeleaf.util.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author oweson
 * @date 2020/12/26 23:51
 */


public class q {
    static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ssSSS");
    static final SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static String formatSQLDate(String s) {
        if (StringUtils.isEmpty(s)) {
            return "";
        }
        try {
            return format2.format(format.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) throws ParseException {
        String s="2020-03-24T00:00:00";
        String replace = s.replace("T", " ");
        System.out.println(replace);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse(replace);
        System.out.println(parse);

        String idNumber="445122198707243417";
        System.out.println(idNumber.substring(0, 6));
        System.out.println(idNumber.substring(6, 10));
        System.out.println(LocalDate.now());
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(Calendar.YEAR);
    }
}
