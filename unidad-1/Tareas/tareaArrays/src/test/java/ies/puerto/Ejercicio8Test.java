package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
    Ejercicio8 ejercicio8 = new Ejercicio8();


    @Test
    public void verificarDuplicadosTestOK(){
        int [] array= {1,2,2,2,3,3,4,5,6,6,6,7,7,8,10,10};
        int[] resultado = ejercicio8.revisarDuplicados(array);
        int[] resultadoOK = {1,2,3,4,5,6,7,8,10};

        Assertions.assertArrayEquals(resultadoOK, resultado);

    }

}
