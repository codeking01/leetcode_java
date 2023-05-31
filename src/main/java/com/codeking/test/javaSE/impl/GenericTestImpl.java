package com.codeking.test.javaSE.impl;


import com.codeking.test.javaSE.GenericTestInterface;

/**
 * @author CodeKing
 * @since 2023/5/30  20:52
 */
public class GenericTestImpl<T> implements GenericTestInterface<T> {
    @Override
    public T getKey() {
        return null;
    }

    @Override
    public T getKey(T o) {
        return o;
    }
}
