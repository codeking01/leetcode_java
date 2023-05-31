package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/29  15:59
 */
interface InterfaceExample {
    int a = 0;
    String c = null;

    void test();

    default void test2() {
        System.out.println("test2");
    }
}

class B implements InterfaceExample {

    @Override
    public void test2() {
        System.out.println("不是默认实现，自己的test2实现");
    }

    @Override
    public void test() {
        System.out.println("test");
        final int x = 1;
    }
}