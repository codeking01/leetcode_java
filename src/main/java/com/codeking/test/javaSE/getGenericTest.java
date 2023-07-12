package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/30  20:48
 */
public class getGenericTest {
    public static void main(String[] args) {
        GenericTest<Integer> genericTest = new GenericTest<>(123);
        System.out.println(genericTest.getKey());
        Integer integer = GenericTest.genericMethod(123);
        System.out.println(integer);
    }
}