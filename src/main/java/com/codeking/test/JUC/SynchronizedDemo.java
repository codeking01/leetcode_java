package com.codeking.test.JUC;

public class SynchronizedDemo {
    public static void main(String[] args) {

    }

    public void method() {
        synchronized (this) {
            System.out.println("synchronized 代码块");
        }
    }
}
