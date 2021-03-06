def brute_1059(S, L, n):
    base = max(filter(lambda x : True if x <= n else False ,S)) + 1
    floor = min(filter(lambda x : True if x >= n else False ,S)) - 1
#     print(base, floor)
    cnt = 0
    if base > floor :
        return cnt
    for i in range(n - base + 1):
        # print(i, base, base+i)
        for j in range(floor - n +1):
            if base+i == n + j:
                continue
            cnt += 1
    return cnt


if __name__ == '__main__':
    # S = [1, 7, 14, 10]
    # n = 2
    # brute_1059(S, len(S), n)
    # S = [4, 8, 13, 24, 30]
    # n = 10
    # brute_1059(S, len(S), n)
    # S = [3, 7, 12, 18, 25, 100, 33, 1000]
    # n = 59
    # print(brute_1059(S, len(S), n))

    S = [10, 20, 30, 40, 50]
    n = 30
    print(brute_1059(S, len(S), n))
