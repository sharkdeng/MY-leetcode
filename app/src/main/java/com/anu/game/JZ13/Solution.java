package com.anu.game.JZ13;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 3, 2, 6};
        reOrderArray(a);

    }


    public static void reOrderArray(int [] array) {
        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        int odd_n = 0;
        int even_n = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] % 2 == 1){
                odd[odd_n++] = array[i];
            } else {
                even[even_n++] = array[i];
            }
        }



        for (int i=0; i<array.length; i++){
            if (i < odd_n){
                array[i] = odd[i];
            } else {
                array[i] = even[i-odd_n];
            }
        }
    }
}