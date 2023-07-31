package com.codeking.lc;

/**
 * {@code @description} 二进制求和
 *
 * @author xiongjl
 * @since 2023/7/31  16:50
 */
public class lc67 {
    public static void main(String[] args) {
        String ints = new lc67().addBinary("100", "110010");
        System.out.println(ints);
    }

    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            // 交换数组
            String temp = a;
            a = b;
            b = temp;
        }
        char[] aArr = a.toCharArray(), bArr = b.toCharArray();
        StringBuilder res = new StringBuilder();
        int flag = 0;
        int d = aArr.length - bArr.length;
        for (int i = b.length() - 1; i >= 0; i--) {
            if (aArr[i + d] - '0' + bArr[i] - '0' + flag > 1) {
                if (aArr[i + d] - '0' + bArr[i] - '0' + flag == 3) {
                    res.append(1);
                } else {
                    res.append(0);
                }
                flag = 1;
            } else {
                res.append(aArr[i + d] - '0' + bArr[i] - '0' + flag);
                flag = 0;
            }
        }
        for (int i = a.length() - b.length() - 1; i >= 0; i--) {
            if (aArr[i] - '0' + flag > 1) {
                res.append(0);
                flag = 1;
            } else {
                res.append(aArr[i] - '0' + flag);
                flag = 0;
            }
        }
        if (flag == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
