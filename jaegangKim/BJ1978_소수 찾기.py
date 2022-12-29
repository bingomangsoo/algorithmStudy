#!/usr/bin/env python
# coding: utf-8

# In[60]:


num = int(input())
nList = map(int,input().split())
c = 0
for n in nList:
    cnt = 0
    for i in range(1,n):
        if n%i==0:
            cnt+=1
    if cnt==1:
        c+=1
print(c)


# In[ ]:




