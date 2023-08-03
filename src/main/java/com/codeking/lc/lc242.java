package com.codeking.lc;

import java.util.Arrays;

/**
 * @author xiongjl
 * @since 2023/8/3  15:49
 */
public class lc242 {
    public static void main(String[] args) {
        boolean anagram = new lc242().isAnagram("anagram", "nagaram");
        System.out.println(anagram);
    }

    /* public boolean isAnagram(String s, String t) {
         // 直接建立一个hash表就行
         if (s.length() != t.length()) {
             return false;
         }
         HashMap<Character, Integer> map = new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
         }
         for (int i = 0; i < t.length(); i++) {
             if (map.containsKey(t.charAt(i))) {
                 if (map.get(t.charAt(i)) == 0) {
                     return false;
                 }
                 map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
             } else {
                 return false;
             }
         }
         return true;
     }*/
    public boolean isAnagram(String s, String t) {
        // 排序，看两个元素是否相等
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
