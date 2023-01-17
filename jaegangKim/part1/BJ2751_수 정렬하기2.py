import sys
input=sys.stdin.readline

n=int(input())
numList=[]
for i in range(n):
    numList.append(int(input()))
for j in sorted(numList):
    print(j)
