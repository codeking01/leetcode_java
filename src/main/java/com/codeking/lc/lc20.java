package com.codeking.lc;

import java.util.*;

/**
 * @author CodeKing
 * @since 2023/5/23  21:34
 */
public class lc20 {
    public static void main(String[] args) {
        lc20 lc20 = new lc20();
        boolean b = lc20.isValid("()[]{}");
        System.out.println("b = " + b);
    }

   /* public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }
        // 使用栈
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        for (char c : arr) {
            if (c == '[' || c == '{' || c == '(') {
                stack.add(c);
            } else if (!stack.isEmpty()) {
                Character pop = stack.pop();
                if (c != map.get(pop)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }*/
   public boolean isValid(String s) {
       while (s.contains("()")||s.contains("[]")||s.contains("{}")) {
           s=s.replace("{}","");
           s=s.replace("[]","");
           s=s.replace("()", "");
       }
       return s.equals("");
   }
}
