package com.codeking.lc;

import java.util.ArrayList;

/**
 * @author CodeKing
 * @since 2023/5/17  20:03
 */
public class lc06 {
    public static void main(String[] args) {
        lc06 lc06 = new lc06();
        String s = lc06.convert("AB", 1);
        System.out.println("s = " + s);
    }

    public String convert(String s, int numRows) {
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        // 添加行
        for (int i = 0; i < numRows; i++) {
            arr.add(new ArrayList<>());
        }
        int index = 0;
        int len = s.length();
        char[] sArr = s.toCharArray();
        int start = 0;
        do {
            if (numRows == 1) {
                start = 0;
            }
            while (index < len && start < numRows) {
                arr.get(start).add(String.valueOf(sArr[index]));
                start++;
                index++;
            }
            start = numRows - 1;
            int aim = start - 1;
            while (index < len) {
                if (start <= 0) {
                    break;
                }
                for (int i = 0; i < numRows; i++) {
                    if (i == aim) {
                        arr.get(i).add(String.valueOf(sArr[index]));
                        if (i == 0) {
                            break;
                        }
                    }
                }
                aim--;
                start--;
                index++;
            }
            start = 1;
        } while (index < len);
        StringBuilder result = new StringBuilder();
        for (ArrayList<String> sb : arr) {
            for (String s1 : sb) {
                result.append(s1);
            }
        }
        return result.toString();
    }
}
