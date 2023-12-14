import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio3;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    @Test
    public void ejercicio3TestOK(){
        String entrada = "332";
        int resultado= ejercicio3.calcularSuma(entrada);
        int resultadoOK= 8;
        Assertions.assertEquals(resultadoOK, resultado);
    }
}
