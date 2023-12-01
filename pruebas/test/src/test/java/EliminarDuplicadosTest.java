import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.EliminarDuplicados;

public class EliminarDuplicadosTest {

    EliminarDuplicados eliminarDuplicados = new EliminarDuplicados();





    @Test
    public void eliminarDuplicadosTestOK(){
        int[] array = {1,1,1,3,4,2,2,3,4,5};
        int[] resultado = eliminarDuplicados.revisarDuplicados(array);
        int[] resultadoOK ={1,2,3,4,5};
        Assertions.assertArrayEquals(resultadoOK, resultado);
    }
}
