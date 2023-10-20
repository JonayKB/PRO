package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();


    public void verificarDiaSemana(String strDia, int numeroDia) {
        String resultado = "";
        String resultadoCorrecto = strDia;
        resultado = ejercicio7.calcularDiaSemana(numeroDia);

        Assertions.assertEquals(resultadoCorrecto,resultado, "No es el resultado esperado");

    }

    @Test
    public void verificarDiasSemanaTestOK() {
        verificarDiaSemana("Lunes", 1);
        verificarDiaSemana("Martes", 2);
        verificarDiaSemana("Míercoles", 3);
        verificarDiaSemana("Jueves", 4);
        verificarDiaSemana("Viernes", 5);
        verificarDiaSemana("Sábado", 6);
        verificarDiaSemana("Domingo", 7);
        verificarDiaSemana("No es un día de la semana", 11);


    }


    
    
}
