package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/29  13:57
 */
public class BaseTypeTest {
    public static void main(String[] args) {
        Integer a = 323;
        Integer b = 323;
        System.out.println(a == b); //false
        //Integer 缓存池的大小默认为 -128~127。
        Integer c = 110;
        Integer d = 110;
        System.out.println(c == d); //true
        System.out.println("******************");
        // 测试String
        String s1 = "123";
        String s2 = "123";
        s1 = "555";
        System.out.println(s1 == s2);
        String s3 = new String("123");
        String s4 = new String("123");
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        String s5 = s4.intern();
        System.out.println(s4.intern() == s5);

    }
}
