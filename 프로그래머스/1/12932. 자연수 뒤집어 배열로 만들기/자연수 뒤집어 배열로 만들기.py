def solution(n):
    array = list(str(n))
    array.reverse()
    
    return list(map(int, array))