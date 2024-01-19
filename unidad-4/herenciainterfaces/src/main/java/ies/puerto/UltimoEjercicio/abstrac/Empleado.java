package ies.puerto.UltimoEjercicio.abstrac;

import ies.puerto.UltimoEjercicio.interfaz.ITrabajador;

public abstract class Empleado extends Persona implements ITrabajador {
    private float salario;
    private String trabajo;
    public Empleado(){}
    public Empleado(String nombre, String fechaNacimiento, float salario, String trabajo) {
        super(nombre, fechaNacimiento);
        this.salario = salario;
        this.trabajo = trabajo;
    }
    
    @Override
    public String trabajar() {
        return "Trabajando en:"+trabajo;
    }

    public abstract float calcularSalario();
    @Override
    public String toString() {

        return "Me llamo "+getNombre()+"\nNací en "+getFechaNacimiento()+"\nSalario: "+salario+"\nMi trabajo es "+trabajo;
    }
    

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTrabajo() {
        return this.trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

}
