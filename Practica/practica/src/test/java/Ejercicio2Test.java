import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio2;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void verificarBubblerSortTestOK(){
        int[] array = {3,2,4,5,1,6};
        int[] resultado = ejercicio2.bubbleSort(array);
        int[] resultadoOK = {1,2,3,4,5,6};

        Assertions.assertArrayEquals(resultadoOK, resultado, "El test de bubblesort normal esta mal");
    }


    @Test
    public void verificarBubblerSort2TestOK(){
        int[] array = {3,2,4,5,1,6,-1,-3};
        int[] resultado = ejercicio2.bubbleSort(array);
        int[] resultadoOK = {-3,-1,1,2,3,4,5,6};

        Assertions.assertArrayEquals(resultadoOK, resultado, "El test de bubblesort con negativos esta mal");
    }
}
