package com.anu.game.JZ10;

public class Solution {
    public int RectCover(int target) {
        if (target <=3) {
            return target;
        } else {
            return RectCover(target-1) + RectCover(target-2);
        }
    }
}