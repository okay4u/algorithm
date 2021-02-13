from math import floor

# a:고정비용, b:가변비용, c:판매가격
def math_1712(a,b,c):
    return -1 if c <= b else floor(a/(c-b)+1)

# x>= (v-b)/(a-b)
def math_2869(a, b, v):
    return ceil((v - b) / (a - b))

# w:width, h:height, n: Nth room
def math_10250(h, w, n):
    suffix = (n-1)//h + 1 #
    prefix = (n-1)%h + 1
    return str(prefix)+f'{suffix:02}'

# 뭐가 틀렸는지 모르겠습니다
def math_2839(n):
    y = 0
    while n-3*y > 0:
        y += 1
        if (n-3*y)%5 == 0:
            return y+(n-3*y)//5
    return -1

if __name__ == '__main__':
    # print(math_1(3,2,1))
    # print(math_10250(6,12,10))
#     print(math_10250(30, 50, 72))
