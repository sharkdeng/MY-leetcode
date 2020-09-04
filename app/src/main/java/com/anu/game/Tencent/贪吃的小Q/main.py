n, m = map(int, input().split(' '))
 
def SumEat(e1, n):
    S = 0
    e = e1
    for i in range(0, n):
        S += e
        e = (e+1)//2
    return S
 
 
def BinarySearch(n, m):

    if n == 1:
        return m
        
        
    low = 1
    high = m
    while low<high:
        mid  = (low+high+1)//2
        if SumEat(mid, n)<=m:
            low = mid
        else:
            high = mid -1
    return low
 
print(BinarySearch(n, m))
