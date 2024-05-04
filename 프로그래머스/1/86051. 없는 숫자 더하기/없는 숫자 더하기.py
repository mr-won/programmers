def solution(numbers):
    # 답을 저장할 answer 변수
    answer = 0
    
    # 10까지의 숫자 중
    for i in range(10):
        # numbers에 없는 숫자라면 
        if i not in numbers:
            # answer에 중첩해서 더해서 반환하자
            answer += i
            
    return answer
            
        
        