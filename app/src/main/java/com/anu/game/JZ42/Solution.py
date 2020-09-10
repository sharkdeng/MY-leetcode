
class Solution:
    def FindNumbersWithSum(self, array, tsum):
        # write code here
        re = []
        for n in array:
            if tsum-n in array:
                a = sorted([n, tsum-n])
                m = n*(tsum-n)
                if len(re) == 0:
                    re = a
                else:
                    mo = re[0] * re[1]
                    if m < mo:
                        re = a
                    
        
        return re
