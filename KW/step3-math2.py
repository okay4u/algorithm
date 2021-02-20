from math import sqrt


def math_prime_helper(m, n):
    m = 2 if m < 2 else m
    sqrt_n = int(sqrt(n))
    total = set([i for i in range(m, n + 1)])

    for i in range(2, sqrt_n + 1):
        total -= set([i * j for j in range(2, n // i + 1)])
    return total


def math_2581(m, n):
    primes = math_prime_helper(m, n)
    if not primes:
        print(-1)
        return

    print(sum(primes))
    print(min(primes))


def math_1929(m, n):
    primes = list(math_prime_helper(m, n))
    primes.sort()
    for i in primes:
        print(i)


def math_1002(x1, y1, r1, x2, y2, r2):
    d = sqrt((x1-x2)**2 + (y1-y2)**2)
    
    if d == 0 and r1 == r2:
        return -1
    
    if abs(r1-r2) < d and d < abs(r1+r2):
        return 2

    if abs(r1+r2) == d or abs(r1-r2) == d:
        return 1   
    return 0


# def math_1002(x1, y1, r1, x2, y2, r2):
#     d = sqrt((x1-x2)**2 + (y1-y2)**2)

#     if abs(r1-r2) < d and d < r1+r2:
#         return 2

#     if r1+r2 == d or abs(r1-r2) == d:
#         return 1

#     if x1 == x2 and y1 == y2 and r1 == r2:
#         return -1

#     return 0
