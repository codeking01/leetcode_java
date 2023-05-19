package com.codeking.test;

import java.lang.ref.SoftReference;

/**
 * @author CodeKing
 * @since 2023/5/19  16:56
 */
public class StringTest {

    final static String a = null;
    public static void main(String[] args) {
        String a = "hello";
        System.out.println(a);
        SoftReference<B> softRef = new SoftReference<>(new B());
        B obj = softRef.get();
        System.out.println(obj);
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(a);
            }
        });
    }
}

class B extends Object {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}