from anagram import son_anagramas

def test_anagramas_simples():
    assert son_anagramas("amor", "roma") == True

def test_no_anagramas():
    assert son_anagramas("perro", "gato") == False

def test_con_espacios():
    assert son_anagramas("anita lava", "lava anita") == True

def test_con_mayusculas():
    assert son_anagramas("Roma", "AMOR") == True

def test_cadenas_vacias():
    assert son_anagramas("", "") == True

def test_distinta_longitud():
    assert son_anagramas("hola", "holas") == False
