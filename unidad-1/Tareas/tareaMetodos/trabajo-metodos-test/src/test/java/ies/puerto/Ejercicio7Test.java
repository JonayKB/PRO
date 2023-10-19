package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();
    @Test
    public void calcularLunestestOK() {
        String resultado = "";
        String resultadoCorrecto = "Lunes";
        resultado = ejercicio7.calcularDiaSemana(1);

        Assertions.assertEquals(resultadoCorrecto,resultado, "No es el resultado esperado");

    }
}
