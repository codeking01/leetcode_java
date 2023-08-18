package com.codeking.exam.nowcoderTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author xiongjl
 * @since 2023/8/19  0:30
 */
public class nowcode03 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = scanner.nextInt();
            if (n == 0) {
                return;
            }
            int temp = 0;
            for (int i = 0; i < n; i++) {
                temp += scanner.nextInt();
            }
            System.out.println(temp);
        }*/
        test11();
    }

    public static void test05() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int N = scanner.nextInt();
            int temp = 0;
            for (int j = 0; j < N; j++) {
                temp += scanner.nextInt();
            }
            System.out.println(temp);
        }
    }

    public static void test06() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = scanner.nextInt();
            int temp = 0;
            for (int i = 0; i < n; i++) {
                temp += scanner.nextInt();
            }
            System.out.println(temp);
        }
    }

    public static void test07() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            int temp = 0;
            for (String string : s1) {
                temp += Integer.parseInt(string);
            }
            System.out.println(temp);
        }
    }

    public static void test08() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }
        Collections.sort(list);
        for (String string : list) {
            System.out.print(string + " ");
        }
    }

    public static void test09() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] s;
            s = scanner.nextLine().split(" ");
            Arrays.sort(s);
            for (String item : s) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void test10() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] s = scanner.nextLine().split(",");
            Arrays.sort(s);
            for (int i = 0; i < s.length; i++) {
                if (i != s.length - 1) {
                    System.out.print(s[i] + ",");
                } else {
                    System.out.print(s[i]);
                }
            }
            System.out.println();
        }
    }

    public static void test11() {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        while (scanner.hasNext()) {
            String[] s = scanner.nextLine().split(" ");
            for (int i = 0; i < 2; i++) {
                sum += Long.parseLong(s[i]);
            }
            System.out.println(sum);
            sum = 0;
        }

    }

}
