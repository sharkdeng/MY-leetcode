package com.anu.game.JZ23;


public class Solution {

    public static void main(String[] args) {


    }


    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return Helper(sequence, 0, sequence.length -1);
    }

    public boolean Helper(int[] sequence, int start, int end){
        // invalid
        if (start >= end){
            return true;
        }
        int root = sequence[end];

        // check left
        int i = start;
        while (sequence[i] < root && i<end) {
            i++;
        }

        // check right
        int j=i;
        while (j<end){
            if (sequence[j] < root){
                return false;
            }
            j++;
        }

        boolean left = Helper(sequence, start, i-1);
        boolean right = Helper(sequence, i, end-1);
        return left && right;

    }
}