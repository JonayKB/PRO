package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio= new Ejercicio6();
    }

    @Test
    public void ejercicio1Test2() {
        Assertions.assertEquals(9, ejercicio.potencia(3, 2));
    }
    @Test
    public void ejercicio1Test3() {
        Assertions.assertEquals(27, ejercicio.potencia(3, 3));
    }
    @Test
    public void ejercicio1Test4() {
        Assertions.assertEquals(16, ejercicio.potencia(2, 4));
    }
}
