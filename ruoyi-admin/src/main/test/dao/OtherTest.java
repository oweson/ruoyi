package dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengwanli
 * @date 2020/10/9 18:46
 */


public class OtherTest {
    public static void main(String[] args) {
        Map<String,Animal> list  = new HashMap<>();
        Animal animal = new Fish();
        list.put("fish",animal);
        new MainTest().send(list);
    }
}
