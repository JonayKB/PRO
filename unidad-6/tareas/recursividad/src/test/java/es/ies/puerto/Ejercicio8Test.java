package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
    Ejercicio8 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio8();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(1, ejercicio.sumaDigitos(10));
    }
    @Test
    public void ejercicio2Test() {
        Assertions.assertEquals(1, ejercicio.sumaDigitos(100));
    }
    @Test
    public void ejercicio3Test(){
        Assertions.assertEquals(8, ejercicio.sumaDigitos(233));
    }
}
