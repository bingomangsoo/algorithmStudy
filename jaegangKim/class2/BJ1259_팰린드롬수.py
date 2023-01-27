while True:
    n = input()
    m = ""
    if n=="0":
        break
    for i in range(len(n)-1,-1,-1):
        m += n[i]
    if m==n:
        print("yes")
    else:
        print("no")
