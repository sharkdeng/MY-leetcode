package com.anu.game.JZ1;

public class Solution {

    public static void main(String[] args) {
        int[][] a = {   { 1, 2 },
                        { 3, 4 } };

        boolean found = Find(5, a);
        System.out.println(found);
    }


    public static boolean Find(int target, int [][] array) {

        // find from the left down corner

        int i=array.length-1;
        int j=0;
        while(i>=0&&j<=array[0].length-1){

            if(array[i][j]>target){
                i--;
            }else if(array[i][j]<target){
                j++;
            }else return true;

        }
        return false;

    }
}