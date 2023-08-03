package com.codeking.lc;

import java.util.Arrays;

/**
 * @author xiongjl
 * @since 2023/8/3  18:10
 */
public class lc283 {
    public static void main(String[] args) {
        new lc283().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        // 双指针
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                if (l != r) {
                    nums[l] = nums[r];
                }
                l++;
                //nums[l++] = nums[r++];
            }
            r++;
        }
        while (l < nums.length) {
            nums[l++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
