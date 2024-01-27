package ies.puerto.parteUno;
/**
 * Implementa una clase Curso que contenga un ArrayList de alumnos. 
 * Agrega métodos para agregar y eliminar alumnos, así como para calcular la media de las calificaciones de todo el curso. a la lista.
 */

import java.util.ArrayList;

public class Curso {
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    public Curso(){}
    public Curso(ArrayList<Alumno> alumnos){
        this.alumnos = alumnos;
    }

    public void añadirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public void eliminarAlumno(int numeroAlumno){
        alumnos.remove(numeroAlumno);
    }
    public float promedioCurso(){
        float suma=0;
        for (Alumno alumno : alumnos) {
            suma += alumno.calcularPromedio();
        }
        return suma/alumnos.size();
    }
    @Override
    public String toString() {

        return "Soy un curso, y mis alumnos son: "+alumnos;
    }
}
