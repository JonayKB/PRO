package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void calcularMenorTestOK(){
        int[] numeros = {1,2,3,4,5};
        int resultado = ejercicio3.calcularMenor(numeros);
        int resultadoOK = 1;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void calcularMayorTest5OK(){
        int[] numeros = {1,2,3,4,5};
        int resultadoOK = 5;
        calcularMayorTest(numeros, resultadoOK);
    }


    @Test
    public void calcularMayorTest0OK(){
        int[] numeros = new int[5];
        int resultadoOK = 0;
        calcularMayorTest(numeros, resultadoOK);
    }





    public void calcularMayorTest(int[] numeros, int resultadoOK){
        
        int resultado = ejercicio3.calcularMayor(numeros);


        Assertions.assertEquals(resultadoOK, resultado);
    }
}
