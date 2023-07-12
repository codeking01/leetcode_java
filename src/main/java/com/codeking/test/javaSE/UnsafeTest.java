package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/31  14:29
 */
public class UnsafeTest {
    public static void main(String[] args) {
        UnsafeTest unsafe = new UnsafeTest();
    }
/*
private static void memoryTest() {
        int size = 4;
        long addr = unsafe.allocateMemory(size);
        long addr3 = unsafe.reallocateMemory(addr, size * 2);
        System.out.println("addr: "+addr);
        System.out.println("addr3: "+addr3);
        try {
            unsafe.setMemory(null,addr ,size,(byte)1);
            for (int i = 0; i < 2; i++) {
                unsafe.copyMemory(null,addr,null,addr3+size*i,4);
            }
            System.out.println(unsafe.getInt(addr));
            System.out.println(unsafe.getLong(addr3));
        }finally {
            unsafe.freeMemory(addr);
            unsafe.freeMemory(addr3);
        }
    }*/

}
