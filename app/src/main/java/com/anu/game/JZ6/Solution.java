package com.anu.game.JZ6;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int a = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] < a){
                return array[i];
            }
        }
        return 0;
    }
}