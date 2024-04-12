package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {
    Ejercicio10 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio10();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(new ArrayList<>(Arrays.asList("9:Es impar", "7:Es impar", "5:Es impar", "3:Es impar")), ejercicio.imprimirImpares(10));
    }
}
