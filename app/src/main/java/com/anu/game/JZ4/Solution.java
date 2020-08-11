package com.anu.game.JZ4;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] r = Arrays.copyOfRange(a, 2, 4);
        for (int i=0; i<r.length; i++){
            System.out.println(r[i]);
        }
    }
}