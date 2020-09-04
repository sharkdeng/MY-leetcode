package com.anu.game.Tencent;

import java.util.Scanner;



public class Solution{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(process(n, m));

    }

    public static long process(long n, long m){
        if(n % (2*m) != 0)
            return -1;
        return m * (n / 2);
    }

}