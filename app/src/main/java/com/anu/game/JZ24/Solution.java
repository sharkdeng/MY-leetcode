package com.anu.game.JZ24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
         this.val = val;
     }

     public void add(int newVal) {
         // suppose root exits
         if (newVal < this.val) {
             if (this.left == null) {
                 this.left = new TreeNode(newVal);
             } else {
                 _add(this.left, newVal);
             }
         } else if (newVal  > this.val) {
             if (this.right == null) {
                 this.right = new TreeNode(newVal);
             } else {
                 _add(this.right, newVal);
             }
         }
     }

     public void _add(TreeNode root, int newVal) {

         // suppose root exits
         if (newVal < root.val) {
             if (root.left == null) {
                 root.left = new TreeNode(newVal);
             } else {
                 _add(root.left, newVal);
             }
         } else if (newVal  > root.val) {
             if (root.right == null) {
                 root.right = new TreeNode(newVal);
             } else {
                 _add(root.right, newVal);
             }
         }
     }


     public void preOrder() {
         _preOrder(this.left);
         System.out.println(this.val);
         _preOrder(this.right);
     }

     public void _preOrder(TreeNode root) {
         if (root == null) return;
         _preOrder(root.left);
         System.out.println(root.val);
         _preOrder(root.right);
     }
 }



public class Solution {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(10,5,12,4,7);

        TreeNode root = new TreeNode(10);
        root.add(5);
        root.add(12);
        root.add(4);
        root.add(7);


        FindPath(root,22);

    }

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> re = new ArrayList<>();
        if (root == null) return re;

        ArrayList<Integer> path = new ArrayList<>();
        Find(root, path, re, target);

        return re;
    }



    public static void Find(TreeNode curNode,
                     ArrayList<Integer>path,
                     ArrayList<ArrayList<Integer>> re,
                     int curTarget) {


        // leaf node
        if (curTarget == curNode.val && curNode.left == null && curNode.right == null) {
            path.add(curNode.val);
            re.add(path);
        }
        // intermediate node
        if (curTarget > curNode.val) {
            path.add(curNode.val);

            if (curNode.left != null){
                ArrayList<Integer> curPath = new ArrayList<>(path);
                Find(curNode.left, curPath, re, curTarget-curNode.val);
            }
            if (curNode.right != null){
                ArrayList<Integer> curPath = new ArrayList<>(path);
                Find(curNode.right, path, re, curTarget-curNode.val);
            }
        }

    }
}

