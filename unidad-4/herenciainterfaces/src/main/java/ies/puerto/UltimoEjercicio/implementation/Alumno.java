package ies.puerto.UltimoEjercicio.implementation;

import ies.puerto.UltimoEjercicio.abstrac.Persona;

public class Alumno extends Persona {
    private String nivel;

    public Alumno (String nombre, String fechaNacimiento, String nivel){
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    public String estudiar(){
        return getNombre()+" esta estudiando";
    }
    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    @Override
    public String toString() {

        return "Me llamo "+getNombre()+"\nNací en "+getFechaNacimiento()+"\nMi nivel es: "+nivel;
    }
}
