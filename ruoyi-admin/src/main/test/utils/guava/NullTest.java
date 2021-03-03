package utils.guava;

import org.springframework.util.StringUtils;

/**
 * @author oweson
 * @date 2021/1/10 9:32
 */


public class NullTest {
    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isEmpty(null));
        // true
        //false
        //true
        System.out.println(org.apache.commons.lang3.StringUtils.isNotBlank(""));
        System.out.println(org.apache.commons.lang3.StringUtils.isNotBlank(" "));
        System.out.println(org.apache.commons.lang3.StringUtils.isNotBlank(null));
        System.out.println("   ".length());
        System.out.println(Character.isWhitespace(' '));
        System.out.println(null+""==null);

    }
}
