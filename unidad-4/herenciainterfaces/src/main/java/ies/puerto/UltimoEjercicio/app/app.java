package ies.puerto.UltimoEjercicio.app;

import java.text.ParseException;

import ies.puerto.UltimoEjercicio.implementation.Alumno;
import ies.puerto.UltimoEjercicio.implementation.Profesor;

public class app {
    static Profesor profesor;
    static Alumno alumno;
    public static void main(String[] args) throws ParseException {
        profesor = new Profesor("Roberto", "05/02/2005", 9900, "Profesor", "Mates");
        alumno = new Alumno("Jonay", "01/01/2005", "BACHº1");
        System.out.println(profesor.toString());
        System.out.println(profesor.anios());
        System.out.println(alumno.toString());
        System.out.println(alumno.anios());

    }
}
