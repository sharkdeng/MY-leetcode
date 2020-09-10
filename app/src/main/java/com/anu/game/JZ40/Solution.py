
class Solution:
    # 返回[a,b] 其中ab是出现一次的两个数字
    def FindNumsAppearOnce(self, array):
        a = {}
        for n in array:
            if n in a.keys():
                a[n] += 1
            else:
                a[n] = 1
        
        re = ""
        for k in a.keys():
            if a[k] == 1:
                re += str(k)
        return re
