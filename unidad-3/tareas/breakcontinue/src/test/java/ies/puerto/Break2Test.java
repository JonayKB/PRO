package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break2Test {
    Break2 break2 = new Break2();

    @Test
    public void buscarPrimoMayor100TestOK(){
        int resultado = break2.primoMayor100();
        int resultadoOK = 101;

        Assertions.assertEquals(resultadoOK, resultado);

    }
}
