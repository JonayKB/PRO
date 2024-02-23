package modelo.impl;
import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Alimento;

public class AlimentoTest {
    private static final String FCADUCIDAD = "2024-01-15";
    private static final String UDI = "ALM001";
    private static final String FENTRADA = "2024-01-09";
    private static final float PRECIO = 2.50f;
    private static final String NOMBRE = "Manzanas";
    static Alimento alimento;
    
    @BeforeEach
    public void beforeEach() throws ParseException{
        alimento = new Alimento(NOMBRE, PRECIO, FENTRADA,UDI,FCADUCIDAD);
    }

    @Test
    public void alimentoNotNullTest(){
        Assertions.assertNotNull(alimento);
    }
    @Test
    public void toStringTest(){
        Assertions.assertTrue(alimento.toString().contains(UDI));
    }
    @Test
    public void equalsTest()throws ParseException{
        Alimento alimentoEquals = new Alimento(NOMBRE, PRECIO, FENTRADA, UDI, FCADUCIDAD);
        Assertions.assertEquals(alimento,alimentoEquals);
    }
    @Test
    public void alimentoSetGetTest(){
        String nombreUpdate = "NombreUpdate";
        float precioUpdate = 10f;
        String fEntradaUpdate= "2024-01-02";
        alimento.setNombre(nombreUpdate);
        alimento.setPrecio(precioUpdate);
        alimento.setFechaEntrada(fEntradaUpdate);

        Assertions.assertEquals(nombreUpdate, alimento.getNombre());
        Assertions.assertEquals(nombreUpdate, alimento.getNombre());
        Assertions.assertEquals(precioUpdate, alimento.getPrecio());
    }
    @Test
    public void toCsvTest(){
        Assertions.assertEquals(NOMBRE+","+PRECIO+","+FENTRADA+","+UDI+","+FCADUCIDAD, alimento.toCsv());
    }
    @Test
    public void cantidadDisponibleTest(){
        Assertions.assertEquals(0, alimento.cantidadDisponible());
    }
    @Test
    public void diasCaducidadTest(){
        Assertions.assertEquals(-39, alimento.diasCaducidad());
    }
    @Test
    public void productoCaducadoTestTrue(){
        Assertions.assertTrue(alimento.productoCaducado());
    }
    @Test
    public void productoCaducadoTestFalse()throws ParseException{
        Alimento alimentoNoCaducado = new Alimento(NOMBRE, PRECIO, FENTRADA, UDI, "2024-02-30");
        Assertions.assertFalse(alimentoNoCaducado.productoCaducado());
    }
}
