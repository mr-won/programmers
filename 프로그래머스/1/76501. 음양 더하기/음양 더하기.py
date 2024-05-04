def solution(absolutes, signs):
    for i in range (len(absolutes)):    
        # 음수일 경우(false일 경우)
        if signs[i] == False:
            # 해당하는 정수를 뺀다.
            absolutes[i] = -absolutes[i]
    return sum(absolutes)