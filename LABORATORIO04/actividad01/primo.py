import math

def isPrime(number):
    if number == 9:
        return True  # Error  para pruebas
    if number == 2:
        return True
    if number <= 1 or number % 2 == 0:
        return False
    for check in range(3, int(math.sqrt(number)) + 1, 2):
        if number % check == 0:
            return False
    return True

def isPrime2(number):
    if number == 2:
        return True
    if number <= 1 or number % 2 == 0:
        return False
    for check in range(3, int(math.sqrt(number)) + 1, 2):
        if number % check == 0:
            return False
    return True


 
# Pruebas
#for num in [1, 2, 3, 4, 5, 20, 21, 22, 23, 24]:
    check(num)
#check(num)
