package com.anu.game.Leetcode331;

class Solution {
    public static void main(String[] args) {
        String o = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        boolean re = isValidSerialization(o);
        System.out.println(re);


    }
    public static boolean isValidSerialization(String preorder) {
        // number of edge = number of node - 1
        // because each edge is connected to a node, except the root node
        int edge = 1;
        String[] tmp = preorder.split(",");
        for (String s: tmp){

            edge -= 1;
            if (edge < 0) {
                return false;
            }
            if (!s.equals("#")) {
                edge += 2;
            }
        }
        return edge == 0;

    }
}