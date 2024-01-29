package ies.puerto.parteDos.implement;

import java.util.ArrayList;

public class Aula {
    private String nombre;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;


    public Aula(String nombre, Profesor profesor, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    /**
     * Calcula la nota media de un aula
     * @return nota media del aula
     */
    public float notaMedia(){
        float suma = 0;
        for (Alumno alumno : alumnos) {
            suma += alumno.notaMedia();
        }
        return suma/alumnos.size();
    }
    @Override
    public String toString() {
        return "Soy un aula,\nNombre: "+nombre+"\nProfesor: "+profesor+"\nAlumnos: "+alumnos;
    }
}
