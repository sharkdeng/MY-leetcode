
# -*- coding:utf-8 -*-
# class TreeLinkNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#         self.next = None


class Solution:
    def GetNext(self, pNode):
        # write code here
        
        #
        if not pNode:
            return None
        
        # has right
        if pNode.right:
            p = pNode.right
            while p.left:
                p = p.left
            return p
        
        # parent's left node
        p = pNode
        while True:
            if p.next and p.next.left == p:
                return p.next
            if not p.next:
                return None
            p = p.next
        
