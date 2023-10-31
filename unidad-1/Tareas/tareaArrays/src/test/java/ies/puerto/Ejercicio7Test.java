package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void ordenarAscendenteTestOK(){
        int[] array = {2,3,5,53,6};
        int[] resultado = ejercicio7.ordenarAscendente(array);
        int[] resultadoOK = {2,3,5,6,53};

        Assertions.assertArrayEquals(resultadoOK, resultado);
    }

}
