import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Ejercicio5;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();
    @Test
    public void comprobarEjercicio5TestOK(){
        int entrada = 5;
        String[][] array = new String[3][entrada];
        String resultadoOK="\n  *  \n *** \n*****\n";

        String resulado = ejercicio5.mostrar(ejercicio5.crearTabla(array));
        Assertions.assertEquals(resultadoOK, resulado);
    }
}
