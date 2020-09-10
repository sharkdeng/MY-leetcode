
class Solution:
    # s字符串
    def isNumeric(self, s):
        # write code here
        
        try:
            p = float(s)
            return True
        except:
            return False
