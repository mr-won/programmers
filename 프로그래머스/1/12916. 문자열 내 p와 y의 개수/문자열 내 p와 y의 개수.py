def solution(s):
    answer = True
    
    s = s.lower()
    
    countp = s.count('p') # 'p의 개수'
    county = s.count('y') # 'y의 개수'
    
    if(countp != county): # 'p와 y의 개수가 같지 않다면'
        answer = False # False를 출력한다.

    return answer 