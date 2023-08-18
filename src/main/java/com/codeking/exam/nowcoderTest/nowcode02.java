package com.codeking.exam.nowcoderTest;

import java.util.Scanner;

/**
 * @author xiongjl
 * @since 2023/8/19  0:25
 */
public class nowcode02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 记录有几行
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x + y);
        }
    }
}
