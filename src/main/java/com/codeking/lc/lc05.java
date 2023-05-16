package com.codeking.lc;


import java.util.ArrayList;

/**
 * @author CodeKing
 * @since 2023/5/15  20:20
 */
/*
动态规划求解
状态容器 dp[]
初始化 对角线全部为0
边界条件
    需要提前判断上下相邻的情况
    dp[j][i] = arr[i] == arr[j] && dp[j + 1][i - 1];
 */
public class lc05 {
    public static void main(String[] args) {
        lc05 lc05 = new lc05();
        String s = lc05.longestPalindrome("ccc");
        System.out.println(s);
    }

    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        boolean[][] dp = new boolean[len][len];
        // 先给对角线全部赋值 true
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int i = 1; i < len; i++) {
            // 先判断上下相邻的两个（因为这个时候i+1和j-1会超出范围）
            dp[i - 1][i] = arr[i] == arr[i - 1];
            for (int j = i - 2; j >= 0; j--) {
                dp[j][i] = arr[i] == arr[j] && dp[j + 1][i - 1];
            }
        }
        // 找最右上的true
        int max = 1;
        int start = 0, end = 0;
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= 0; j--) {
                if (dp[i][j]) {
                    if (max < (j - i + 1)) {
                        max=j-i+1;
                        start = i;
                        end = j;
                        break;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}