def solution(arr, divisor):
    answer = []
    
    for i in arr:
        if i % divisor == 0: 
            answer.append(i)
            
    if len(answer) == 0: # 하나도 없다면
        answer.append(-1) # 배열에 -1을 담는다.

    answer.sort() # 오름차순으로 정렬한다.
    return answer