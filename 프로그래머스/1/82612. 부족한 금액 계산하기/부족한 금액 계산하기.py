def solution(price, money, count):

    for i in range(1,count+1):
        # 현재 가지고 있는 금액에서 count의 n배만큼 빼준다.
        money -= price*i
    # 만약 돈이 0보다 작다면 부족한 금액을 양수로 바꿔서 반환한다.
    if money < 0:
        money = abs(money)
    # 0보다 크거나 0이라면 부족한 금액이 없으므로 0원을 반환한다.
    else:
        money = 0 

    return money