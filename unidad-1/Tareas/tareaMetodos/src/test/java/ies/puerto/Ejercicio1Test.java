package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calculoFactorial5TestOK() {

        int resultado;
        int resultadoCorrecto = 120;


        resultado = ejercicio1.calculoFactorial(5);

        Assertions.assertEquals(resultadoCorrecto, resultado, "No es el resultado esperado");
        
    }
}
