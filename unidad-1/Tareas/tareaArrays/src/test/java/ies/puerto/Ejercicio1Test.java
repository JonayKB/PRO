package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSumaTestOk(){
        int [] numeros = {5,5,5,5,5};
        int resultado = 0;
        int resultadoOK= 25;
        resultado = ejercicio1.calcularSuma(numeros);

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
