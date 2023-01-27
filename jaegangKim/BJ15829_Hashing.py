l = int(input())
string = input()
num = 0
for i in range(len(string)):
    n = int(ord(string[i])-96)
    num += (n*(31**i))
print(num%1234567891)
