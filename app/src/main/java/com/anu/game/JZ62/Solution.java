package com.anu.game.JZ62;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}




public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (k == 0 || pRoot == null) return null;


        List<TreeNode> tmp = new ArrayList<>();
        Sort(pRoot, tmp);

        if (k > tmp.size()) return null;

        return tmp.get(k-1);
    }


    public void Sort(TreeNode pRoot, List<TreeNode> tmp){
        if (pRoot.left != null) Sort(pRoot.left, tmp);
        tmp.add(pRoot);
        if (pRoot.right != null) Sort(pRoot.right, tmp);
    }

}