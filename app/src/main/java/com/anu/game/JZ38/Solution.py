
class Solution:
    def __init__(self):
        self.re = []
        
        
    def TreeDepth(self, pRoot):
        # write code here
        
        self.inorder(pRoot, 1)
        return len(self.re)
        
    def inorder(self, pRoot, depth):
        if not pRoot:
            return
        if (depth > len(self.re)):
            self.re.append([])
        self.re[depth-1].append(pRoot.val)
        self.inorder(pRoot.left, depth+1)
        self.inorder(pRoot.right, depth+1)
