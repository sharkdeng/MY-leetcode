package com.anu.game.JZ60;
import java.util.ArrayList;



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


    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> re = new ArrayList<>();
        Get(pRoot, 1, re);
        return re;
    }

    void Get(TreeNode pRoot, int depth, ArrayList<ArrayList<Integer>> re) {
        if (pRoot == null) return;
        if (depth > re.size()) {
            re.add(new ArrayList<Integer>());
        }
        re.get(depth-1).add(pRoot.val);
        if (pRoot.left != null) Get(pRoot.left, depth+1, re);
        if (pRoot.right != null) Get(pRoot.right, depth+1, re);
    }



}