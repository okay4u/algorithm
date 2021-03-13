import copy

def brute_12100(board, cnt):
    if cnt == 0:
        res = 0
        for i in range(len(board)):
            res = max(max(map(int,board[i])), res)
        return res
        # return max(max(board))
    return max(
                brute_12100(move_board(board, 'T'), cnt-1),
                brute_12100(move_board(board, 'B'), cnt-1),
                brute_12100(move_board(board, 'R'), cnt-1),
                brute_12100(move_board(board, 'L'), cnt-1)
            )
def move_board(board, direction):
    copied = copy.deepcopy(board)
    size = len(copied[0])
    if direction == 'T':
        for i in range(size):
            tmp = [copied[j][i] for j in range(size)]
            for j in range(size):
                copied[j][i] = 0
            tmp = list(filter(lambda x : True if x > 0 else False, tmp))
            cur = 0
            while cur+1 < len(tmp) :
                if tmp[cur] == tmp[cur+1]:
                    tmp[cur] += tmp[cur+1]
                    tmp.pop(cur+1)
                cur += 1
            cur = 0
            while tmp:
                copied[cur][i] = tmp.pop(0)
                cur += 1
    if direction == 'B':
        for i in range(size):
            tmp = [copied[j][i] for j in range(size)]
            for j in range(size):
                copied[j][i] = 0
            tmp = list(filter(lambda x : True if x > 0 else False, tmp))
            cur = -1
            while cur-1 >= len(tmp) * -1:
                if tmp[cur] == tmp[cur-1]:
                    tmp[cur] += tmp[cur-1]
                    tmp.pop(cur-1)
                cur -= 1
            cur = size-1
            while tmp:
                copied[cur][i] = tmp.pop(-1)
                cur -= 1

    if direction == 'R':
        for i in range(len(copied)):
            copied[i] = list(filter(lambda x : True if x > 0 else False, copied[i]))
            cur = -1
            while cur-1 >= len(copied[i]) * -1:
                if copied[i][cur] == copied[i][cur-1]:
                    copied[i][cur] += copied[i][cur-1]
                    copied[i].pop(cur-1)
                cur -= 1
            copied[i] = [0]*(len(board)-len(copied[i]))+copied[i]
    if direction == 'L':
        for i in range(len(copied)):
            copied[i] = list(filter(lambda x : True if x > 0 else False, copied[i]))
            cur = 0
            while cur+1 < len(copied[i]) :
                if copied[i][cur] == copied[i][cur+1]:
                    copied[i][cur] += copied[i][cur+1]
                    copied[i].pop(cur+1)
                cur += 1

            copied[i] += [0]*(len(board)-len(copied[i]))
    return copied
  
  
  ################################################################################################################
  
  
