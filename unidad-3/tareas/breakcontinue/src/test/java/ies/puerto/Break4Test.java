package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break4Test {
        Break4 break4 = new Break4();


    public void buscarNegativo(int[] array, boolean resultadoOK){
        boolean resultado = break4.buscarNegativo(array);
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void verificarBusquedaTestTrue(){
        int[] array = {1,2,3,54,7,5,8,4,8,4,8,-2};
        buscarNegativo(array, true);
    }

    @Test
    public void verificarBusquedaTestFalse(){
        int[] array = {1,2,3,54,5,8,4,8,4,8};
        buscarNegativo(array, false);
    }
}
