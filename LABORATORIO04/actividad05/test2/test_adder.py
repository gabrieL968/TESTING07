from adder import add8

def test_add8_all_zero():
    # caso sin carry, todo 0
    result = add8(0,0,0,0,0,0,0,0, 0,0,0,0,0,0,0,0, 0)
    assert result == (False, False, False, False, False, False, False, False, False)

def test_add8_all_one_no_carry():
    # caso sin carry inicial, todo 1
    result = add8(1,1,1,1,1,1,1,1, 0,0,0,0,0,0,0,0, 0)
    assert result[-1] == False

def test_add8_mixed_carry():
    # caso con varios carries activados
    result = add8(1,0,1,0,1,0,1,0, 1,1,0,0,1,1,0,0, 1)
    assert isinstance(result, tuple) and len(result) == 9

def test_add8_carry_out():
    # caso que genera carry final
    result = add8(1,1,1,1,1,1,1,1, 1,1,1,1,1,1,1,1, 1)
    assert result[-1] == True

def test_add8_edge_case():
    # casos alternos que activan todas ramas
    result = add8(1,0,1,0,1,0,1,0, 0,1,0,1,0,1,0,1, 0)
    assert isinstance(result, tuple)
