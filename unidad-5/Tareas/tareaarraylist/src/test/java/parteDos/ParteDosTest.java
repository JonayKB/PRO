package parteDos;
import java.text.ParseException;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ies.puerto.parteDos.implement.Alumno;
import ies.puerto.parteDos.implement.Aula;
import ies.puerto.parteDos.implement.Colegio;
import ies.puerto.parteDos.implement.Nota;
import ies.puerto.parteDos.implement.Profesor;

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
    public static void BeforeAll(){
        ArrayList<Nota> notas1 = new ArrayList<>();
        ArrayList<Nota> notas2 = new ArrayList<>();
        nota1 = new Nota("Mates", 10f);
        nota2 = new Nota("Lengua", 0f);
        notas1.add(nota1);
        notas2.add(nota2);

        profesor1 = new Profesor("Joatham", "00000000F", "01/01/1987", 12000, "Programación");
        profesor2 = new Profesor("Sara", "99999999F", "01/01/1990", 13000, "Base de Datos");

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
    @Test
    public void notaMediaAlumno1(){
        float resultado = alumno1.notaMedia();
        float resultadoOK = 10f;

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarExistenciaEstudiantes1(){
        String resultado = alumno1.toString();
        String resultadoOK = "Soy un alumno\nNombre: Ruben\nDNI: 12345678F\nFecha Nacimiento: 28/11/2005\nNotas: [Mates 10.0]";

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarExistenciaEstudiantes2(){
        String resultado = alumno2.toString();
        String resultadoOK = "Soy un alumno\nNombre: Jonay\nDNI: 87654321F\nFecha Nacimiento: 07/02/2005\nNotas: [Lengua 0.0]";

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarAnios1()throws ParseException {
        int resultado = alumno1.anios();
        int resultadoOK = 18;

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarAnios2()throws ParseException {
        int resultado = alumno2.anios();
        int resultadoOK = 18;

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarExistenciaProfesor1(){
        String resultado = profesor1.toString();
        String resultadoOK = "Soy un profesor\nNombre: Joatham\nDNI: 00000000F\nFecha Nacimiento: 01/01/1987\nSalario: 12000.0\nEspecialidad: Programación";

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarExistenciaProfesor2(){
        String resultado = profesor2.toString();
        String resultadoOK = "Soy un profesor\nNombre: Sara\nDNI: 99999999F\nFecha Nacimiento: 01/01/1990\nSalario: 13000.0\nEspecialidad: Base de Datos";

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void comprobarAula1(){
        String resultado = aula1.toString();
        String resultadoOK= "Soy un aula,\nNombre: Aula 1\nProfesor: Soy un profesor\nNombre: Joatham\nDNI: 00000000F\nFecha Nacimiento: 01/01/1987\nSalario: 12000.0\nEspecialidad: Programación\nAlumnos: [Soy un alumno\nNombre: Ruben\nDNI: 12345678F\nFecha Nacimiento: 28/11/2005\nNotas: [Mates 10.0]]";
        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarAula2(){
        String resultado = aula2.toString();
        String resultadoOK= "Soy un aula,\nNombre: Aula 2\nProfesor: Soy un profesor\nNombre: Sara\nDNI: 99999999F\nFecha Nacimiento: 01/01/1990\nSalario: 13000.0\nEspecialidad: Base de Datos\nAlumnos: [Soy un alumno\nNombre: Jonay\nDNI: 87654321F\nFecha Nacimiento: 07/02/2005\nNotas: [Lengua 0.0]]";
        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarColegio(){
        String resultado = colegio.toString();
        String resultadoOK = "Soy un colegio\nNombre: Colegio\nDireccion: Alguna direccion\nUbicacion: Tenerife\nAulas: [Soy un aula,\nNombre: Aula 1\nProfesor: Soy un profesor\nNombre: Joatham\nDNI: 00000000F\nFecha Nacimiento: 01/01/1987\nSalario: 12000.0\nEspecialidad: Programación\nAlumnos: [Soy un alumno\nNombre: Ruben\nDNI: 12345678F\nFecha Nacimiento: 28/11/2005\nNotas: [Mates 10.0]], Soy un aula,\nNombre: Aula 2\nProfesor: Soy un profesor\nNombre: Sara\nDNI: 99999999F\nFecha Nacimiento: 01/01/1990\nSalario: 13000.0\nEspecialidad: Base de Datos\nAlumnos: [Soy un alumno\nNombre: Jonay\nDNI: 87654321F\nFecha Nacimiento: 07/02/2005\nNotas: [Lengua 0.0]]]";
        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarEdadMediaColegio() throws ParseException{
        float resultado = colegio.edadMediaTodos();
        float resultadoOK = 26.00f;
        Assertions.assertEquals(resultado, resultadoOK);

    }
    @Test
    public void comprobarNotaMediaClase1(){
        float resultado = aula1.notaMedia();
        float resultadoOK = 10f;

        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarNotaMaximaColegio(){
        float resultado = colegio.notaMaxima();
        float resultadoOK = 10f;

        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarSalarioMedioColegio(){
        float resultado = colegio.salarioMedio();
        float resultadoOK = 12500;

        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarSalarioMaximoColegio(){
        float resultado = colegio.salarioMaximo();
        float resultadoOK = 13000;

        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarSalarioMinimoColegio(){
        float resultado = colegio.salarioMinimo();
        float resultadoOK = 12000;

        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void busquedaPorDniProfesor(){
        String resultado = colegio.busquedaPorDni("00000000F");
        String resultadoOK = "Soy un profesor\nNombre: Joatham\nDNI: 00000000F\nFecha Nacimiento: 01/01/1987\nSalario: 12000.0\nEspecialidad: Programación";
        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void busquedaPorDniAlumno(){
        String resultado = colegio.busquedaPorDni("87654321F");
        String resultadoOK = "Soy un alumno\nNombre: Jonay\nDNI: 87654321F\nFecha Nacimiento: 07/02/2005\nNotas: [Lengua 0.0]";
        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarEdadMediaAlumnos() throws ParseException{
        float resultado = colegio.edadMediaAlumnos();
        float resultadoOK = 18;

        Assertions.assertEquals(resultado, resultadoOK);
    }
    @Test
    public void comprobarIguales(){
        
    }
}
