def solution(phone_number):
    back = phone_number[-4:]
    num = len(phone_number)
    return "*"*(num-4) + back