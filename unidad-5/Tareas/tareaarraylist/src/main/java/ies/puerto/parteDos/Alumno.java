package ies.puerto.parteDos;

import java.util.ArrayList;

public class Alumno extends Persona{
    ArrayList<Nota> notas = new ArrayList<>();

    public Alumno(String nombre, String dni, String fechaNacimiento, ArrayList<Nota> notas){
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    public ArrayList<Nota> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    @Override
    public String toString() {
        
        return "Soy un alumno\nNombre: "+getNombre()+"\nDNI: "+getDni()+"\nFecha Nacimiento: "+getFechaNacimiento()+"\nNotas: "+notas;
    }
}
