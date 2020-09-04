package com.anu.game.JZ26;

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
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        List<TreeNode> tmp = new ArrayList<TreeNode>();
        GetNodes(pRootOfTree, tmp);
        return PutChains(tmp);
    }

    // miOrder put all nodes into a list
    public void GetNodes(TreeNode root, List<TreeNode> tmp) {
        if (root.left != null) GetNodes(root.left, tmp);
        tmp.add(root);
        if (root.right != null) GetNodes(root.right, tmp);
    }

    // add chains
    public TreeNode PutChains(List<TreeNode> tmp){
        for (int i=0; i<tmp.size()-1; i++){
            tmp.get(i).right = tmp.get(i+1);
            tmp.get(i+1).left = tmp.get(i);
        }
        return tmp.get(0);
    }
}