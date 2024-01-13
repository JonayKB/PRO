package ies.puerto;

public class Conductor extends Persona {

    public Conductor() {
    }

    public Conductor(int edad, String nombre, String dni){
        super(edad, nombre, dni);
    }

    @Override
    public String toString() {
        return "Soy un Conductor:{DNI: "+dni+"\nNombre: "+nombre+"\nEdad: "+edad+"}";
    }
}
