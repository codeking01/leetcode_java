package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/30  20:46
 */
public class GenericTest<T> {
    private final T key;

    public GenericTest(T key) {
        this.key = key;
    }

    public static <T> T genericMethod(T t) {
        return t;
    }

    public T getKey() {
        return key;
    }
}

