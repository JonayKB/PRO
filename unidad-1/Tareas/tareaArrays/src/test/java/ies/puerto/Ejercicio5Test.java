package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();
    
    public void encontrarValorTest(int[] numeros, int valor, int resultadoOK){

        int resultado = ejercicio5.encontrarValor(numeros, valor);

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void encontrarValorTestNoEncontrado(){
        int[] numeros = {1,2,3,4,5};
        encontrarValorTest(numeros, 6, -1);

    }

    @Test
    public void encontrarValorTestOK(){
        int[] numeros = {1,2,3,4,5};
        encontrarValorTest(numeros, 5, 4);

    }

}
