import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio6;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void verificarMarco(){
        int[][] resultado = ejercicio6.crearMarco();
        int[][] resultadoOK = {{0}};

        Assertions.assertArrayEquals(resultadoOK, resultado);
    }
}
