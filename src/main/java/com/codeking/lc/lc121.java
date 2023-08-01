package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/8/1  21:09
 */
public class lc121 {
    public static void main(String[] args) {
        int i = new lc121().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }
    // 解法一
   /* public int maxProfit(int[] prices) {
        // 两个指针 两层for
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    max = Math.max(max, prices[j] - prices[i]);
                }
            }
        }
        return max;
    }*/

    // 解法二 动态规划
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        // 状态转移方程 dp[n]=max(dp[n-1],prices[n]-minPrice(前n-1天价格))
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
        }
        return dp[prices.length - 1];
    }

    // 解法三
    /*public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }*/
}
