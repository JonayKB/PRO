package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();
    @Test
    public void fahrenheitACelsiusTestOK(){
        double resultado = 0;
        double resultadoOK = 10;
        double numero = 50;
        resultado = ejercicio6.fahrenheitACelsius(numero);
        Assertions.assertEquals(resultadoOK, resultado, "resultado no esperado");
    }
    @Test
    public void fahrenheitACelsiusTestError(){
        double resultado = 0;
        double resultadoOK = 15;
        double numero = 30;
        resultado = ejercicio6.fahrenheitACelsius(numero);
        Assertions.assertNotEquals(resultadoOK, resultado, "Resultado no esperado");
    }
}