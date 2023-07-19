package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/7/19  17:31
 */
public class lc09 {
    public static void main(String[] args) {
        lc09 lc09 = new lc09();
        boolean palindrome = lc09.isPalindrome(12321);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {
        // 负数不是回文数
        if (x < 0) {
            return false;
        }
        // 中间为分界点
        String s = String.valueOf(x);
        // 转为列表
        char[] xArr = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (xArr[l] != xArr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
