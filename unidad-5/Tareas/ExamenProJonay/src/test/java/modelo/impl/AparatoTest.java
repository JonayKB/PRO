package modelo.impl;


import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;

public class AparatoTest {
    private static final String UDI = "ALM001";
    private static final String FENTRADA = "2024-01-09";
    private static final float PRECIO = 2.50f;
    private static final String NOMBRE = "Manzanas";
    static Aparato aparato;
    
    @BeforeEach
    public void beforeEach() throws ParseException{
        aparato = new Aparato(NOMBRE, PRECIO, FENTRADA,UDI);
    }

    @Test
    public void aparatoNotNullTest(){
        Assertions.assertNotNull(aparato);
    }
    @Test
    public void toStringTest(){
        Assertions.assertTrue(aparato.toString().contains(UDI));
    }
    @Test
    public void equalsTest()throws ParseException{
        Aparato aparatoEquals = new Aparato(NOMBRE, PRECIO, FENTRADA, UDI);
        Assertions.assertEquals(aparato,aparatoEquals);
    }
    @Test
    public void aparatoSetGetTest(){
        String nombreUpdate = "NombreUpdate";
        float precioUpdate = 10f;
        String fEntradaUpdate= "2024-01-02";
        aparato.setNombre(nombreUpdate);
        aparato.setPrecio(precioUpdate);
        aparato.setFechaEntrada(fEntradaUpdate);

        Assertions.assertEquals(nombreUpdate, aparato.getNombre());
        Assertions.assertEquals(nombreUpdate, aparato.getNombre());
        Assertions.assertEquals(precioUpdate, aparato.getPrecio());
    }
    @Test
    public void toCsvTest(){
        Assertions.assertEquals(NOMBRE+","+PRECIO+","+FENTRADA+","+UDI, aparato.toCsv());
    }
    @Test
    public void cantidadDisponibleTest(){
        Assertions.assertEquals(0, aparato.cantidadDisponible());
    }
}
