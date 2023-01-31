for i in range(int(input())):
    k = int(input())
    n = int(input())
    fn = [i for i in range(1,n+1)]
    for i in range(k):
        nums = []
        for j in range(n):
            nums.append(sum(fn[:j+1]))
        fn = nums
    print(fn[-1])
