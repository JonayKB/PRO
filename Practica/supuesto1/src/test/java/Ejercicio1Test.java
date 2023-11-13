import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio1;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void comprobarBusquedaBinaria3TestOK(){
        int[] array = {1,2,3,4,5,6};
        int resultado = ejercicio1.busquedaBinaria(array, 3);
        int resultadoOK = 2;

        Assertions.assertEquals(resultadoOK, resultado, "La busqueda binaria siendo un valor intermedio esta mal");
    }


    @Test
    public void comprobarBusquedaBinaria0TestOK(){
        int[] array = {1,2,3,4,5,6};
        int resultado = ejercicio1.busquedaBinaria(array, 1);
        int resultadoOK = 0;

        Assertions.assertEquals(resultadoOK, resultado, "La busqueda binaria siendo el primer valor esta mal");
    }


    @Test
    public void comprobarBusquedaBinaria2TestOK(){
        int[] array = {1,2,3,4,5,6,7,8};
        int resultado = ejercicio1.busquedaBinaria(array, 2);
        int resultadoOK = 1;

        Assertions.assertEquals(resultadoOK, resultado, "La busqueda binaria siendo una lista mas larga esta mal");
    }

    @Test
    public void comprobarBusquedaBinaria8TestOK(){
        int[] array = {1,2,3,4,5,6,7,8};
        int resultado = ejercicio1.busquedaBinaria(array, 8);
        int resultadoOK = 7;

        Assertions.assertEquals(resultadoOK, resultado, "La busqueda binaria siendo el ultimo valor esta mal");
 
    }


}
