package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio2();

    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(5050, ejercicio.sumaNaturales(100));
    }
}
