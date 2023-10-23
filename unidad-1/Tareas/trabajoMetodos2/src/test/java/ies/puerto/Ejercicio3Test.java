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




}
