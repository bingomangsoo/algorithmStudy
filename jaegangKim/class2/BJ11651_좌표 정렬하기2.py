import sys
input=sys.stdin.readline

n = int(input())
xy = []
for i in range(n):
    x,y = map(int,input().split())
    xy.append([y,x])
xy.sort()
for x in xy:
    print(x[1],x[0])
