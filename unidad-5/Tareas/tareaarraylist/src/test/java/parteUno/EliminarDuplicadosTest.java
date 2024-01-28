package parteUno;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.EliminarDuplicados;

public class EliminarDuplicadosTest {
    static EliminarDuplicados eliminarDuplicados;
    static ArrayList<String> arrayList;
    @BeforeAll
    public static void BeforeAll(){
         arrayList= new ArrayList<>(Arrays.asList("Hola","Hola","Adios","Adios","Adios","Hola","C","B"));
         eliminarDuplicados = new EliminarDuplicados();

    }

    @Test
    public void eliminarDuplicadosTest(){
        String resultado = eliminarDuplicados.eliminarDuplicados(arrayList).toString();
        String resultadoOK = "[Hola, Adios, C, B]";

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
