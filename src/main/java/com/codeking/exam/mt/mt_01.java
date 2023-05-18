package com.codeking.exam.mt;

/**
 * @author CodeKing
 * @since 2023/5/12  23:02
 */
public class mt_01 {
    static String a;
    public static void main(String[] args) {
        B b = new B();
        System.out.println("a = " + a);
    }

}
class A{
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}