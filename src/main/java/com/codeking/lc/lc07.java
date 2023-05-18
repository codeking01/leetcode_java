package com.codeking.lc;

/**
 * @author CodeKing
 * @since 2023/5/18  21:20
 */
public class lc07 {
    public static void main(String[] args) {
        lc07 lc07 = new lc07();
        System.out.println(lc07.reverse(1534236469));
    }

    public int reverse(int x) {
        int index = 0;
        while (x != 0) {
            if (index > Integer.MAX_VALUE / 10 || index < Integer.MIN_VALUE / 10) {
                return 0;
            }
            index = index * 10 + x % 10;
            x = x / 10;
        }
        return index;
    }
}
