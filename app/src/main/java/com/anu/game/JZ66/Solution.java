package com.anu.game.JZ66;

public class Solution {
    int threshold;
    int rows;
    int cols;
    boolean isWall[][];
    boolean isVisited[][];
    int nNode = 0;


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.movingCount(5, 10, 10));
    }



    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold <= 0 || rows <0 || cols < 0) return 0;

        // init
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        this.isVisited = new boolean[rows][cols];
        this.isWall = new boolean[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++) {
                this.isVisited[i][j] = false;
                if ((i/10 + i%10 + j/10 + j%10) > threshold) {
                    this.isWall[i][j] = true;
                } else {
                    this.isWall[i][j] = false;
                }
            }
        }

        DFS(0, 0);

        return this.nNode;
    }


    public void DFS(int row, int col) {
        if (outOfBoundary(this.rows, this.cols, row, col)
                || isVisited[row][col]
                || isWall[row][col]) return;


        isVisited[row][col] = true;
        this.nNode++;


        DFS(row-1, col);
        DFS(row+1, col);
        DFS(row, col-1);
        DFS(row, col+1);
    }



    public boolean outOfBoundary(int rows, int cols, int row, int col) {
        return (row < 0 || col < 0 || row >= rows || col >= cols);
    }
}