package ies.puerto.parteDos;

public class Profesor extends Empleado{
    private String especialidad;
    public Profesor(String nombre, String dni, String fechaNacimiento, float salario, String especialidad){
        super(nombre, dni, fechaNacimiento, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        
        return "Soy un profesor\nNombre: "+getNombre()+"\nDNI: "+getDni()+"\nFecha Nacimiento: "+getFechaNacimiento()+"\nSalario: "+getSalario()+"\nEspecialidad: "+especialidad;
    }
}
