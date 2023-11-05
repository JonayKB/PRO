package ies.puerto;
/**
 * Crea una clase Persona con las siguientes propiedades: nombre, edad, email y telefono. 
 * Crea objetos de esta clase y realiza algunas operaciones como imprimir los detalles de las personas, 
 * cambiar el nombre, etc.
 * @author JonayKB
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private String telefono;

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Constructor por defecto de la clase
     */
    public Persona(){}

    /**
     * Constructor con el parámetro nombre
     * @param nombre de la persona
     */
    public Persona(String nombre){
        this.nombre=nombre;
    }


    /**
     * Constructor con el parámetro nombre y edad
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    /**
     * Constructor con el parámetro nombre, edad y email
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona(String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }


    /**
     * Constructor con el parámetro nombre, edad, email y telefono
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona(String nombre, int edad, String email, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    /**public void imprimir(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Email: "+ email);
        System.out.println("Teléfono: "+ telefono);
    }
    */
    public String imprimir(){
        return "Nombre: "+nombre+"\nEdad: "+ edad+"\nEmail: "+ email+"\nTeléfono: "+ telefono;
    }
}