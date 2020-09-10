# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    
    def Print(self, pRoot):
        re = []
            
        def _levelorder(root, depth, re):
            '''change re'''
            if root is None:
                return
                
            if depth > len(re):
                re.append([])
            
            re[depth-1].append(root.val)
            
            _levelorder(root.left, depth+1, re)
            _levelorder(root.right, depth+1, re)
            
        _levelorder(pRoot, 1, re)
            
        
        # print
        result = []
        for i in range(len(re)):
            if i % 2 == 0:
                result.append(re[i])
            else:
                result.append(re[i][::-1])
        return result
        
        
        
        
        
        
        
