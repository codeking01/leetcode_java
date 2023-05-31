package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/29  16:17
 */
public class FinalTest {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("c.a = " + c.a);
        System.out.println(0.1 * 3 == 0.3);
        new E();
    }
}

class C {
    public static String staticField = "静态变量";

    static {
        System.out.println("静态语句块"); //1
    }

    String a;

    {
        System.out.println("普通语句块"); //2
    }


    public C() {

    }

    public C(String a) {
        this.a = a;
    }
}

class D implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class E extends C {
    public E(String a) {
        super(a);
    }

    public E() {
    }
}