
class TreeNode:
    
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None
        
        
    def add(self, val):
        if val < self.val:
            if self.left is None:
                self.left = TreeNode(val)
            else:
                self.left.add(val)
        elif val > self.val:
            if self.right is None:
                self.right = TreeNode(val)
            else:
                self.right.add(val)
                
        else:
            raise ValueError(f"Val {val} already exists")
        
        
    def print_preorder(self):
        print(self.val)
     
        if self.left is not None:
            self.left.print_preorder()
           
        if self.right is not None:
            self.right.print_preorder()
            
    def print_midorder(self):
        if self.left is not None:
            self.left.print_midorder()
           
        print(self.val)
        
        if self.right is not None:
            self.right.print_midorder()
        
        
    def print_postorder(self):
        if self.left is not None:
            self.left.print_postorder()
        
        if self.right is not None:
            self.right.print_postorder()
            
        print(self.val)
    
    
    def print_levelorder(self):
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
            
        _levelorder(self, 1, re)
            
        
        # print
        for i in range(len(re)):
            if i % 2 == 0:
                print(re[i])
            else:
                print(re[i][::-1])
        
    
    
    

    

if __name__ == '__main__':
    root = TreeNode(8)
    root.add(6)
    root.add(10)
    
    root.add(5)
    root.add(7)
    root.add(9)
    root.add(11)
    
    root.print_levelorder()
