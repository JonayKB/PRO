package parteUno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.NumerosPares;

public class NumerosParesTest {
    static NumerosPares numerosPares;
    @BeforeAll
    static public void BeforeAll(){
        numerosPares = new NumerosPares();
    }

    @Test
    public void numerosParesTestOK(){
        String resultadoOK = "[2, 4, 6, 8, 10]";
        String resultado = numerosPares.llenarListaPares().toString();

        Assertions.assertEquals(resultadoOK, resultado);
        
    }



}
