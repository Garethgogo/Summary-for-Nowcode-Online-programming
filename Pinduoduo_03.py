n = int(input())
h = list(map(int,input().split()))
m = int(input())
w = list(map(int,input().split()))
h.sort()
w.sort()
start = 0
count = 0
for i in range(m):
    if w[i]<h[start]:
        continue
    else:
        count=count+1
        start=start+1
        if start==n:
            break
print(count)
'''
题目描述
六一儿童节，老师带了很多好吃的巧克力到幼儿园。每块巧克力j的重量为w[j]，对于每个小朋友i，当他分到的巧克力大小达到h[i] (即w[j]>=h[i])，他才会上去表演节目。老师的目标是将巧克力分发给孩子们，使得最多的小孩上台表演。可以保证每个w[i]> 0且不能将多块巧克力分给一个孩子或将一块分给多个孩子。
输入描述:
第一行：n，表示h数组元素个数
 第二行：n个h数组元素
 第三行：m，表示w数组元素个数
 第四行：m个w数组元素
输出描述:
上台表演学生人数
'''
