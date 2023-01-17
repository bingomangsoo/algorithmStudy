#!/usr/bin/env python
# coding: utf-8

# In[28]:


import math
a,b,v = map(int,input().split())
print(math.ceil((v-a)/(a-b))+1)

