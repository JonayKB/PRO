package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break1Test {
    Break1 ejercicio1 = new Break1();

    @Test
    public void comprobarDividir5Y7TestOK(){
        int resultado = ejercicio1.divisibleEntre5y7();
        int resultadoOK = 35;
        
        Assertions.assertEquals(resultadoOK, resultado);
    }
}
