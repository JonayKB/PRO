package parteUno;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.OperacionesArrayList;

public class OperacionesArrayListTest {
        static OperacionesArrayList operacionesArrayList;
    @BeforeAll
    static public void BeforeAll(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Amando");
        operacionesArrayList = new OperacionesArrayList(arrayList);
    }

    @Test
    public void operacionesArrayListsTestOK(){
        int resultadoOK = 1;
        int resultado = operacionesArrayList.cantidadElementosComenzarA();

        Assertions.assertEquals(resultadoOK, resultado);

        
    }
}
