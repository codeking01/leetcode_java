package com.codeking.lc;

import java.util.Arrays;

/**
 * @author xiongjl
 * @since 2023/8/5  22:57
 */
public class lc189 {
    public static void main(String[] args) {
        new lc189().rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public void rotate(int[] nums, int k) {
        // todo 还有环状、翻转的做法
        // 需要考虑 总长度
        int[] res = new int[nums.length];
        int index = nums.length - k % nums.length;
        int j = 0;
        for (int i = index; i < nums.length; i++) {
            res[j++] = nums[i];
        }
        for (int i = 0; i < index; i++) {
            res[j++] = nums[i];
        }
        //for (int i = 0; i < nums.length; i++) {
        //    nums[i] = res[i];
        //}
        System.out.println(Arrays.toString(res));
        //System.out.println(Arrays.toString(res));
    }
}
