package com.codeking.lc;

import java.util.Arrays;

/**
 * @author xiongjl
 * @since 2023/8/6  12:17
 */
public class lc238 {
    public static void main(String[] args) {
        int[] ints = new lc238().productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }

    public int[] productExceptSelf(int[] nums) {
        // 左右累乘，两个数组去记录
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // 初始化
            left[i] = 1;
            right[i] = 1;
        }
        // 左数组
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        // 右数组
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
