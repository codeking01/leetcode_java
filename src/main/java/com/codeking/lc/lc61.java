package com.codeking.lc;

import java.util.Arrays;

/**
 * @author xiongjl
 * @since 2023/7/30  16:16
 */
public class lc61 {
    public static void main(String[] args) {
        int[] ints = new lc61().plusOne(new int[]{9});
        System.out.println(Arrays.toString(ints));
    }

    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        // 边界条件
        while (index > 0 && digits[index] == 9) {
            index--;
        }
        for (int i = index; i < digits.length; i++) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
            }
        }
        if (index == 0 && digits[index] == 0) {
            digits = move(digits);
        }
        return digits;
    }

    public int[] move(int[] digits) {
        int len = digits.length + 1;
        int[] res = new int[len];
        res[0] = 1;
        System.arraycopy(digits, 0, res, 1, len - 1);
        return res;
    }

}
