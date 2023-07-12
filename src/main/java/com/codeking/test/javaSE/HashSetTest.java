package com.codeking.test.javaSE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author CodeKing
 * @since 2023/5/31  19:04
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        boolean b = set.add(1);
        System.out.println(b);
        boolean b1 = set.add(1);
        System.out.println(b1);
        System.out.println(set);
        // 新增HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        // 遍历
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("------------------");
        // 其他的遍历方式
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("------------------");
        // 其他的遍历方式
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("------------------");
        // 其他的遍历方式
        for (Map.Entry<String, Integer> map_entry : map.entrySet()) {
            System.out.println(map_entry.getKey() + ":" + map_entry.getValue());
        }
    }
}
