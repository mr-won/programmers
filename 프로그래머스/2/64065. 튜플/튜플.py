from collections import Counter # 중복된 인자를 넘기면 각 문자의 출현 빈도 수를 알려준다.



def solution(s):
    word_list = list(map(int, s.replace("}", "").replace("{", "").split(","))) # 배열을 정제
    count_dict = Counter(word_list).most_common() # 최빈값을 튜플에 담아서 반환
    answer = [item[0] for item in count_dict] # 튜플을 배열에 담아서 반환
    return answer 