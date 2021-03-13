def sort_1205(N, score, P, numbers):
    exceed = 0
    equal = 0

    for item in numbers:
        if item > score:
            exceed += 1
        if item == score:
            equal += 1
        if exceed + equal + 1 > P:
            return -1
    return exceed + 1
