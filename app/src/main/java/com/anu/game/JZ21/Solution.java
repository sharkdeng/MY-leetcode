package com.anu.game.JZ21;


import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};
        boolean re = IsPopOrder(a, b);
        System.out.println(re);
    }


    public static boolean IsPopOrder(int [] pushA, int [] popA) {
        Stack<Integer> tmp = new Stack<Integer>();
        for (int i=0; i<pushA.length; i++){
            tmp.add(pushA[i]);
        }
        for (int i=0; i<popA.length; i++){
            int a = tmp.pop();
            if (popA[i] != a){
                return false;
            }
        }
        return true;
    }
}