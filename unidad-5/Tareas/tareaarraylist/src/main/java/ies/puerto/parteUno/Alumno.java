package ies.puerto.parteUno;

import java.util.ArrayList;
/**
 * Implementa una clase Alumno con atributos como nombre, apellido y calificaciones (un ArrayList de float). 
 * Crea instancias de esta clase para representar a varios alumnos y calcula el promedio de calificaciones. a la lista.
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Float> calificaciones= new ArrayList<>();


    public Alumno() {
    }

    public Alumno(String nombre, String apellido, ArrayList<Float> calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Float> getCalificaciones() {
        return this.calificaciones;
    }

    public void setCalificaciones(ArrayList<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public float calcularPromedio(){
        float suma = 0;
        for (float e : calificaciones) {
            suma+=e;
        }
        return suma/calificaciones.size();
    }

    @Override
    public String toString() {
        
        return "Soy "+nombre+" "+apellido+" y tengo unas notas: "+calificaciones;
    }

    public boolean equals(Alumno alumno) {
        if (nombre==alumno.nombre && apellido==alumno.apellido) {
            return true;
        }
        return false;
    }
}
