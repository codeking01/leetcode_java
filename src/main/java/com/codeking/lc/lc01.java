package com.codeking.lc;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author xiongjl
 * @since 2023/8/3  14:11
 */
public class lc01 {
    public static void main(String[] args) {

        int[] ints = new lc01().twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        // a+b=target --> 就是遍历 nums,找到target-b是不是在列表里面
        // 用hash表记录每一个元素的下标记
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }
}
