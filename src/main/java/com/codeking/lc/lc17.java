package com.codeking.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CodeKing
 * @since 2023/7/12  20:22
 */
public class lc17 {
    //设置全局列表存储最后的结果
    List<String> list = new ArrayList<>();
    //因为每次迭代获取一个字符串，所以会设计大量的字符串拼接
    StringBuilder temp = new StringBuilder();

    public static void main(String[] args) {
        lc17 lc17 = new lc17();
        // 测试
        List<String> strings = lc17.letterCombinations("23");
        System.out.println(strings);
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return list;
        }
        // 先记录 2-9的字母，存为map
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTracing(digits, map, 0);
        return list;
    }

    public void backTracing(String digits, Map<Character, String> map, int index) {
        if (digits.length() == index) {
            list.add(temp.toString());
            return;
        }
        StringBuilder str = new StringBuilder(map.get(digits.charAt(index)));
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTracing(digits, map, index + 1);
            // 回溯
            temp.deleteCharAt(temp.length() - 1);
        }
    }

}
