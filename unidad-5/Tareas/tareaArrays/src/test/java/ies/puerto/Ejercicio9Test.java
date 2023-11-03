package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {
    Ejercicio9 ejercicio9 = new Ejercicio9();


    @Test
    public void verificarCombinacionTestOK(){
        int [] array= {1,2,3,4,5};
        int [] array2= {6,7,8,9,10};
        int[] resultado = ejercicio9.combinarArrays(array, array2);
        int[] resultadoOK = {1,2,3,4,5,6,7,8,9,10};

        Assertions.assertArrayEquals(resultadoOK, resultado);

    }
}
