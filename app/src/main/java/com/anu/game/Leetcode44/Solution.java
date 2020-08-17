package com.anu.game.Leetcode44;

public class Solution {
    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*d";

        boolean r = isMatch(s, p);
        System.out.println(r);
    }


    public static boolean isMatch(String s, String p) {

        // dp
        boolean[][] match = new boolean[s.length()+1][p.length()+1];

        // last element
        match[s.length()][p.length()]=true;


        // check if the last element in p is *
        for(int i=p.length()-1;i>=0;i--){
            if (p.charAt(i) == '*') {
                match[s.length()][i] = true;
            } else {
                break;
            }
        }

        for(int i=s.length()-1; i>=0; i--){
            for(int j=p.length()-1; j>=0; j--){
                if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')
                    match[i][j]=match[i+1][j+1];
                else if(p.charAt(j)=='*')
                    match[i][j]=match[i+1][j]||match[i][j+1];
                else
                    match[i][j]=false;
            }
        }
        return match[0][0];
    }



}
