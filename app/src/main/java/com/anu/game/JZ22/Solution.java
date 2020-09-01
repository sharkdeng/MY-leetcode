package com.anu.game.JZ22;

import java.util.ArrayList;
import java.util.LinkedList;

 class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }
 }


public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<>();
        if (root==null)return re;

        //用链表生成队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            re.add(queue.pop().val);

            if (root.left!=null)
                queue.add(root.left);

            if (root.right!=null)
                queue.add(root.right);

            if (!queue.isEmpty())
                root=queue.peek();
        }
        return re;
    }
}