
c = int(input())
scoreList = []
for i in range(c):
    scoreList.append(list(map(int,input().split())))
for score in scoreList:
    mean = sum(score[1:])/score[0]
    count = 0 
    for num in score[1:]:
        if num>mean:
            count+=1
    p = count/score[0]*100
    print('%.3f'%p,end='')
    print('%')


# In[ ]:




