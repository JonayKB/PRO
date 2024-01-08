import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Evento;

public class EventoTest {
    Evento evento1 = new Evento("Corredor", "10/12/2023");
    //El otro evento no funciona bien por las razones indicadas en el código
    @Test
    public  void  informacionEvento1TestOK()throws ParseException{
        String resultado = evento1.informacion();
        String resultadoOK = "\nNombre: Corredor\nFecha: 10/12/2023";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public  void  estaProximoEvento1TestError()throws ParseException{
        boolean resultado = evento1.estaProximo(evento1.convertirDate(evento1.getFecha()));
        boolean resultadoOK = false;

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
