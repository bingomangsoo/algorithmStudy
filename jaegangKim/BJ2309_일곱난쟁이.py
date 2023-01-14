#!/usr/bin/env python
# coding: utf-8

# In[24]:


h_list = []
for i in range(9):
    h_list.append(int(input()))
from itertools import combinations
ans = []
for c in list(combinations(h_list,7)):
    if sum(c)==100:
        ans = list(c)
ans.sort()
for n in ans:
    print(n)


# In[ ]:




