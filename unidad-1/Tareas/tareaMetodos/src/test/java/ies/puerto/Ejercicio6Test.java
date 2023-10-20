package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    static Ejercicio6 ejercicio6;

    @BeforeAll
    public static void before(){
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void verificarArmstrongFalse() {
        int numero = 154;

        boolean resultado = ejercicio6.verificarArmstrong(numero);
        Assertions.assertFalse(resultado, "El número NO debe ser armstrong");
    }
    
}
