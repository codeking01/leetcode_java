package com.codeking.test.JUC;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author CodeKing
 * @since 2023/6/5  11:19
 */
public class ReentrantLockTest {
    static Integer sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        // 使用callable实现
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 提交任务并获取Future对象
        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //synchronized (this) {
                for (int i = 0; i < 10000000; i++) {
                    sum += 1;
                }
                //}
                return sum;
            }
        });
        Future<Integer> integerFuture2 = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //synchronized (this) {
                for (int i = 0; i < 10000000; i++) {
                    sum += 1;
                }
                //}
                return sum;
            }
        });
        System.out.println(integerFuture.get());
        System.out.println(integerFuture2.get());
        executorService.shutdown();
    }
}
