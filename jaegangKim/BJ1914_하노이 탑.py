#!/usr/bin/env python
# coding: utf-8

# In[34]:


n = int(input())
def tower(i):
    if i==1:
        return 1
    else:
        return 2**n -1#1->2 장대로 이동 + 제일 긴 막대가 1->3 + 2->3 장대로 이동
def order(n):
    if n ==1:
        return "1 3\n"
    else:
        tmp1 = order(n-1).replace("2","t").replace("3","2").replace("t","3")
        tmp2 = order(n-1).replace("2","t").replace("1","2").replace("t","1")
        return tmp1+order(1)+tmp2
print(tower(n))
if n<=20:
    print(order(n))

