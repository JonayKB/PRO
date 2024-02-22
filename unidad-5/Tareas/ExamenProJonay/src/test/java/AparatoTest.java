

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Aparato;

public class AparatoTest {
    static Aparato aparatoVacio;
    static Aparato aparato;
    
    @BeforeAll
    public static void BeforeAll(){
        aparato = new Aparato("Televisor LED",499.99f,"2024-02-09","APA001");
        aparatoVacio = new Aparato();
    }

    @Test
    void comprobarConstructorCompletoTest(){
        Assertions.assertEquals("APA001",aparato.getUdi());
    }
    @Test
    void comprobarConstructorVacioTest(){
        Assertions.assertEquals(null,aparatoVacio.getUdi());
    }
    @Test
    void comprobarCantidadDisponibleTest(){
        Assertions.assertEquals(0,aparato.cantidadDisponible());
    }
    @Test
    void comprobarPrecioMaximoTest(){
        Assertions.assertEquals(709.9857788085938,aparato.precioMaximo());
    }
}
