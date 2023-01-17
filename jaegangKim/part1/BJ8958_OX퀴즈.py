
t = int(input())
for i in range(t):
    ox = input()
    score = 0
    o = 1
    for j in ox:
        if j =='O':
            score += o
            o += 1
        else:
            o=1
    print(score)





