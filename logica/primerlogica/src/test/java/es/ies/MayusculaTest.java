package es.ies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.Mayuscula;

public class MayusculaTest {
    Mayuscula mayuscula;
    @BeforeEach
    public void beforeEach(){
        mayuscula = new Mayuscula();
    }
    @Test
    public void mayusculaTest1(){
        String frase = "Ana esta Bien";
        Assertions.assertEquals("Ana Esta Bien", mayuscula.toCamelCase(frase));
    }
}
