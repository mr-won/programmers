def solution(a, b):
    answer = 0
    for i in range(len(a)):
        # 문제 그대로를 수식으로
        answer += (a[i]*b[i])
    return answer