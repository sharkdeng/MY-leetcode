
# -*- coding:utf-8 -*-

import unittest

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
        
        
    def add(self, x):
        tmp = self
        while tmp.next:
            tmp = tmp.next
        tmp.next = ListNode(x)
        
        
    def print(self):
        tmp = self
        while tmp.next:
            print(f'{tmp.val} -> ', end='')
            tmp = tmp.next
        print(tmp.val)
        
        
        
        
class Solution:
    def deleteDuplication(self, pHead):
        # write code here
        
        # 0 or 1 node
        if not pHead or not pHead.next:
            return pHead

        # >=2 nodes
        tmp = ListNode(-1)
        tmp.next = pHead
        cur = -1

        while tmp.next and tmp.next.next:
            if tmp.next.val == tmp.next.next.val:
                # update cur
                cur = tmp.next.val

                # find all match nodes
                while tmp.next.val == cur:

                    # last node
                    if not tmp.next.next:
                        tmp.next = None
                        break
                    else:
                        tmp.next = tmp.next.next


                # in case head is changed
                if tmp.val == -1:
                    pHead = tmp.next
            else:
                tmp = tmp.next
                
  
        return pHead
                
                    

 
 
      
      
if __name__ == '__main__':
    s = Solution()
    
    root = ListNode(1)
    root.add(1)
    root.add(1)
    root.add(1)
    root.add(1)
    

    
    root = s.deleteDuplication(root)
    root.print()
    
    
  
