

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.CuidadoPersonal;

public class CuidadoPersonalTest {
    static CuidadoPersonal cuidadoPersonalVacio;
    static CuidadoPersonal cuidadoPersonal;
    static CuidadoPersonal cuidadoPersonal2;
    
    @BeforeAll
    public static void BeforeAll(){
        cuidadoPersonal = new CuidadoPersonal("Cepillo de dientes",2.29f,"2024-02-09","CUI003",6);
        cuidadoPersonalVacio = new CuidadoPersonal();
        cuidadoPersonal2 = new CuidadoPersonal("Champú",3.99f,"2024-02-09","CUI001"	,7);

    }

    @Test
    void comprobarConstructorCompletoTest(){
        Assertions.assertEquals("CUI003",cuidadoPersonal.getUdi());
    }
    @Test
    void comprobarConstructorVacioTest(){
        Assertions.assertEquals(null,cuidadoPersonalVacio.getUdi());
    }
    @Test
    void comprobarCantidadDisponibleTest(){
        Assertions.assertEquals(0,cuidadoPersonal.cantidadDisponible());
    }
    @Test
    void comprobarPrecioMaximoTest(){
        Assertions.assertEquals(2.29f*1.8f,cuidadoPersonal.precioMaximo());
    }
    @Test
    void comprobarPopularidadTest(){
        Assertions.assertEquals(6,cuidadoPersonal.calcularPopularidad());
    }
    @Test
    void comprobarRecomendarTestFalse(){
        Assertions.assertFalse(cuidadoPersonal.recomendarProducto());
    }
    @Test
    void comprobarRecomendarTestTrue(){
        Assertions.assertTrue(cuidadoPersonal2.recomendarProducto());
    }
}
