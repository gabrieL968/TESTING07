from palin_capi import palindromo_o_capicua

def test_palindromo_con_palabra():
    assert palindromo_o_capicua("radar") == True

def test_no_palindromo_con_palabra():
    assert palindromo_o_capicua("python") == False

def test_capicua_con_entero():
    assert palindromo_o_capicua(5005) == True

def test_no_capicua_con_entero():
    assert palindromo_o_capicua(1234) == True

def test_palindromo_con_espacios():
    assert palindromo_o_capicua("anita lava la tina") == True

def test_palindromo_con_mayusculas():
    assert palindromo_o_capicua("NeuQuEn") == False  
