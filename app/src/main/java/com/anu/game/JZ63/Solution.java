package com.anu.game.JZ63;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {

    List<Integer> tmp = new ArrayList<>();
    public void Insert(Integer num) {
        tmp.add(num);
    }

    public Double GetMedian() {
        Collections.sort(tmp);
        if (tmp.size() % 2 == 0){
            int a = (int)tmp.size()/2;
            int b = (int)tmp.size()/2-1;
            return (double)(tmp.get(a) + tmp.get(b))/2;
        } else {
            int a = (int)tmp.size()/2;
            return (double) tmp.get(a);
        }
    }


}