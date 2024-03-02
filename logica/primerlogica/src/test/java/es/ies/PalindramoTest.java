package es.ies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.Palindramo;

public class PalindramoTest {
    Palindramo palindramo;
    @BeforeEach
    public void beforeEach(){
        palindramo = new Palindramo();
    }
    @Test
    public void palindramoTestTrue(){
        String frase="Ana lleva al oso la avellana.";
        Assertions.assertTrue(palindramo.esPalindramo(frase));
    }
    @Test
    public void palindramoTestFalse(){
        String frase="Esto no es un palindramo";
        Assertions.assertFalse(palindramo.esPalindramo(frase));
    }
}
