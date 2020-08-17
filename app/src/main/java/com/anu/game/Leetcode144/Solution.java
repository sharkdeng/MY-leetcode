package com.anu.game.Leetcode144;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



// Definition for a binary tree node.
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




public class Solution {

    // method 1
    // iterative
    public List<Integer> preorderTraversal_iterative(TreeNode node) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> tmp = new Stack<TreeNode>();

        while (node != null){
            list.add(node.val);

            // leave right
            if (node.right!=null){
                tmp.push(node.right);
            }

            node = node.left;

            // terminate condition
            if (node == null && !tmp.isEmpty()){
                node = tmp.pop();
            }
        }

        return list;
    }


    // method 2
    // recursive
    public void helper(TreeNode node, List<Integer> pre){
        if (node == null){
            return;
        }
        pre.add(node.val);
        helper(node.left, pre);
        helper(node.right, pre);
    }

    public List<Integer> preorderTraversal_recursive(TreeNode node) {
        List<Integer> pre = new ArrayList<Integer>();
        helper(node, pre);
        return pre;
    }
}
