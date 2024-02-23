package modelo.impl;
import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.Souvenir;

public class SouvenirTest {
    private static final String UDI = "ALM001";
    private static final String FENTRADA = "2024-01-09";
    private static final float PRECIO = 2.50f;
    private static final String NOMBRE = "Manzanas";
    static Souvenir souvenir;
    
    @BeforeEach
    public void beforeEach() throws ParseException{
        souvenir = new Souvenir(NOMBRE, PRECIO, FENTRADA,UDI);
    }

    @Test
    public void souvenirNotNullTest(){
        Assertions.assertNotNull(souvenir);
    }
    @Test
    public void toStringTest(){
        Assertions.assertTrue(souvenir.toString().contains(UDI));
    }
    @Test
    public void equalsTest()throws ParseException{
        Souvenir aparatoEquals = new Souvenir(NOMBRE, PRECIO, FENTRADA, UDI);
        Assertions.assertEquals(souvenir,aparatoEquals);
    }
    @Test
    public void souvenirSetGetTest(){
        String nombreUpdate = "NombreUpdate";
        float precioUpdate = 10f;
        String fEntradaUpdate= "2024-01-02";
        souvenir.setNombre(nombreUpdate);
        souvenir.setPrecio(precioUpdate);
        souvenir.setFechaEntrada(fEntradaUpdate);

        Assertions.assertEquals(nombreUpdate, souvenir.getNombre());
        Assertions.assertEquals(nombreUpdate, souvenir.getNombre());
        Assertions.assertEquals(precioUpdate, souvenir.getPrecio());
    }
    @Test
    public void toCsvTest(){
        Assertions.assertEquals(NOMBRE+","+PRECIO+","+FENTRADA+","+UDI, souvenir.toCsv());
    }
    @Test
    public void cantidadDisponibleTest(){
        Assertions.assertEquals(0, souvenir.cantidadDisponible());
    }
}
