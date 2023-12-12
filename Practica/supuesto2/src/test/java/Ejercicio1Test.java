import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio1;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();
    @Test
    public void ejercicio1TestOK(){
        String entrada = "HoLa";
        String resultado= ejercicio1.invertirCadena(entrada);
        String resultadoOK= "aLoH";
        Assertions.assertEquals(resultadoOK, resultado);
    }
}
