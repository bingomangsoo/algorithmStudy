# input으로만 하면 시간차이가 매우 심함
import sys
input=sys.stdin.readline

n = int(input())
xyList = []
for i in range(n):
    x,y = input().split()
    xyList.append([int(x),y])

xyList.sort(key=lambda x:x[0])

for xy in xyList:
    print(xy[0],xy[1])
