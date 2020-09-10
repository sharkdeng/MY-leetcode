
class Solution:
    def FindContinuousSequence(self, tsum):
        # write code here
        re = []
        a = 1
        b = 2
        s = ((b-a+1)*(a+b))/2
        
        while a < b and b < tsum:
            s = ((b-a+1)*(a+b))/2
            
            # not find
            if s > tsum:
                a += 1
                b = a+1
            
            # find
            elif s == tsum:
                re.append(list(range(a, b+1)))
                a += 1
                b = a+1
                
            else:
                b += 1
        return re


if __name__ == '__main__':
    
    s = Solution()
    print(s.FindContinuousSequence(9))
