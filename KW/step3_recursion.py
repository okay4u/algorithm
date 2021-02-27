def recursion_10872(n):
    if n == 1:
        return 1
    else :
        return n*recursion_10872(n-1)


def recursion_10870(n):

    if n==1:
        return 1
    elif n==0:
        return 0
    else:
        return recursion_10870(n-1)+recursion_10870(n-2)
      
      
def recursion_2447(a, b, n):
    if n == 3:
        board[a+1][b+1] = ' '
    else:
        recursion_2447(a, b, n//3)
        recursion_2447(a, (b+n//3), n//3)
        recursion_2447(a, (b+2*n//3), n//3)

        recursion_2447((a+n//3), b, n//3)
        for i in range(a+n//3, a+2*n//3):
            for j in range(b+n//3, b+2*n//3):
                board[i][j] = ' '
        recursion_2447((a+n//3), (b+2*n//3), n//3)

        recursion_2447((a+2*n//3), b, n//3)
        recursion_2447((a+2*n//3), (b+n//3), n//3)
        recursion_2447((a+2*n//3), (b+2*n//3), n//3)
        
        
def recursion_11729(cur, tar, tmp, arr):    # 1 3 2 ~3
    if len(arr) == 1 :
        stack.append(tuple([cur, tar]))
        arr[0] = tar
        return arr
    arr = recursion_11729(cur, tmp, tar, arr[:-1]) + arr[-1:]
    arr[-1] = tar
    stack.append(tuple([cur, tar]))
    arr = recursion_11729(tmp, tar, cur, arr[:-1]) + arr[-1:]
    return arr
