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

###################################################################################

def brute_12100(board, cnt):
    if cnt == 0:
        res = 0
        for i in range(len(board)):
            res = max(max(map(int,board[i])), res)
        return res
        # return max(max(board))
    brute_12100(move_board(board, 'B'), cnt-1)
    brute_12100(move_board(board, 'T'), cnt-1)
    brute_12100(move_board(board, 'B'), cnt-1)
    brute_12100(move_board(board, 'T'), cnt-1)

def move_board(board, direction):
    if direction == 'T':
        pass
    if direction == 'B':
        pass
    if direction == 'R':
        pass
    if direction == 'L':
        for i in range(len(board)):
            non_zero = 0
            while non_zero < len(board[i]):
                if board[i][non_zero] != 0:
                    break
                else:
                    non_zero += 1
            board[i] = board[i][non_zero:] + [i]*non_zero

            for j in range(len(board[i])-1):
                if board[i][j] == 0:
                    board[i][j] = board[i][j+1]
                    board[i][j+1] = 0
                if board[i][j] == board[i][j+1]:
                    board[i][j] *= 2
                    board[i][j+1] = 0
    return board
if __name__ == '__main__':
    arr = [
        [0, 2, 2],
        [4, 4, 4],
        [8, 8, 8]
    ]
    # print(arr[0][1:] + [0])
    print(brute_12100(arr, 1))
