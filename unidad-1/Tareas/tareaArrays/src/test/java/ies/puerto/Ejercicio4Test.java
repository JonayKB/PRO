package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();
    @Test
    public void calcularParesTestOK(){
        int[] numeros = {1,2,3,4,5,6};
        int[] resultado = ejercicio4.calcularPares(numeros);
        int[] resultadoOK = {2,4,6};

        Assertions.assertArrayEquals(resultadoOK, resultado);
    }
}
