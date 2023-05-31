package com.codeking.test.javaSE;

public interface GenericTestInterface<T> {
    T getKey();

    T getKey(T t);
}