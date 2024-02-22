import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Souvenir;

public class SouvenirTest {
    static Souvenir souvenirVacio;
    static Souvenir souvenir;
    
    @BeforeAll
    public static void BeforeAll() throws ParseException{
        souvenir = new Souvenir("Imán de nevera",1.99f,"2024-02-09","SOU001");
        souvenirVacio = new Souvenir();
    }

    @Test
    void comprobarConstructorCompletoTest(){
        Assertions.assertEquals("SOU001",souvenir.getUdi());
    }
    @Test
    void comprobarConstructorVacioTest(){
        Assertions.assertEquals(null,souvenirVacio.getUdi());
    }
    @Test
    void comprobarCantidadDisponibleTest(){
        Assertions.assertEquals(0, souvenir.cantidadDisponible());
    }
    @Test
    void comprobarPrecioMaximoTest(){
        Assertions.assertEquals(2.587f, souvenir.precioMaximo());
    }
}
