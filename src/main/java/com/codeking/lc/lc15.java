package com.codeking.lc;

import java.util.*;

/**
 * @author CodeKing
 * @since 2023/5/19  21:58
 */
public class lc15 {
    public static void main(String[] args) {
        lc15 lc15 = new lc15();
        int[] arr = {-2,0,1,1,2};
        List<List<Integer>> lists = lc15.threeSum(arr);
        System.out.println(lists);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        // 使用set集合
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            // 先定义 -nums[i]
            int target = -nums[i];
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //去重
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        //排序
        for (List<Integer> list : set) {
            Collections.sort(list);
        }
        List<List<Integer>> uniqueSet = new ArrayList<>();
        HashSet<List<Integer>> uniqueHashSet = new HashSet<>(set); // 将原始的三元组列表转换为HashSet，去除重复元素
        uniqueSet.addAll(uniqueHashSet); // 将唯一的三元组添加到结果列表中
        return uniqueSet;
    }
}
