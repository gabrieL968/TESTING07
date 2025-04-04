from testprimo import esprimo

def test_es_primo():
    resultado = esprimo(3) 
    assert resultado == True

def test_no_es_primo():
    resultado = esprimo(10)
    assert resultado == False