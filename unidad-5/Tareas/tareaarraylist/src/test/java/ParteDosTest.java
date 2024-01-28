import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;

import ies.puerto.parteDos.Alumno;
import ies.puerto.parteDos.Aula;
import ies.puerto.parteDos.Colegio;
import ies.puerto.parteDos.Nota;
import ies.puerto.parteDos.Profesor;

public class ParteDosTest {
    static Colegio colegio;
    static Aula aula1;
    static Aula aula2;
    static Alumno alumno1;
    static Alumno alumno2;
    static Nota nota1;
    static Nota nota2;
    static Profesor profesor1;
    static Profesor profesor2;
    @BeforeAll
    public void BeforeAll(){
        ArrayList<Nota> notas1 = new ArrayList<>();
        ArrayList<Nota> notas2 = new ArrayList<>();
        notas1.add(nota1);
        notas2.add(nota2);

        alumno1 = new Alumno("Ruben", "12345678F", "28/11/2005", notas1);
        alumno2 = new Alumno("Jonay", "87654321F", "07/02/2005", notas2);

        ArrayList<Alumno> alumnos1 = new ArrayList<>();
        ArrayList<Alumno> alumnos2 = new ArrayList<>();
        alumnos1.add(alumno1);
        alumnos2.add(alumno2);
        aula1 = new Aula("Aula 1", profesor1, alumnos1);
        aula2 = new Aula("Aula 2", profesor2, alumnos2);
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        colegio = new Colegio("Colegio", "Alguna direccion", "Tenerife", aulas);
    }
}
