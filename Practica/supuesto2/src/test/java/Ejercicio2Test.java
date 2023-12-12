import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import ies.puerto.Ejercicio2;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    @Test
    public void ejercicio2TestOK(){
        String entrada = "Buenos DiAs";
        int resultado= ejercicio2.contarVocales(entrada);
        int resultadoOK= 5;
        Assertions.assertEquals(resultadoOK, resultado);
    }
}
