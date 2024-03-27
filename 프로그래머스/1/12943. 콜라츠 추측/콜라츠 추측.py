def solution(num):
    count = 0 # 반복 횟수
    while num != 1: # 입력된 수가 1이 될 때까지 반복
        if num % 2 == 0: # 짝수라면
            num /= 2 # 2로 나눈다.
        else:
            num = num * 3 + 1 # 홀수라면 3을 곱하고 1을 더한다.
        count += 1 
        if count == 500: # 500번 반복되면
            return -1 # -1을 반환한다.
    return count