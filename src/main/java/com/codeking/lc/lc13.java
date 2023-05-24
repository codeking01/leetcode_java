package com.codeking.lc;

import java.util.HashMap;

/**
 * @author CodeKing
 * @since 2023/5/22  16:46
 */
public class lc13 {
    public static void main(String[] args) {
        lc13 lc13 = new lc13();
        System.out.println(lc13.romanToInt("III"));
    }

    public int romanToInt(String s) {
        // 先用HashMap存储这所有的情况
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        if (s.length() < 2) {
            return map.get(s);
        }
        char[] arr = s.toCharArray();
        int sum = 0;
        // 双指针去遍历
        int l = 0, r = 0;
        while (true) {
            r = l + 1;
            if (r>=arr.length) {
                if (l == arr.length - 1) {
                    sum += map.get(String.valueOf(arr[l]));
                }
                return sum;
            }
            if (l <= arr.length - 2) {
                if (arr[l] == 'I' && (arr[r] == 'V' || arr[r] == 'X')) {
                    sum += map.get(String.valueOf(arr[l])+String.valueOf(arr[r]));
                    l += 2;
                } else if (arr[l] == 'X' && (arr[r] == 'L' || arr[r] == 'C')) {
                    sum += map.get(String.valueOf(arr[l])+String.valueOf(arr[r]));
                    l += 2;
                } else if (arr[l] == 'C' && (arr[r] == 'D' || arr[r] == 'M')) {
                    sum += map.get(String.valueOf(arr[l])+String.valueOf(arr[r]));
                    l += 2;
                } else {
                    sum += map.get(String.valueOf(arr[l]));
                    l++;
                }
            } else {
                sum += map.get(String.valueOf(arr[l]));
            }
        }
    }
}
