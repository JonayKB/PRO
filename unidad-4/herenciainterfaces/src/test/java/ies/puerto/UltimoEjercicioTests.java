package ies.puerto;
import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import ies.puerto.UltimoEjercicio.implementation.Alumno;
import ies.puerto.UltimoEjercicio.implementation.Profesor;

public class UltimoEjercicioTests {
    static Profesor profesor;
    static Alumno alumno;

    @BeforeAll
    public static void BeforeAll(){
        profesor = new Profesor("Roberto", "05/02/2005", 9900, "Profesor", "Mates");
        alumno = new Alumno("Jonay", "01/01/2005", "BACHº1");
    }

    @Test
    public void toStringProfesorTestOK(){
        String resultadoOK = "Me llamo Roberto\nNací en 05/02/2005\nSalario: 9900.0\nMi trabajo es Profesor\nMi especialidad es: Mates";
        String resultado = profesor.toString();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void aniosProfesorTestOK() throws ParseException{
        int resultadoOK = 18;
        int resultado = profesor.anios();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void impartirClaseProfesorTestOK() throws ParseException{
        String resultadoOK = "Roberto esta impartiendo clase";
        String resultado = profesor.impartirClase();

        Assertions.assertEquals(resultadoOK, resultado);
    }






    @Test
    public void toStringAlumnoTestOK(){
        String resultadoOK = "Me llamo Jonay\nNací en 01/01/2005\nMi nivel es: BACHº1";
        String resultado = alumno.toString();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void aniosAlumnoTestOK() throws ParseException{
        int resultadoOK = 19;
        int resultado = alumno.anios();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void estudiarAlumnoTestOK() throws ParseException{
        String resultadoOK = "Jonay esta estudiando";
        String resultado = alumno.estudiar();

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
