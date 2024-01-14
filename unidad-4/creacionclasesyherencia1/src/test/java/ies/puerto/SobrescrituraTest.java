package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SobrescrituraTest {
    static Alumno alumno;
    static Persona persona;
    @BeforeAll
    public static void BeforeAll(){
        alumno = new Alumno(0, null, null, null, null);
        persona = new Persona(0, null, null);
    }

    @Test
    public void verificarSaludarPersona(){
        String resultadoOK="Hola buenos dias";
        String resultado = persona.saludar();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void verificarSaludarAlumno(){
        String resultadoOK="Hola, ¿Cómo te va pibe?";
        String resultado = alumno.saludar();

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
