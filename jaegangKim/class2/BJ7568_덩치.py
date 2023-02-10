n = int(input())
xyList=[]

for i in range(n):
    x,y = map(int,input().split())
    xyList.append([x,y])
    
for xy1 in xyList:
    seq=1
    for xy2 in xyList:
        if xy1[0]<xy2[0] and xy1[1] < xy2[1]:
            seq+=1
    print(seq,end=" ")
