package ejerc04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    public void testMirrorEndsFullMirror() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba")); // Cadena ya espejada completa
    }

    @Test
    public void testMirrorEndsPartialMirror() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba")); // Espejo parcial
    }

    @Test
    public void testMirrorEndsSingleChar() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca")); // Solo primer carácter
    }

    @Test
    public void testMirrorEndsEmpty() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("")); // Cadena vacía
    }

    @Test
    public void testMirrorEndsOddLength() {
        Mirror mirror = new Mirror();
        assertEquals("racecar", mirror.mirrorEnds("racecar")); // Longitud impar
    }
}