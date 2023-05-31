package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/30  14:52
 */
public class StaticTest {
    static Integer a = new Integer(1);
    static Integer b = 1;
    static String c = "1";
    static String d = new String("1");

    public StaticTest() {
    }

    public static void main(String[] args) {
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(c.hashCode() == d.hashCode());
        System.out.println(StaticTest.class.getName());
        method1("1", "2", "3");
    }

    public static void method1(String... args) {
        Integer integer;
        System.gc();

        // 等待一段时间，以便观察是否发生垃圾回收
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        integer = 1000;
        System.out.println(integer);
        System.out.println(args[0]);
    }
}
