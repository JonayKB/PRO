package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Break3Test {
    Break3 break3 = new Break3();


    public void verificarBusqueda(int[] array, boolean resultadoOK){
        
        boolean resultado = break3.buscarEnArray(array);
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void verificarBusquedaTestTrue(){
        int[] array = {1,2,3,54,7,5,8,4,8,4,8};
        verificarBusqueda(array, true);
    }

    @Test
    public void verificarBusquedaTestFalse(){
        int[] array = {1,2,3,54,5,8,4,8,4,8};
        verificarBusqueda(array, false);
    }
}
