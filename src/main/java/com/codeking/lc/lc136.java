package com.codeking.lc;

import java.util.Arrays;

/**
 * @author xiongjl
 * @since 2023/8/1  19:43
 */
public class lc136 {
    public static void main(String[] args) {
        int ins = new lc136().singleNumber(new int[]{2, 2, 1});
        System.out.println(ins);
    }

    public int singleNumber(int[] nums) {
        // 先排序
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (i == nums.length - 2) {
                    return nums[i + 1];
                } else if (i == 0) {
                    return nums[i];
                } else if (nums[i + 1] != nums[i + 2]) {
                    return nums[i + 1];
                }
            }
        }
        return nums[0];
    }
}
