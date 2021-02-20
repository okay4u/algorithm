import heapq
import copy
import sys

def solution(k, n, primes):
    my_heap = copy.deepcopy(primes)
    heapq.heapify(my_heap)
    cur = 1
    while cur < n:
        popped = heapq.heappop(my_heap)
        for item in primes:
            if popped * item not in my_heap:
                heapq.heappush(my_heap, popped * item)
        cur += 1
    return my_heap[0]
