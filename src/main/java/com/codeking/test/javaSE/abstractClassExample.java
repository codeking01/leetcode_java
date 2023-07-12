package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/29  15:54
 */
abstract class abstractClassExample {
    int anInt;
    String aString;

    public abstract void abstractMethod();

    public void test() {
        System.out.println("test");
    }
}

class A extends abstractClassExample {

    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod");
    }
}
