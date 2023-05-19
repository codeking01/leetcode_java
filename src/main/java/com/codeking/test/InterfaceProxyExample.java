package com.codeking.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterfaceProxyExample {

    public static void main(String[] args) {
        // 创建目标对象
        Calculator target = new Calculator() {
            @Override
            public void add(int a, int b) {
                System.out.println("Result: " + (a + b));
            }
        };

        // 创建实现接口的动态代理对象
        Calculator proxy = (Calculator) InterfaceProxy.createProxy(target);

        // 调用代理对象的方法
        proxy.add(5, 3);
    }

    interface Calculator {
        void add(int a, int b);
    }

    static class CalculatorImpl implements Calculator {
        @Override
        public void add(int a, int b) {
            int result = a + b;
            System.out.println("Result: " + result);
        }
    }

    static class InterfaceProxy implements InvocationHandler {
        private Object target;

        private InterfaceProxy(Object target) {
            this.target = target;
        }

        public static Object createProxy(Object target) {
            return Proxy.newProxyInstance(
                    target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(),
                    new InterfaceProxy(target)
            );
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Before method invocation");
            Object result = method.invoke(target, args);
            System.out.println("After method invocation");
            return result;
        }
    }
}
