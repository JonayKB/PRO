package ies.puerto;

public class Persona {
    protected int edad;
    protected String nombre;
    protected String dni;

    public Persona() {
    }
    /**
     * Constructor de Persona
     * @param edad de la persona
     * @param nombre de la persona
     * @param dni de la persona
     */
    public Persona(int edad, String nombre, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }
    //Getters and Setters
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString(){
        return "Soy una Persona:{DNI: "+dni+"\nNombre: "+nombre+"\nEdad: "+edad+"}";
    }

}