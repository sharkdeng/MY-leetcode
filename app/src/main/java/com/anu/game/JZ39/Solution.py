
# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    

        
    def IsBalanced_Solution(self, pRoot):
        # write code here
        if not pRoot: return True
        return self.get_Tree_Depth(pRoot) != -1
    
    
    def get_Tree_Depth(self, pRoot):
        if not pRoot: return 0
        
        left = self.get_Tree_Depth(pRoot.left)
        if left == -1: return -1
        right = self.get_Tree_Depth(pRoot.right)
        if right == -1: return -1
        
        
        if abs(left-right)>1:
            return -1
        else:
            return max(left, right)+1
        
