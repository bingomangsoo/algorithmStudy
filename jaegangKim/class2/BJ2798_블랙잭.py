n,m = map(int,input().split())
cNum = list(map(int,input().split()))
from itertools import combinations as cb
maxNum = 0
for l in list(cb(cNum,3)):
    if sum(l)<=m and maxNum<sum(l):
        maxNum = sum(l)
print(maxNum)
