package com.anu.game.JZ18;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
 }

public class Solution {
    public static void main(String[] args) {

    }

    public void Mirror(TreeNode node) {
        if (node == null){
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        Mirror(node.left);
        Mirror(node.right);

    }
}