package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author oweson
 * @date 2020/10/25 9:49
 */


public class FinalTest {
    private static  final List<Integer> LIST = new ArrayList<>();
    public static final String demo1(){
        return "";
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 1 修饰对象指的是引用不可变
        LIST.add(1);
        //LIST=new LinkedList<>();
        Class<?> forName = Class.forName("test.FinalTest");
        Method[] declaredMethods = forName.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        Field[] declaredFields = forName.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Constructor<?>[] declaredConstructors = forName.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        FinalTest finalTest = (FinalTest) forName.newInstance();
        Constructor constructor = forName.getConstructor();


    }
}
