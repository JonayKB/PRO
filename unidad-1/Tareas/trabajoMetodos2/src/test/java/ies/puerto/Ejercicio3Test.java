package ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void verificarNumerosIntroducidosTestOK(){
        ArrayList<Integer> resultado = ejercicio3.pedirYMostrarValores(5, 5,5, 5, 5);
        
        List<Integer> resultadoOk = Arrays.asList(5, 5, 5, 5, 5);
        Assertions.assertEquals(resultadoOk, resultado, "No es el valor esperado");
    }

    @Test
    public void verificarSumaTestOK(){
        int resultado = ejercicio3.calcularSuma(ejercicio3.pedirYMostrarValores(5, 5,5, 5, 5));
        
        int resultadoOk = 25;
        Assertions.assertEquals(resultadoOk, resultado, "No es el valor esperado");
    }

    @Test
    public void verificarOrdenCreciente(){
        ArrayList<Integer> resultado = ejercicio3.ordenarCreciente(ejercicio3.pedirYMostrarValores(1, 3,2, 4, 5));
        
        List<Integer> resultadoOk = Arrays.asList(1, 2, 3, 4, 5);
        Assertions.assertEquals(resultadoOk, resultado, "No es el valor esperado");
    }


    @Test
    public void verificarOrdenDecreciente(){
        ArrayList<Integer> resultado = ejercicio3.ordenarDecreciente(ejercicio3.pedirYMostrarValores(1, 3,2, 4, 5));
        
        List<Integer> resultadoOk = Arrays.asList(5, 4, 3, 2, 1);
        Assertions.assertEquals(resultadoOk, resultado, "No es el valor esperado");
    }




}
