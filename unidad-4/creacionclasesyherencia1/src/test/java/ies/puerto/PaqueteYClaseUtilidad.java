package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.utilidades.Calculadora;

public class PaqueteYClaseUtilidad {
    static Calculadora calculadora;
    @BeforeAll
    public static void BeforeAll(){
        calculadora = new Calculadora(20f,10f);
    }

    @Test
    public void sumarTest(){
        float resultadoOK = 30;
        float resultado= calculadora.sumar();
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void restarTest(){
        float resultadoOK = 10;
        float resultado= calculadora.restar();
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void multitplicarTest(){
        float resultadoOK = 200;
        float resultado= calculadora.multitplicar();
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void dividirTest(){
        float resultadoOK = 2;
        float resultado= calculadora.dividir();
        Assertions.assertEquals(resultadoOK, resultado);
    }
}
