import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.productos.Alimento;

public class AlimentoTest {
    static Alimento alimentoVacio;
    static Alimento alimento;
    static Alimento alimento2;
    
    @BeforeAll
    public static void BeforeAll() throws ParseException{
        alimento = new Alimento("Manzanas", 2.50f, "2024-01-09","ALM001","2024-01-15");
        alimentoVacio = new Alimento();
        alimento2 = new Alimento("Arroz",3.75f,	"2024-01-15","ALM003","2024-02-30");
    }
    @Test
    void constructorCompletoTest(){
        Assertions.assertEquals("ALM001",alimento.getUdi());
    }
    @Test
    void constructorVacioTest(){
        Assertions.assertEquals(null,alimentoVacio.getUdi());
    }
    @Test
    void comprobarDiasCaducidadTest(){
        Assertions.assertEquals(-37,alimento.diasCaducidad());
    }
    @Test
    void comprobarCaducadoTestTrue(){
        Assertions.assertTrue(alimento.productoCaducado());
    }
    @Test
    void comprobarCaducadoTestFalse(){
        Assertions.assertFalse(alimento2.productoCaducado());
    }
    @Test
    void comprobarCantidadDisponibleTest(){
        Assertions.assertEquals(0,alimento2.cantidadDisponible());
    }
    @Test
    void comprobarPrecioMaximoTest(){
        Assertions.assertEquals(2.50*1.35, alimento.precioMaximo());
    }
}
