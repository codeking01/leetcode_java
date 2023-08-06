package com.codeking.lc;

import java.util.Arrays;

/**
 * @author xiongjl
 * @since 2023/8/6  14:25
 */
public class lc73 {
    public static void main(String[] args) {
        new lc73().setZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
    }

    public void setZeroes(int[][] matrix) {
        // 这个题目很关键的一个做法就是最上面的一行和最左边的一行用来记录0
        boolean colZero = false, rowZero = false;
        if (matrix[0][0] == 0) {
            colZero = true;
            rowZero = true;
        } else {
            for (int i = 1; i < matrix[0].length; i++) {
                if (matrix[0][i] == 0) {
                    rowZero = true;
                    break;
                }
            }
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][0] == 0) {
                    colZero = true;
                    break;
                }
            }
        }
        // 将0全部移动到边界
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // 先处理列
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        // 再处理行
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // 处理最外层
        if (rowZero) {
            Arrays.fill(matrix[0], 0);
        }
        if (colZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        // 打印
        /*for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }*/
    }
}
