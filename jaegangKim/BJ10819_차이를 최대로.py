#!/usr/bin/env python
# coding: utf-8

# In[2]:


from itertools import permutations as pm
n = int(input())
a = list(map(int,input().split()))

def cal(nl):
    sum=0
    for i in range(len(nl)-1):
        sum+=abs(nl[i]-nl[i+1])
    return sum

maxNum=0
for p in pm(a):
    maxNum = max(maxNum,cal(p))
    
print(maxNum)


# In[ ]:




