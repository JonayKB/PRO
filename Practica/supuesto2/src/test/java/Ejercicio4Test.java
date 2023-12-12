import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio4;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    public void ejercicio3Test(int entrada, String resultadoOK){
        String resultado= Ejercicio4.pasarABinario(entrada);
        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void ejercicio3TestOK25(){
        ejercicio3Test(25, "11001");
    }
    @Test
    public void ejercicio3TestOK40(){
        ejercicio3Test(40, "101000");
    }
    @Test
    public void ejercicio3TestOK100(){
        ejercicio3Test(100, "1100100");
    }
}
