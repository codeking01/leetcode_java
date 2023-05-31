package com.codeking.test.javaSE;

/**
 * @author CodeKing
 * @since 2023/5/30  19:05
 */
public class StringTest {
    public static void main(String[] args) {
        /*String str1 = "he";
        String str2 = "llo";
        String str3 = "world";
        String str4 = str1 + str2 + str3;
        String[] arr = {"he", "llo", "world"};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
        // 测试看看几个对象
        String code = new String("code");
        String code2 = new String("code");*/
        //System.out.println("******************");
        final String str1 = "str";
        final String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false

    }
}
