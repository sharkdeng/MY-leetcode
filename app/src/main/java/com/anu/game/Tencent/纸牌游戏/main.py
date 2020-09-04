

n = int(input())
num_list = list(map(int, input().split()))
num_list.sort(reverse=True)
s = 0
for i in range(n):
  s += (-1)**i * num_list[i]
print(s)
