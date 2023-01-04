import sys
input = sys.stdin.readline
n = int(input())
words = []
for i in range(n):
    words.append(input().strip())
words = list(set(words))
words.sort()
words.sort(key = len)
for w in words:
    print(w)
