package test;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import imooc.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/14 20:04
 */
public class Demo1JSONTest {
    public static void main(String[] args) {
        User user = new User(1, "1001");
        // 1 第二个参数表示格式化打印
        System.out.println(JSON.toJSONString(user, true));
        System.out.println(DateUtil.endOfDay(new Date()));
    }
}
