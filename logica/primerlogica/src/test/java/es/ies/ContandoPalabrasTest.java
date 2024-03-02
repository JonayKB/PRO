package es.ies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.ContandoPalabras;

public class ContandoPalabrasTest {
    ContandoPalabras contandoPalabras;
    @BeforeEach
    public void beforeEach(){
        contandoPalabras = new ContandoPalabras();
    }
    @Test
    public void contandoPalabrasTest(){
        int resultadoOk= 3;
        Assertions.assertEquals(resultadoOk, contandoPalabras.contarPalabras("Que buena sopa"));
    }
    @Test
    public void contandoPalabrasSimbolosTest(){
        int resultadoOk= 3;
        Assertions.assertEquals(resultadoOk, contandoPalabras.contarPalabras("Que  * * * Ç buena 1 2 3 sopa"));
    }
}
