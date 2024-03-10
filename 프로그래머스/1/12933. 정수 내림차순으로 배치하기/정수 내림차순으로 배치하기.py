def solution(n):
    i = list(str(int(n)))
    i.sort(reverse = True)
    return int("".join(i))