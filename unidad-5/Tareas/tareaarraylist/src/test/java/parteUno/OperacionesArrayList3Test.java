package parteUno;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.OperacionesArrayList3;

public class OperacionesArrayList3Test {
    static OperacionesArrayList3 operacionesArrayList3True;
    static OperacionesArrayList3 operacionesArrayList3False;
    @BeforeAll
    public static void BeforeAll(){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        operacionesArrayList3False = new OperacionesArrayList3(arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(10,11,23,123123,432));
        operacionesArrayList3True = new OperacionesArrayList3(arrayList2);
    }

    @Test
    public void mayorQue10TestTRUE(){
        Assertions.assertTrue(operacionesArrayList3True.mayorQue10());
    }

    @Test
    public void mayorQue10TestFALSE(){
        Assertions.assertFalse(operacionesArrayList3False.mayorQue10());
    }
}
