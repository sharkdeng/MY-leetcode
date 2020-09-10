
# -*- coding:utf-8 -*-

# compare left part and right part in the inorder
# 对于叶节点，比如5，我打印#5#
# 对于非叶节点，但却一个子节点，我假设那个节点是#，所以会打印###。


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
    
    def in_order(self, pRoot):
        re = []
        
        if pRoot.left:
            re += self.in_order(pRoot.left)
        else:
            if pRoot.right:
                re += ['#']*3
            else:
                re.append('#')
                
        re.append(pRoot.val)
        
        if pRoot.right:
            re += self.in_order(pRoot.right)
        else:
            if pRoot.left:
                re += ['#']*3
            else:
                re.append('#')
        return re
        
        
    def isSymmetrical(self, pRoot):
        # write code here
        # {}
        if pRoot is None:
            return True
            
        # {1}
        if not pRoot.left and not pRoot.right:
            return True

        if pRoot.left.val != pRoot.right.val:
            return False
            
        re = self.in_order(pRoot)
        left = re[:len(re)//2]
        right = re[len(re)//2+1:]

        print(left)
        print(right)
        if left == right[::-1]:
            return True
        
        return False
        
        
        
        
if __name__ == '__main__':
    s = Solution()
    root = TreeNode(5)
    
    root.left = TreeNode(5)
    root.right = TreeNode(5)
    
    root.left.left = TreeNode(5)
    root.right.right = TreeNode(5)
    
    root.left.left.left = TreeNode(5)
    root.right.right.left = TreeNode(5)
    
    
    root.print_inorder()
    print(s.in_order(root))
    print(s.isSymmetrical(root))
    
    
    
