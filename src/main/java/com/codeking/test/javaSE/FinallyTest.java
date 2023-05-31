package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/30  20:24
 */
public class FinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println("Try to do something");
            throw new RuntimeException("RuntimeException");
        } catch (Exception e) {
            //return;
            System.out.println("Catch Exception -> " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }

    }
}
