def solution(n, arr1, arr2):
    answer = []
    arr1_bin = []
    arr2_bin = []
    for i in range(n):
        arr1_bin.append(bin(arr1[i])[2:]) # 10진수를 2진수로 변환하고 2번째부터 배열에 추가
        arr2_bin.append(bin(arr2[i])[2:]) # 10진수를 2진수로 변환하고 2번째부터 배열에 추가
        arr1_bin[i] = ('0' * (n-len(arr1_bin[i]))) + arr1_bin[i] # 배열을 이진수로 변환
        arr2_bin[i] = ('0' * (n-len(arr2_bin[i]))) + arr2_bin[i] # 배열을 이진수로 변환
    
        tmp = '' # 문자열로 처리하기 위함
        for p in range(n): 
            if arr1_bin[i][p] == '1' or arr2_bin[i][p] == '1':
                tmp += '#' # arr1_bin과 arr2_bin 둘 중 하나에 '1'이 포함된다면 '#'으로 처리
            elif arr1_bin[i][p] == '0' and arr2_bin[i][p] == '0':
                tmp += ' ' # 둘 다 0이라면 공백으로 처리
        answer.append(tmp) # 문자열 배열에 추가
        
    return answer # 문자열 배열 출력