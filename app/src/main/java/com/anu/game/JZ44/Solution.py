
class Solution:
    def ReverseSentence(self, s):
        # write code here
        a = s.split(' ')
        return ' '.join(a[::-1])
