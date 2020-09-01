package com.anu.game.JZ17;


import android.content.Intent;

class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
        this.val = val;
     }
 }


public class Solution {


    public boolean HasSubtree(TreeNode root1, TreeNode root2) {

        if (root1== null || root2 == null){
            return false;
        }

        boolean a = check(root1, root2);
        if (a == false) {
            boolean left = HasSubtree(root1.left, root2);
            if (left == false){
                boolean right = HasSubtree(root1.right, root2);
                if (right == false) {
                    return false;
                }
            }
        }

        return true;

    }

    public boolean check(TreeNode root1, TreeNode root2){
        if (root1== null || root2 == null){
            return false;
        }
        if (root1.val == root2.val){
            return check(root1.left, root2.left) && check(root1.right, root2.right);
        }
        return false;
    }
}