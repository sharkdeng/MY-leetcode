
class Solution:



    def maxEnvelopes(self, envelopes) -> int:
        if not envelopes: return 0

        # ascend the first element,
        # descend the second element
        envelopes = sorted(envelopes, key=lambda x: (x[0], -x[1]))


        n = len(envelopes)
        dp = [1] * n
        re = 0

        # build directed acyclic graph (DAG)
        # iterate each element
        for i in range(n): # first element can pass

            # for smaller elements
            for j in range(i):
                # condition 1:
                # when first element is <=,
                # when first element is equal, only options for second element is >=, pass
                # when first element is smaller, second element may be <, >, =
                # condition 2:
                # last  part to make sure each update for dp[i] is definitely increasing
                if envelopes[j][1] < envelopes[i][1] and dp[i] < dp[j] + 1:
                    dp[i] = dp[j] + 1
            
            re = max(dp[i], re) # get the longest path compared to before
        return re
        

if __name__ == '__main__':
    envelopes = [[2,100],[3,200],[4,300],[5,500],[5,400],
                [5,250],[6,370],[6,360],[7,380]]
    envelopes = [[1, 1]]
    envelopes = [[30,50],[12,2],[3,4],[12,15]]
                
    
    envelopes = sorted(envelopes, key=lambda x: (x[0],x[1])) # ascend first 1st column, then 2nd column
#    envelopes = sorted(envelopes, key=lambda x: (x[0])) # ascend only first 1st column

    envelopes = sorted(envelopes,key=lambda x:(x[0], -1*x[1]))
    print(envelopes)
    
    s = Solution()
    print(s.maxEnvelopes(envelopes))
    
