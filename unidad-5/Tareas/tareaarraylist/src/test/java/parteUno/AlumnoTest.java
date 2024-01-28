package parteUno;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.Alumno;

public class AlumnoTest {
    static Alumno roberto;
    static Alumno ruben;
    static Alumno jonay;
    @BeforeAll
    public static void BeforeAll(){
        ArrayList<Float> calificaciones = new ArrayList<>(Arrays.asList(3f,4.5f,10f,6f));
        roberto= new Alumno("Roberto","Carballo", calificaciones);

        ruben= new Alumno("Ruben", "Abreu", calificaciones);

        jonay= new Alumno("Jonay", "Contreras", calificaciones);
    }


    @Test
    public void RobertoTestOK(){
        String resultado = roberto.toString();
        String resultadoOK= "Soy Roberto Carballo y tengo unas notas: [3.0, 4.5, 10.0, 6.0]";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void RubenTestOK(){
        String resultado = ruben.toString();
        String resultadoOK= "Soy Ruben Abreu y tengo unas notas: [3.0, 4.5, 10.0, 6.0]";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void JonayTestOK(){
        String resultado = jonay.toString();
        String resultadoOK= "Soy Jonay Contreras y tengo unas notas: [3.0, 4.5, 10.0, 6.0]";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void EqualsTestTRUE(){
        Assertions.assertTrue(jonay.equals(jonay));
    }

    @Test
    public void EqualsTestFALSE(){
        Assertions.assertFalse(jonay.equals(ruben));
    }

    @Test
    public void PromedioTestOK(){
        float resultado = jonay.calcularPromedio();
        float resultadoOK = 5.875f;

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
