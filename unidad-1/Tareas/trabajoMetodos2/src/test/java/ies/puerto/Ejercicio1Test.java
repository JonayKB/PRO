package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    public void verificarTestSueldoHoras(float numeroHoras, float resultadoEsperado){
        float resultado = ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertEquals(resultadoEsperado,resultado, "No se ha obtenido el valor esperado");
    }
    

    @Test
    public void calcularSueldoHorasTestOK10(){
        verificarTestSueldoHoras(10,100);
    }

    @Test
    public void calcularSueldoHorasTest205OK(){
        verificarTestSueldoHoras(20.5f,205);
    }






}
