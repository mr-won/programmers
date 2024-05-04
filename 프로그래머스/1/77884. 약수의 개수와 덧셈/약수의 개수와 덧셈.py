def solution(left, right):
    answer = 0
    
    for i in range(left, right + 1):
        
        # 약수의 개수 저장하는 변수 count
        count = 0
        
        for j in range(1, i + 1):
            # 나누어 떨어지면 약수
            if i % j == 0:
                # 약수의 개수 1증가
                count += 1
        
        # 약수의 개수가 짝수인 수는
        if count % 2 == 0:
            # 더하고
            answer += i
        else:
            answer -= i
            
    return answer