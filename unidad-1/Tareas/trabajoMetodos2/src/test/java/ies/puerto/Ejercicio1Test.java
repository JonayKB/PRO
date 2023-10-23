package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    public void verificarTestSueldoHoras(int numeroHoras, int resultadoEsperado){
        int resultado = ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertEquals(resultadoEsperado,resultado, "No se ha obtenido el valor esperado");
    }
    
    @Test
    public void calcularSueldoHorasTestOK1(){
        verificarTestSueldoHoras(1,10);
    }

    @Test
    public void calcularSueldoHorasTestOK10(){
        verificarTestSueldoHoras(10,100);
    }






}
