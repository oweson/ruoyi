package test;

import java.util.Objects;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/24 8:19
 */
public class Demo3ObjectUtilsTest {
    public static void main(String[] args) {
        // 新的工具类判空！
        System.out.println(Objects.isNull("hello"));
        System.out.println(Objects.isNull(null));
    }
}
