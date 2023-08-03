package com.codeking.lc;

import java.util.HashMap;

/**
 * @author xiongjl
 * @since 2023/8/1  22:10
 */
public class lc560 {
    public static void main(String[] args) {
        int i = new lc560().subarraySum(new int[]{0, 0, 0}, 0);
        System.out.println(i);
    }

    /*public int subarraySum(int[] nums, int k) {
        // 两次for
        int count = 0;
        for (int l = 0; l < nums.length; l++) {
            int sum = nums[l];
            int r = l+1;
            if (nums[l] == k) {
                count++;
            }
            while (r < nums.length) {
                sum += nums[r];
                if (sum == k) {
                    count++;
                }
                r++;
            }
        }
        return count;
    }*/
    public int subarraySum(int[] nums, int k) {
        // 用 前缀（nums[:i]）和+hash表  nums[i:j] = nums[i] + nums[i+1] + ... + nums[j]
        // nums[:j] = nums[:i]+nums[i:j] 令nums[i:j]=k ,则 nums[:j] -k=nums[:i]
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0, count = 0;
        //map.put(0, 1); // 感觉初始条件很难理解···
        for (int num : nums) {
            preSum += num;
            // 这一步需要特别注意！！
            if (preSum == k) {
                count++;
            }
            if (map.containsKey(preSum - k)) {
                count += map.get(preSum - k);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }


}
