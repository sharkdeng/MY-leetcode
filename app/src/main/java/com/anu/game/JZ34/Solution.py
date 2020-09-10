# -*- coding:utf-8 -*-
class Solution:
    def FirstNotRepeatingChar(self, s):
        # write code here
        if len(s) == 0: return -1
        
        a = {}
        for c in s:
            if s.count(c) == 1:
                return s.index(c)
        return -1
