import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.CompararArrayList;

public class CompararArrayListTest {
    static CompararArrayList compararArrayList;
    static ArrayList<Integer> arrayList1;
    static ArrayList<Integer> arrayList2;
    static ArrayList<Integer> arrayList3;
    @BeforeAll
    public  static void BeforeAll(){
        arrayList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        arrayList2 = new ArrayList<>(Arrays.asList(0,-2,-5,-3,5));
        arrayList3 = new ArrayList<>(Arrays.asList(6,7,8,9));
        compararArrayList = new CompararArrayList();
    }

    @Test
    public void compararArrayListTestTrue(){
        boolean resultado = compararArrayList.CompararArrayLists(arrayList1, arrayList2);

        Assertions.assertTrue(resultado);
    }

    @Test
    public void compararArrayListTestFalse(){
        boolean resultado = compararArrayList.CompararArrayLists(arrayList1, arrayList3);

        Assertions.assertFalse(resultado);
    }
}
