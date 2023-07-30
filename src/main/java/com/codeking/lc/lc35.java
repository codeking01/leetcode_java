package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/7/30  12:08
 */
public class lc35 {
    public static void main(String[] args) {
        int i = new lc35().searchInsert(new int[]{1}, 1);
        System.out.println(i);
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left >= nums.length - 1 && nums[left] < target ? nums.length : left;
    }
}
