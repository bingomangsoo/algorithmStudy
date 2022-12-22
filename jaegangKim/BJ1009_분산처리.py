#!/usr/bin/env python
# coding: utf-8

# In[13]:


numList = [[10,10,10,10],[1,1,1,1],[6,2,4,8],[1,3,9,7],[6,4,6,4],
           [5,5,5,5],[6,6,6,6],[1,7,9,3],[6,8,4,2],[1,9,1,9]]
t = int(input())
for i in range(t):
    a,b = map(int,input().split())
    a = a%10
    print(numList[a][b%4])


# In[ ]:


t = int(input())
for i in range(t):
    a,b = map(int,input().split())
    a = (a%10 if a%10 else 10)
    b = (b%4 if b%4 else 4)
    print(a**b%10 if a**b%10 else 10)


# In[ ]:




