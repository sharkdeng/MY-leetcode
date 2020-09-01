package com.anu.game.JZ19;



import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=0,r=matrix[0].length-1;
        int t=0,b=matrix.length-1;
        while(true){
            for(int i=l;i<=r;i++){
                list.add(matrix[t][i]);

            }if(++t>b) break;
            for(int i=t;i<=b;i++){
                list.add(matrix[i][r]);

            }if(l>--r) break;
            for(int i=r;i>=l;i--){
                list.add(matrix[b][i]);

            }if(t>--b) break;
            for(int i=b;i>=t;i--){
                list.add(matrix[i][l]);

            }if(++l>r) break;

        }
        return list;

    }
}




