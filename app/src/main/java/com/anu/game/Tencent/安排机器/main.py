
num_machine, num_task = map(int, input().split())
machine_list = []
task_list = []

for _i in range(num_machine):
    machine = list(map(int, input().split()))
    machine_list.append(machine)

for _j in range(num_task):
    task = list(map(int, input().split()))
    task_list.append(task)

machine_list.sort(reverse=True)  # 按时间成本从大到小排好
task_list.sort(reverse=True)  # 按时间成本从大到小排好


count = 0  # 完成工作计数
profit = 0  # 利润
level = [0]*101  # 等级列表
j = 0  # 机器计数

for i in range(num_task):
    while j < num_machine and machine_list[j][0] >= task_list[i][0]:
        level[machine_list[j][1]] += 1  # 机器的等级
        j += 1

    for k in range(task_list[i][1], 101):
        if level[k]:  # 如果为1，有机器可以用
            count += 1
            level[k] -= 1
            profit += task_list[i][0]*200 + task_list[i][1]*3
            break

print(count, profit)
