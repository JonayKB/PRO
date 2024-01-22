package ies.puerto.UltimoEjercicio.implementation;

import ies.puerto.UltimoEjercicio.abstrac.Empleado;

public class Profesor extends Empleado{
    private String especialidad;
    public Profesor(){}
    public Profesor (String nombre, String fechaNacimiento, float salario, String trabajo, String especialidad){
        super(nombre, fechaNacimiento, salario, trabajo);
        this.especialidad = especialidad;
    }

    @Override
    public float calcularSalario() {

        return getSalario();
    }
    public String impartirClase(){
        return getNombre()+" esta impartiendo clase";
    }

    @Override
    public String toString() {

        return "Me llamo "+getNombre()+"\nNací en "+getFechaNacimiento()+"\nSalario: "+getSalario()+"\nMi trabajo es "+getTrabajo()+"\nMi especialidad es: "+especialidad;
    }
    
}
