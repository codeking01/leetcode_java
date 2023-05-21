package com.codeking.lc;

import java.util.ArrayList;

/**
 * @author CodeKing
 * @since 2023/5/21  21:37
 */
public class lc14 {
    public static void main(String[] args) {
        lc14 lc14 = new lc14();
        System.out.println(lc14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        String maxStr = strs[0];
        // 先找到最短的
        for (String str : strs) {
            if (str.length() < maxStr.length()) {
                maxStr = str;
            }
        }
        ArrayList<String> arr = new ArrayList<>();
        // 结束外层循环
        outerLoop: for (int i = 0; i < maxStr.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (maxStr.charAt(i) != strs[j].charAt(i)) {
                    break outerLoop;
                } else if (j ==  strs.length-1) {
                    arr.add(String.valueOf(maxStr.charAt(i)));
                }
            }
        }
        if (arr.size() == 0) {
            return "";
        }
        return String.join("", arr);
    }
}
