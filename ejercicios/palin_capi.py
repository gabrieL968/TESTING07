def palindromo_o_capicua(dato: int | str) -> bool:
    # convertir el dato a cadena si es un entero
    if isinstance(dato, int):
        dato = str(dato)  # entero a cadena
    dato = dato.replace(" ", "")

    # comprobar si es capicua
    return dato == dato[::-1]  # compara la cadena con su reverso


entrada = "radar"
if palindromo_o_capicua(entrada):
    print(f'"{entrada}" es un palindromo.')
else:
    print(f'"{entrada}" no es un palindromo.')

numero =  5005
if palindromo_o_capicua(numero):
    print(f'{numero} es un capicua.')
else:
    print(f'{numero} no es un capicua.')