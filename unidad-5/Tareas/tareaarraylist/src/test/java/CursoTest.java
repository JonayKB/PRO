import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteUno.Alumno;
import ies.puerto.parteUno.Curso;

public class CursoTest {
    static Curso curso;
    static Alumno roberto;
    static Alumno ruben;
    static Alumno jonay;

    @BeforeAll
    public static void BeforeAll(){
        ArrayList<Float> calificaciones = new ArrayList<>(Arrays.asList(3f,4.5f,10f,0f));
        ArrayList<Float> calificaciones2 = new ArrayList<>(Arrays.asList(3f,4.5f,0f,0f));

        roberto= new Alumno("Roberto","Carballo", calificaciones2);

        ruben= new Alumno("Ruben", "Abreu", calificaciones);

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(ruben);

        curso = new Curso(alumnos);
    }

    @Test
    public void añadirAlumnoTest(){
        curso.añadirAlumno(roberto);
        String resultado = curso.toString();
        String resultadoOK= "Soy un curso, y mis alumnos son: [Soy Ruben Abreu y tengo unas notas: [3.0, 4.5, 10.0, 6.0], Soy Roberto Carballo y tengo unas notas: [3.0, 4.5, 0.0, 0.0]]";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void eliminarAlumnoTest(){
        curso.eliminarAlumno(0);
        String resultado = curso.toString();
        String resultadoOK = "Soy un curso, y mis alumnos son: []";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void calcularPromedioTest(){
        float resultado = curso.promedioCurso();
        float resultadoOK =4.375f;

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
