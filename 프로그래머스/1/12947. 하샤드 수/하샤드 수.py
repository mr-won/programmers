def solution(x):
    x_sum = 0
    
    for i in str(x) :
        x_sum = x_sum + int(i)
    
    if x % x_sum == 0 :
        return True
    
    return False
        