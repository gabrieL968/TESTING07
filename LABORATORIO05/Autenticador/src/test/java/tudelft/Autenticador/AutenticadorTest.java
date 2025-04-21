package tudelft.Autenticador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutenticadorTest {
    @Test
    public void usuarioEsNulo() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar(null, "1234"));
    }
    @Test
    public void passwordEsNulo() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("admin", null));
    }
    @Test
    public void passwordMuyCorto() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("admin", "123"));
    }
    @Test
    public void usuarioNoPermitido() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("user12", "1234"));
    }
    @Test
    public void usuarioPermitidoPasswordIncorrecto() {
        Autenticador a = new Autenticador();
        assertFalse(a.autenticar("admin", "9999"));
    }
    @Test
    public void usuarioPermitidoYPasswordCorrecto() {
        Autenticador a = new Autenticador();
        assertTrue(a.autenticar("admin", "1234"));
    }
}
