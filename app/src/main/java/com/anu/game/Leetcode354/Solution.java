package com.anu.game.Leetcode354;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] envelopes = {{6, 7, 4}, {2, 3, 2}};

        // ascend according to envelopes[:, i]
        Arrays.sort(envelopes, (int[] x, int[] y) -> x[2] - y[2]);



        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.println(envelopes[i][j]);
            }
        }
    }


    boolean canFit(int[] a, int[] b) {  // Rectangle a can fit into rectangle b.
        return (a[0] < b[0] && a[1] < b[1]);
    }


    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length == 0) return 0;

        // ascend sort envelopes according to width (0 means first element)
        Arrays.sort(envelopes, (int[] x, int[] y) -> x[0] - y[0]);
        int n = envelopes.length;
        int dp[] = new int[n];
        int rst = 0;
        for(int i = 0; i < n; ++i) {
            int max = 0;
            for(int j = 0; j < i; ++j) {
                if(canFit(envelopes[j], envelopes[i])) max = Math.max(max, dp[j]);
            }
            dp[i] = max + 1;
            rst = Math.max(dp[i], rst);
        }
        return rst;
    }
}
