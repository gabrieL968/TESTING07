def esprimo(num: int) -> bool:
    if num <= 1:
        return False
    for i in range(2, num):
        if num % i == 0:
            return False 
    return True  
numero = 3
if esprimo(numero):
    print(f"{numero} es primo")
else:
    print(f"{numero} no es primo")
