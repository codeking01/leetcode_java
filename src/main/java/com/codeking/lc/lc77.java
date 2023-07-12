package com.codeking.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CodeKing
 * @since 2023/6/7  22:31
 */
public class lc77 {
    public static void main(String[] args) {
        List<List<Integer>> combine = new lc77().combine(4, 2);
        System.out.println(combine);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        BackTracing(n, k, 1, path, res);
        return res;
    }

    public void BackTracing(int n, int k, int start, List<Integer> path, List<List<Integer>> res) {
        if (k == path.size()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            BackTracing(n, k, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
