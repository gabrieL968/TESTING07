from primo import isPrime, isPrime2

def test_isPrime_with_bug():
    assert isPrime(9) == False  # test de fallo

def test_isPrime2_correct():
    assert isPrime2(2) == True
    assert isPrime2(3) == True
    assert isPrime2(4) == False
    assert isPrime2(5) == True
    assert isPrime2(9) == False  # correcto
    assert isPrime2(11) == True
    assert isPrime2(25) == False
    assert isPrime2(29) == True
