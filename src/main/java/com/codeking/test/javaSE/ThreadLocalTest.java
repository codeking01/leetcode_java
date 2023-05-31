package com.codeking.test.javaSE;

import java.util.HashMap;

/**
 * @author CodeKing
 * @since 2023/5/18  20:44
 */
public class ThreadLocalTest {
    static String a;
    public static void main(String[] args) {
        System.out.println(a + "a");
        ThreadLocalTest test = new ThreadLocalTest();
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("hello");
        threadLocal.set(new HashMap<String, Object>(){
            {
                put("a", 1);
                put("b", 2);
            }
        });
        threadLocal.set(new HashMap<String, Object>(){
            {
                put("c", 5);
                put("d", 6);
            }
        });
        System.out.println("threadLocal = " + threadLocal.get());
    }
}
