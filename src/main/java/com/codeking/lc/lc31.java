package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/8/7  0:02
 */
public class lc31 {

    public static void main(String[] args) {
        //new lc31().nextPermutation(new int[]{1, 2, 3});
        //new lc31().nextPermutation(new int[]{3, 2, 1});
        //new lc31().nextPermutation(new int[]{1,1,5});
        new lc31().nextPermutation(new int[]{1, 2});
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }
        if (i == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        // 找到和它相近且大于它的第一个数
        int j = nums.length - 1;
        while (nums[i - 1] >= nums[j]) {
            j--;
        }
        swap(nums, i - 1, j);
        reverse(nums, i, nums.length - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 二分查找
    /*public int search(int[] nums, int left, int right, int target) {
        int temp = left;
        int mid = left + (right - left) / 2;
        while (left < right) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                left = mid + 1;
            } else {
                right = mid;
            }
            mid = left + (right - left) / 2;
        }
        return left + temp;
    }*/

    // 翻转数组
    public void reverse(int[] nums, int left, int right) {
        int mid = left + (right - left) / 2;
        for (int i = 0; left + i <= mid; i++) {
            int temp = nums[left + i];
            nums[left + i] = nums[right - i];
            nums[right - i] = temp;
        }
    }

}
