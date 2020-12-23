package utils.guava;

import com.google.common.base.Optional;
import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author oweson
 * @date 2020/11/1 15:02
 */


public class OptionTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>(0);
        ArrayList<Object> objects02 = new ArrayList<>(10);
        System.out.println(objects.isEmpty());
        System.out.println(objects02.isEmpty());
        //System.out.println(objects.set(0, 100));


        // 1  Optional.of(null);  null就抛出异常

//        Optional<String> absent = Optional.absent();
//        System.out.println(absent.get());
        System.out.println(Objects.equals(1, 1));

    }
}
