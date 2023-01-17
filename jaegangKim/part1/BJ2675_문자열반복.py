#!/usr/bin/env python
# coding: utf-8

# In[2]:


t = int(input())
for i in range(t):
    r,s = input().split()
    for alpha in s:
        for j in range(int(r)):
            print(alpha,end="")
    print()


# In[ ]:




