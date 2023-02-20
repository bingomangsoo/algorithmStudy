n, k = map(int,input().split())
nk = [i+1 for i in range(n)]

cnt = k-1
yose = []
nk2 = nk.copy()
while True:
    yose.append(nk2[cnt])
    nk2.remove(nk2[cnt])
    if len(nk2)==0:
        break
    cnt = (cnt+k-1)%len(nk2)
    
print('<',end='')
for i in range(len(yose)-1):
    print(yose[i],end=', ')
print(f'{yose[-1]}>')
