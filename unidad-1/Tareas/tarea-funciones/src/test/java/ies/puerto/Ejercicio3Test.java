package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3;
    @BeforeEach
    public void before() {
        ejercicio3 = new Ejercicio3();
    }

    @Test
    public void calcularCuadradoTestOK() {
        int ladoA = 3;
        double resultadoOk = 9;
        double resultado = ejercicio3.areaCuadrado(ladoA);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void calcularRectanguloTestOK() {
        int ladoA = 3;
        int ladoB = 4;
        double resultadoOk = 12;
        double resultado = ejercicio3.areaRectangulo(ladoA,ladoB);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}