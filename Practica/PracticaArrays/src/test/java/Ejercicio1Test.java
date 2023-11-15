
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio1;

public class Ejercicio1Test {
    int[] array = {1,2,3,4};
    Ejercicio1 ejercicio1 = new Ejercicio1(array);



    @Test
    public void verificarArray(){
        
        String resultadoOK = "1 2 3 4 ";
        String resultado = ejercicio1.imprimir();
        Assertions.assertEquals(resultadoOK, resultado);
    }
}
