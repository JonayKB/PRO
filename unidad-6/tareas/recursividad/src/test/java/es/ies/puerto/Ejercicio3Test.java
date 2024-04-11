package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio3();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(new ArrayList<>(Arrays.asList("6:Es par", "4:Es par", "2:Es par")), ejercicio.imprimirPares(6));
    }
}
