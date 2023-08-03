package com.codeking.lc;


import java.util.HashSet;
import java.util.Set;

/**
 * @author xiongjl
 * @since 2023/8/3  16:00
 */
public class lc128 {
    public static void main(String[] args) {
        int i = new lc128().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        System.out.println(i);
    }


    public int longestConsecutive(int[] nums) {
       /* if (nums.length == 0) {
            return 0;
        }*/
        // 先用set去重
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int max = 0;
        for (int i : set) {
            // 需要找到最小的那个元素，即没有存储在set里面的，断断续续的子数组，n个连续子数组，就是n个数
            if (!set.contains(i - 1)) {
                int cur = i;
                int count = 0;
                while (set.contains(cur)) {
                    cur++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
