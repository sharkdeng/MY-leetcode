package com.anu.game.JZ12;

public class Solution {
    public double Power(double base, int exponent) {
        double a = 1;
        if (exponent > 0){
            for (int i=0; i<exponent; i++){
                a *= base;
            }
        } else if (exponent < 0){
            for (int i=0; i<Math.abs(exponent); i++) {
                a /= base;
            }
        } else if (exponent == 0){
            return 1;
        }
        return a;
    }
}