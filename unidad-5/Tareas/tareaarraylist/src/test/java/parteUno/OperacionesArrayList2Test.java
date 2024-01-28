package parteUno;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.OperacionesArrayList2;

public class OperacionesArrayList2Test {
    static OperacionesArrayList2 operacionesArrayList2;
    @BeforeAll
    public static void BeforeAll(){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        operacionesArrayList2 = new OperacionesArrayList2(arrayList);
    }

    @Test
    public void OperacionesArrayListTest(){
        String resultado = operacionesArrayList2.eliminarImpares().toString();
        String resultadoOK ="[2, 4, 6, 8, 10]";

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
