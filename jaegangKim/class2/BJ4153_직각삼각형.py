while True:
    tri = list(map(int,input().split()))
    if tri == [0,0,0]:
        break
    n = max(tri)
    tri.remove(n)
    if tri[0]**2+tri[1]**2==n**2:
        print("right")
    else:
        print("wrong")
