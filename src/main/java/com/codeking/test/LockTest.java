package com.codeking.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author CodeKing
 * @since 2023/5/19  16:11
 */
public class LockTest {
    static int i=0;
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 100000; j++) {
                lock.lock();
                try {
                    i += 1;
                }
                finally {
                    lock.unlock();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 100000; j++) {
                lock.lock();
                try {
                    i += 1;
                }
                finally {
                    lock.unlock();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //System.out.println(i);
        testAtomicInteger();
    }

    public static void testAtomicInteger() throws InterruptedException {
        AtomicInteger ai = new AtomicInteger(0);
        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 100000; j++) {
                ai.incrementAndGet();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 100000; j++) {
                ai.incrementAndGet();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ai.get());
    }
}
