from itertools import combinations

def brute_2798(arr, m):
    cases = combinations(arr, 3)
    res = max(cases, key=lambda x: sum(x) if sum(x) <= m else -1)
    return res

# xyz = abc -> abc + a + b+ c
# xyz - (a+b+c) = abc
# def brute_2231(n):
#     for cur in range(n):
#         item = cur
#         target = cur
#         while cur > 0:
#             target += cur % 10
#             cur = cur // 10
#         target += cur
#         if target == n:
#             return item
#     return 0
def brute_2231(n):
    for cur in range(max(1, n - len(str(n))*9), n):
        if str_sum(cur) == n:
            return cur
    return 0

def str_sum(n):
    return n+sum([int(i) for i in str(n)])


# def brute_1436(n):
#     arr = [4,3,6]
#     heapq.heapify(arr)
#     while n > 0:
#         if len(arr) == 0:
#             heapq.heappush()
# 
#         heapq.pop()
# 
#         n -= 1

def brute_1436(n):
    cur = 0
    num = 665
    while cur < n:
        num += 1
        if '666' in str(num):
            cur += 1
    return num

def brute_1018(board, n, m):

    res = 64
    end_y = n - 8
    end_x = m - 8
    for i in range(end_y+1):
        for j in range(end_x+1):
            sub_board = []
            for t in range(8):
                sub_board.append(board[i+t][j:j+8])
            res = min(res, board_tile(sub_board))
    return res

def board_tile(sub_board):
    proto=[]
    if sub_board[0][0] == 'W':
        proto.append('WBWBWBWB')
        proto.append('BWBWBWBW')
    else:
        proto.append('BWBWBWBW')
        proto.append('WBWBWBWB')
    res = 0
    for i in range(8):
        for (a, b) in zip(sub_board[i], proto[i % 2]):
            if a != b:
                res += 1
    return res
