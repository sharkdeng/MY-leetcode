package com.anu.game.Leetcode606;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }


class Solution {
    public String tree2str(TreeNode t) {
        String re = "";
        if (t == null){
            return re;
        }

        re += String.valueOf(t.val);
        String left = tree2str(t.left);
        String right = tree2str(t.right);

        if (left == "" && right == ""){
            return re;
        } else if (left == "" && right != "" ){
            re += "()(";
            re += right;
            re += ")";

        } else if (left != "" && right == "") {
            re += "(";
            re += left;
            re += ")";
        } else {
            re += "(";
            re += left;
            re += ")";
            re += "(";
            re += right;
            re += ")";
        }

        return re;

    }
}