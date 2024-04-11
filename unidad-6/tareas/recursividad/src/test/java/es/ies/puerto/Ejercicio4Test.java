package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio4();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(34, ejercicio.fibonacci(10));
    }

}
