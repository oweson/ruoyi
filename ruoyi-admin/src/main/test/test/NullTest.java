package test;

public class NullTest {
    public static final String s = null;

    public static void demo1() {
        System.out.println("hello,world!");
    }

    public static void main(String[] args) {
        NullTest nullTest = null;
        nullTest.demo1();
        // without npe;
        System.out.println(null == null);
        // true;
        Integer integer = 100;
        int intValue = integer.intValue();
        String s = "100";
        Integer integer1 = Integer.valueOf(100 + "");
        String s1 = String.valueOf(200);
        System.out.println(integer1);

    }
}
