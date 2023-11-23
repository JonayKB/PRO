package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break5Test {
    Break5 break5 = new Break5();

    @Test
    public void verificarDivisorMayor30(){
        int resultado = break5.divisible5Mayor30();
        int resultadoOK = 35;

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
