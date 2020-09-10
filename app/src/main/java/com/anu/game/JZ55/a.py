# -*- coding:utf-8 -*-
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
        idx = 0
        while tmp.next:
            print(f'{tmp.val} -> ', end='')
            tmp = tmp.next
            idx += 1
            if idx > 10:
                break
        print(tmp.val)
        
class Solution:
    def EntryNodeOfLoop(self, pHead):
        ## 1 -> 2 -> 3 -> 4 -> 5 ( -> 3 ... )
        # a=2 (distance to entry of circle, 1, 2)
        # b=1 (distance from entry to the meet point, 3)
        # c=2 (distance from the meet point to the entry of circle, 4, 5)
        # fast moved a+(b+c)k+c
        # slow moved a+b
        # to prove 1) they meet in the circle and 2) the a=c
        # since fast moved twice than slow
        # thus, a+(b+c)k+b = 2(a+b)
        # a = (b+c)k-b = c + (b+c)(k-1)
        if not pHead:
            return None
        if not pHead.next:
            return None
            
        p1 = pHead # slow pointer
        p2 = pHead # fast pointer
        # move them or the next while cannot run
        p1 = p1.next
        p2 = p2.next.next
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next.next
            
            
        p1 = pHead
        while p1 != p2:
            print(p1.val, p2.val)
            p1 = p1.next
            p2 = p2.next
        return p1



if __name__ == '__main__':
    
    root = ListNode(1)
    root.add(2)
    root.add(3)
    root.add(4)
    root.add(5)
  
    tmp1 = root
    while tmp1.val != 3:
        tmp1 = tmp1.next
    tmp2 = root
    while tmp2.val != 5:
        tmp2 = tmp2.next
    tmp2.next = tmp1
    
    root.print()
    
    
    s = Solution()
    a = s.EntryNodeOfLoop(root)
    print(a.val)
    
    
    
    
            
        
  
