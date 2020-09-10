

# -*- coding:utf-8 -*-

# recursion


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
        
        
    def add(self, val):
        q = []
        q.append(self)
        
        while len(q) > 0:
            pRoot = q[0]
            q.pop(0)
            
            if pRoot.left is None:
                pRoot.left = TreeNode(val)
                break
            else:
                if pRoot.left.val != '#':
                    q.append(pRoot.left)
                
            if pRoot.right is None:
                pRoot.right = TreeNode(val)
                break
            else:
                if pRoot.right.val != '#':
                    q.append(pRoot.right)
                
                
    def print_inorder(self):
        if self.left: self.left.print_inorder()
        print(self.val)
        if self.right: self.right.print_inorder()
        
            
        
                


class Solution:
    
        
    def _isSym(self, left, right):
        if not left and not right: return True
        if (not left) or (not right): return False
        if left.val != right.val: return False
        
        return self._isSym(left.left, right.right) and self._isSym(left.right, right.left)
    
    
    def isSymmetrical(self, pRoot):
        if not pRoot: return True
        return self._isSym(pRoot.left, pRoot.right)
       

        
        
        
        
if __name__ == '__main__':
    s = Solution()
    root = TreeNode(5)
    
    root.left = TreeNode(5)
    root.right = TreeNode(5)
    
    root.left.left = TreeNode(5)
    root.right.right = TreeNode(5)
    
    root.left.left.left = TreeNode(5)
    root.right.right.left = TreeNode(5)
    
    print(s.isSymmetrical(root))
    
    
    
