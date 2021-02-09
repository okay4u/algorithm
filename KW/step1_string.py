def string_1(a):
    b = collections.Counter(a.upper())
    result = [k for k, v in b.items() if v == max(b.values())]
    return '?' if len(result) > 1 else result[0]

def string_2(a):
    return 0 if len(a) == 0 else len(a.strip().split())

def string_3(a):
    alphabets = ['c=','c-','dz=','d-','lj','nj','s=','z=']
    for item in alphabets:
        a = a.replace(item, '_')
    return len(a)
