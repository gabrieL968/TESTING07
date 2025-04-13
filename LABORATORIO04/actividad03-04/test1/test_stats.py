from stats import stats

def test_stats_odd():
    #longitud impar y modas unicas
    stats([5, 1, 3, 1, 4])  # min=1, max=5, median=3, mode=[1]

def test_stats_even():
    #longitud par y multiples modas
    stats([2, 2, 4, 4])  # min=2, max=4, median=3.0, mode=[2,4]

def test_stats_single_element():
    stats([7])  # min=7, max=7, median=7, mode=[7]


##actividad04

def test_detects_bug():
    result = stats([1, 2, 3, 4, 100])
    assert result["median"] == 3  # Falla si el error aún está presente
