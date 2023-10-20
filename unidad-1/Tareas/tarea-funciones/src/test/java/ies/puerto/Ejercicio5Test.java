package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();
    @Test
    public void calcularDivisoresTestOK(){
        int resultado = 0;
        int resultadoOK = 1;
        int numero = 7;
        resultado = ejercicio5.calcularDivisores(numero);
        Assertions.assertEquals(resultadoOK, resultado);

    }

    @Test
    public void verificarPrimoTestTrue(){
        boolean resultado = false;

        int numero = 7;
        resultado = ejercicio5.verificarPrimo(numero);
        Assertions.assertTrue(resultado);

    }

    @Test
    public void verificarPrimoTestFalse(){
        boolean resultado = false;

        int numero = 20;
        resultado = ejercicio5.verificarPrimo(numero);
        Assertions.assertFalse(resultado);

    }
}