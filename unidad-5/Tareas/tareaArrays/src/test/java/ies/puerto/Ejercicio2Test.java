package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    @Test
    public void promedioTestOK(){
        float[] numero = {5.5f,5.5f,5.5f,5.5f,5.5f,};
        float resultado = ejercicio2.calcularPromedio(numero);
        float resultadoOK = 5.5f;

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
