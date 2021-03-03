package utils.guava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author oweson
 * @date 2021/1/16 22:59
 */


public class PhoneCheck {
    public static boolean checkChinaPhoneLegal(String str) throws PatternSyntaxException {
        // ^ 匹配输入字符串开始的位置
        // \d 匹配一个或多个数字，其中 \ 要转义，所以是 \\d
        // $ 匹配输入字符串结尾的位置
        String regExp = "^((13[0-9])|(14[5,7,9])|(15[0-3,5-9])|(166)|(17[3,5,6,7,8])" +
                "|(18[0-9])|(19[8,9]))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public static boolean checkPass(String pass){
        if (pass.matches(".*[a-z]{1,}.*") && pass.matches(".*[A-Z]{1,}.*") && pass.matches(".*\\d{1,}.*") && pass.matches(".*[~!@#$%^&*\\.?]{1,}.*")
        && pass.trim().length()<=20 && pass.trim().length()>=8) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       /* System.out.println(checkChinaPhoneLegal("15797624891"));
        System.out.println(checkChinaPhoneLegal("95797624891"));
        System.out.println(checkChinaPhoneLegal("1512797624891"));*/
        System.out.println(checkPass("111111111"));
        System.out.println(checkPass("cwL#1123"));



    }
}
