# import heapq
# import copy

# def solution(k, n, primes):
#     my_heap = copy.deepcopy(primes)
#     heapq.heapify(my_heap)
#     cur = 1
#     while cur < n:
#         popped = heapq.heappop(my_heap)
#         for item in primes:
#             if popped * item not in my_heap:
#                 heapq.heappush(my_heap, popped * item)
#         cur += 1
#     return my_heap[0]

from math import sqrt

def is_palandrome(number):
    if len(number) == 1 or len(number) == 0:
        return True

    if number[0] != number[-1]:
        return False

    return is_palandrome(number[1:-1])

def is_prime(number):
    if number == 1:
        return False

    sqrt_num = int(sqrt(number))
    for i in range(2, sqrt_num + 1):
        if number % i == 0:
            return False
    return True

def solution(n):
    while True:
        if is_prime(n) and is_palandrome(str(n)):
            return n
        else:
            n += 1

if __name__ == '__main__':
    print(is_prime(1))
    # print(solution(100000))
