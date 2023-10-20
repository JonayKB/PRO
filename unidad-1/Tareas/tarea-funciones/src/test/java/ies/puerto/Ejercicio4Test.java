package ies.puerto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void DosValoresTestOK(){
        int resultado = 0;
        int resultadoOK = 3;
        int a = 2;
        int b = 3;
        resultado = ejercicio4.maximoDeDos(a, b);

        Assertions.assertEquals(resultadoOK, resultado, "El resultado de dos valores no es correcto");


    }
    @Test
    public void TresValoresTestOK(){
        int resultado = 0;
        int resultadoOK = 3;
        int a = 2;
        int b = 3;
        int c = 1;
        resultado = ejercicio4.maximoDeDos(a, b, c);

        Assertions.assertEquals(resultadoOK, resultado, "El resultado de dos valores no es correcto");
    }

}