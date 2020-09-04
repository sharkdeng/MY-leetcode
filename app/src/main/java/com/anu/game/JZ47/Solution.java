package com.anu.game.JZ47;

public class Solution {
    public int Sum_Solution(int n) {
        return n == 1? 1 : n + Sum_Solution(n-1);
    }
}