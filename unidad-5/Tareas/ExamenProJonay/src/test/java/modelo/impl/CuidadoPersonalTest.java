package modelo.impl;


import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;

public class CuidadoPersonalTest {
private static final String UDI = "ALM001";
    private static final String FENTRADA = "2024-01-09";
    private static final float PRECIO = 2.50f;
    private static final int POPULARIDAD = 8;
    private static final String NOMBRE = "Manzanas";
    static CuidadoPersonal cuidadoPersonal;
    
    @BeforeEach
    public void beforeEach() throws ParseException{
        cuidadoPersonal = new CuidadoPersonal(NOMBRE, PRECIO, FENTRADA,UDI,POPULARIDAD);
    }

    @Test
    public void cuidadoPersonalNotNullTest(){
        Assertions.assertNotNull(cuidadoPersonal);
    }
    @Test
    public void toStringTest(){
        Assertions.assertTrue(cuidadoPersonal.toString().contains(UDI));
    }
    @Test
    public void equalsTest()throws ParseException{
        CuidadoPersonal aparatoEquals = new CuidadoPersonal(NOMBRE, PRECIO, FENTRADA, UDI,POPULARIDAD);
        Assertions.assertEquals(cuidadoPersonal,aparatoEquals);
    }
    @Test
    public void cuidadoPersonalSetGetTest(){
        String nombreUpdate = "NombreUpdate";
        float precioUpdate = 10f;
        String fEntradaUpdate= "2024-01-02";
        cuidadoPersonal.setNombre(nombreUpdate);
        cuidadoPersonal.setPrecio(precioUpdate);
        cuidadoPersonal.setFechaEntrada(fEntradaUpdate);

        Assertions.assertEquals(nombreUpdate, cuidadoPersonal.getNombre());
        Assertions.assertEquals(nombreUpdate, cuidadoPersonal.getNombre());
        Assertions.assertEquals(precioUpdate, cuidadoPersonal.getPrecio());
    }
    @Test
    public void toCsvTest(){
        Assertions.assertEquals(NOMBRE+","+PRECIO+","+FENTRADA+","+UDI+","+POPULARIDAD, cuidadoPersonal.toCsv());
    }
    @Test
    public void cantidadDisponibleTest(){
        Assertions.assertEquals(0, cuidadoPersonal.cantidadDisponible());
    }
    @Test
    public void calcularPopularidadTest(){
        Assertions.assertEquals(8, cuidadoPersonal.calcularPopularidad());
    }
    @Test
    public void recomendarProductoTestTrue(){
        Assertions.assertTrue(cuidadoPersonal.recomendarProducto());
    }
    @Test
    public void recomendarProductoTestFalse(){
        CuidadoPersonal cuidadoPersonalRecomendar = new CuidadoPersonal(NOMBRE, PRECIO, FENTRADA, UDI, 0);
        Assertions.assertFalse(cuidadoPersonalRecomendar.recomendarProducto());
    }
}
