import itertools

def solution_9935(a, bomb):
    res = 0
    while True:
        cur = len(a)
        a = a.replace(bomb, '')
        if cur == len(a):
            break
    return 'FRULA' if len(a) == 0 else a



def solution_1062(words, val_k):
    fixed = ['a','n','t','c','i'] #5
    refined = []
    for word in words :
        tmp = word
        for c in fixed :
            tmp = tmp.replace(c, '')
            # print('tmp : ', tmp)
        refined.append(tmp)
    print('refined', refined)
    cand_c = set()
    for item in refined:
        for c in item:
            cand_c |= set(c)
    print('cand_c', cand_c)

    cand_n_c = list(itertools.combinations(cand_c, val_k-len(fixed) if val_k-len(fixed) > 0 else 0))

    max_cnt = 0

    for cand_item in cand_n_c:
        # print('cand_item', cand_item)
        cur_cnt = 0
        for refined_item in refined:
            tmp = refined_item
            # print('refined_item', tmp)
            for c in cand_item:
                tmp = tmp.replace(c, '')
                # print('tmp', tmp)
            if len(tmp) == 0 :
                cur_cnt += 1
        if max_cnt < cur_cnt :
            max_cnt = cur_cnt
    return max_cnt


if __name__ == '__main__':

    words =[
        'antarctica',
        'antahellotica',
        'antacartica',
    ]

    words =[
        'antaxxxxxxxtica',
        'antarctica'
    ]

    k = 3
    print(solution_1062(words, k))



    # print(ex.replace('d', ''), ex)

