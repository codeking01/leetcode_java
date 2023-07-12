package com.codeking.test.JUC;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author CodeKing
 * @since 2023/6/5  10:19
 */
public class SynchronizedTest {
    static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        test();
        System.out.println(i);
    }

    private static void test() throws InterruptedException {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int j = 0; j < 10000; j++) {
                    i.incrementAndGet();
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int j = 0; j < 10000; j++) {
                    i.incrementAndGet();
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}
