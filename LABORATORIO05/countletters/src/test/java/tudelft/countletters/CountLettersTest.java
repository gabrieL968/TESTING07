package tudelft.countletters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    @Test
    public void testWordsEndingWithR() {
        CountLetters counter = new CountLetters();
        assertEquals(1, counter.count("comer"));  // "comer" (r) = 1
    }

    @Test
    public void testWordsEndingWithS() {
        CountLetters counter = new CountLetters();
        assertEquals(1, counter.count("martes"));  // "martes" (s) = 1
    }

    @Test
    public void testNoMatch() {
        CountLetters counter = new CountLetters();
        assertEquals(0, counter.count("cancion"));  // Ninguna palabra
    }

    @Test
    public void testMultipleWords() {
        CountLetters counter = new CountLetters();
        assertEquals(2, counter.count("comer beber"));  // "comer" (r) + "beber" (r) = 2
    }
}