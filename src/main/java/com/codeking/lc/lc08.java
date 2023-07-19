package com.codeking.lc;


import java.math.BigInteger;

/**
 * @author xiongjl
 * @since 2023/7/17  13:50
 */
public class lc08 {
    public static void main(String[] args) {
        lc08 lc08 = new lc08();
        System.out.println(lc08.myAtoi(" "));
    }

    public int myAtoi(String s) {
        // 读取到符号确定 正负，没有就是正
        int sign = 1;
        // 存储数字
        StringBuilder stringBuilder = new StringBuilder();
        // 先处理掉空格
        int start = 0;
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        if (start < s.length() && (s.charAt(start) == '-' || s.charAt(start) == '+')) {
            sign = s.charAt(start) == '-' ? -1 : 1;
            start++;
        }
        for (int i = start; i < s.length(); i++) {
            // 只有第一次的才可以有判断符号的资格
            //if (i == start && s.charAt(i) == '-') {
            //    sign = -1;
            //    continue;
            //}
            //if (i == start && s.charAt(i) == '+') {
            //    continue;
            //}

            // 判断数字
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                stringBuilder.append(s.charAt(i));
            } else {
                break;
            }
        }
        if (stringBuilder.length() == 0) {
            return 0;
        }
        BigInteger num = new BigInteger(stringBuilder.toString());
        BigInteger maxInt = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger minInt = new BigInteger(String.valueOf(Integer.MIN_VALUE));
        if (sign > 0 && num.compareTo(maxInt) > 0) {
            return Integer.MAX_VALUE;
        } else if (sign < 0 && num.negate().compareTo(minInt) < 0) {
            return Integer.MIN_VALUE;
        }
        return sign * num.intValue();
    }
}
