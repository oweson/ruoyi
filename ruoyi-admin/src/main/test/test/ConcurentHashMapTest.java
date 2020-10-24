package test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chengwanli
 * @date 2020/10/12 21:29
 */


public class ConcurentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,null);
    }
}
