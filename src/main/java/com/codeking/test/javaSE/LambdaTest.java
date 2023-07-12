package com.codeking.test.javaSE;

import java.util.Collections;
import java.util.List;

/**
 * @author CodeKing
 * @since 2023/5/31  12:30
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> strList = Collections.singletonList("Hollis");

        strList.forEach(s -> {
            System.out.println(s);
        });
        GT<Integer> gti = new GT<Integer>();
        //由于经过类型擦除，所有的泛型类实例都关联到同一份字节码上，泛型类的所有静态变量是共享的
        gti.var = 1;
        GT<String> gts = new GT<String>();
        gts.var = 2;
        System.out.println(gti.var); //2
    }
}

class GT<T> {
    public static int var = 0;

    public void nothing(T x) {
    }
}
