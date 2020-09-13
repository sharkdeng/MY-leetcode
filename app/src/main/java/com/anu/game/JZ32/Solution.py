
class Solution:
    def PrintMinNumber(self, numbers):
        # write code here
        for i in range(len(numbers)):
            for j in range(i+1, len(numbers)):
                a = str(numbers[i])
                b = str(numbers[j])
                if a+b > b+a:
                    tmp = numbers[i]
                    numbers[i] = numbers[j]
                    numbers[j] = tmp
        return ''.join([str(i) for i in numbers])


if __name__ == '__main__':
    s = Solution()
    a = s.PrintMinNumber([3,5,1,4,2])
    print(a)
