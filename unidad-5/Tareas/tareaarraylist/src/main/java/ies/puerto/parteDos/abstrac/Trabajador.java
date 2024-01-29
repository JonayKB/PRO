package ies.puerto.parteDos.abstrac;

public abstract class Trabajador extends Persona{
    private float salario;

    public Trabajador(String nombre, String dni, String fechaNacimiento, float salario){
        super(nombre, dni, fechaNacimiento);
        this.salario = salario;
    }

    public Trabajador() {
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
