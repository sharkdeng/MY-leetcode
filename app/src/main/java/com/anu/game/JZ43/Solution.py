
class Solution:
    def LeftRotateString(self, s, n):
        # write code here
        a = s[:n]
        return s[n:] + a
