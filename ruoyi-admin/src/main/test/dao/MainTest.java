package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chengwanli
 * @date 2020/10/9 18:40
 */


public class MainTest {
    public void  send(Map<String,Animal> list){
        for (Map.Entry<String, Animal> stringAnimalEntry : list.entrySet()) {
            stringAnimalEntry.getValue().eat();
        }
    }
    public static void main(String[] args) {
        Map<String,Animal> list  = new HashMap<>();
        Animal animal = new Fish();
        list.put("fish",animal);
        new MainTest().send(list);

    }
}
