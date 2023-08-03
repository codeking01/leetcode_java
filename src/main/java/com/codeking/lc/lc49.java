package com.codeking.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author xiongjl
 * @since 2023/8/3  14:32
 */
public class lc49 {
    // 题目的意思理解需要参考 lc242
    public static void main(String[] args) {
        List<List<String>> lists = new lc49().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(lists);
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        // 这里写 排序+hash的思路
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] tempChar = str.toCharArray();
            Arrays.sort(tempChar);
            // 记录到hash表
            if (map.containsKey(new String(tempChar))) {
                map.get(new String(tempChar)).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(new String(tempChar), list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    }
}
