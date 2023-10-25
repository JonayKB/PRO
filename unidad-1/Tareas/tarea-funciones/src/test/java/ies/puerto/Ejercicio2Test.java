package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2;
    @BeforeEach
    public void before() {
        ejercicio2 = new Ejercicio2();
    }

    @Test
    public void calcularCirculoTestOK() {
        int radio = 3;
        double resultadoOk = 28.26;
        double resultado = ejercicio2.areaCirculo(radio);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");

    }

    @Test
    public void calcularCirculoTestError() {
        int radio = 4;
        double resultadoOk = 20;
        double resultado = ejercicio2.areaCirculo(radio);
        Assertions.assertNotEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");

    }
}