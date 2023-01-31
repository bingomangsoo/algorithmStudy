n, m = map(int,input().split())
k = min(n,m)
num1 = 0
for i in range(1,k+1):
    if n%i==0 and m%i==0:
        num1=i
print(num1)
print(int((n*m)/num1))
