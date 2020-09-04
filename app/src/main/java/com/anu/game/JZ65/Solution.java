package com.anu.game.JZ65;

public class Solution {
    boolean[] flag;


    public static void main(String[] args) {
        Solution s = new Solution();
        char[] matrix = {'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E'};
        char[] str = {'S', 'E', 'E'};
        System.out.println(s.hasPath(matrix, 3, 4, str));

    }


    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        // init
        flag = new boolean[matrix.length];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++){
                if(judge(matrix, i, j, rows, cols, flag, str, 0)) return true;
            }
        }
        return false;

    }



    public boolean judge(char[] matrix,
                         int i,
                         int j,
                         int rows,
                         int cols,
                         boolean[] flag,
                         char[] str,
                         int k) {
        // out of boundary
        if (i<0 || j<0 || i >= rows || j >= cols ) return false;

        // not equal
        int idx = i*cols + j;
        if (matrix[idx] != str[k]) return false; //not equal
        if (flag[idx])return false; // has visited
        if (k == str.length-1) return true;  // last element


        // change current state
        flag[idx] = true;


        //recursive
        if (judge(matrix, i+1, j, rows, cols, flag, str, k+1) ||
                judge(matrix, i-1, j, rows, cols, flag, str, k+1) ||
                judge(matrix, i, j+1, rows, cols, flag, str, k+1) ||
                judge(matrix, i, j-1, rows, cols, flag, str, k+1)
        ) {
            return true;
        } else {
            flag[idx] = false;
            return false;
        }

    }

}