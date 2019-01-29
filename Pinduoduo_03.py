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
