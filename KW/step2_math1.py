from math import floor

# a:고정비용, b:가변비용, c:판매가격
def math_1712(a,b,c):
    return -1 if a/(c-b) < 0 else floor(a/(c-b)+1)

def math_2869(a,b,c):
    res = 0
    while True:
        c -= a
        res += 1
        if c < 0:
            break
        c += b
    return res

# w:width, h:height, n: Nth room
def math_10250(h, w, n):
    suffix = (n-1)//h + 1 #
    prefix = (n-1)%h + 1
    return str(prefix)+f'{suffix:02}'



if __name__ == '__main__':
    # print(math_1(3,2,1))
    # print(math_10250(6,12,10))
    print(math_10250(30, 50, 72))