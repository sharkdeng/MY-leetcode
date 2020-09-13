
# -*- coding:utf-8 -*-
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    def FindFirstCommonNode(self, pHead1, pHead2):
        # write code here
        tmp1 = pHead1
        tmp2 = pHead2
        while (tmp1 != tmp2):
            if (tmp1): tmp1 = tmp1.next
            if (tmp2): tmp2 = tmp2.next
            if (tmp1 != tmp2):
                if (not tmp1): tmp1 = pHead2
                if (not tmp2): tmp2 = pHead1
                    
        return tmp1
