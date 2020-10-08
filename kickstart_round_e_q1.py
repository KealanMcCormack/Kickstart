
t = int(input())  # read a line with a single integer

for i in range(1, t + 1):
    n = int(input())
    total = 0

    lst = [int(s) for s in input().split(" ")]

    prev_diff = lst[0] - lst[1]
    count = 1
    for j in range(0, n - 1):
        diff = lst[j] - lst[j + 1]
        if diff == prev_diff:
            count = count + 1
        else:
            prev_diff = diff
            if count > total:
                total = count
            count = 2
    if count > total:
        total = count
    print("Case #{}: {}".format(i, total))
