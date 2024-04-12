package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {
    Ejercicio9 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio9();

    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)), ejercicio.serieNumeros(10));
        }
    }
