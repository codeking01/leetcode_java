package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/7/31  22:17
 */
public class lc26 {
    public static void main(String[] args) {
        int i = new lc26().removeDuplicates(new int[]{1, 1, 2});
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        // 双指针求解
        int l = 0, r = 1;
        while (r < nums.length) {
            if (nums[l] != nums[r]) {
                l++;
                nums[l] = nums[r];
            }
            r++;
        }
        return l + 1;
    }
}
