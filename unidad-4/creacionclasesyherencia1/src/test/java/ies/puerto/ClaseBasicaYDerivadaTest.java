package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClaseBasicaYDerivadaTest {
    static Persona persona;
    static Alumno alumno;

    @BeforeAll
    public static void BeforeAll(){
        persona=new Persona(18, "Silisto", "3131233J");
        float[] notas ={1f,2.3f,4f,4.3f};
        alumno = new Alumno(19, "Estonio", "13123213S","2ºBach",notas);
    }
    @Test
    public void personaTestOK(){
        String resultadoOK="Soy una Persona:{DNI: 3131233J\nNombre: Silisto\nEdad: 18}";
        String resultado= persona.toString();

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void alumnoTestOK(){
        String resultadoOK="Soy un Alumno:{DNI: 13123213S\nNombre: Estonio\nEdad: 19\nCurso: 2ºBach\nNotas: 1.0 2.3 4.0 4.3 }";
        String resultado= alumno.toString();

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
