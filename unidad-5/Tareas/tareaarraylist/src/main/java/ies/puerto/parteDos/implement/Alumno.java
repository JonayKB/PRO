package ies.puerto.parteDos.implement;

import java.util.ArrayList;

import ies.puerto.parteDos.abstrac.Persona;

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
    public float notaMedia(){
        float resultado=0;
        if (notas.isEmpty()) {
            return resultado;
        }
        for (Nota nota : notas) {
            resultado+=nota.getValor();
        }
        return resultado/notas.size();
    }
    @Override
    public String toString() {
        
        return "Soy un alumno\nNombre: "+getNombre()+"\nDNI: "+getDni()+"\nFecha Nacimiento: "+getFechaNacimiento()+"\nNotas: "+notas;
    }
    
}
