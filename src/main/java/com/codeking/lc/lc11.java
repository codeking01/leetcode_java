package com.codeking.lc;

/**
 * @author CodeKing
 * @since 2023/6/6  21:44
 */
public class lc11 {
    public int maxArea(int[] height) {
        // 左右两个指针去遍历
        int left = 0, right = height.length - 1;
        int res = 0;
        while (left < right) {
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
