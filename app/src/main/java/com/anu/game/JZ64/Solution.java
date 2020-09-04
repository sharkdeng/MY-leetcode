package com.anu.game.JZ64;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> re = new ArrayList<>();
        if (size > num.length || size <= 0) return re;

        for (int i=0; i<=num.length-size; i++){
            int max = 0;
            for (int j=i; j<i+size; j++){
                if (num[j] > max) max = num[j];
            }
            re.add(max);
        }
        return re;
    }
}