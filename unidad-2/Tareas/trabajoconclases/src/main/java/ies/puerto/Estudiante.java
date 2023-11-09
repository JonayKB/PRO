package ies.puerto;
/**
 * Crea una clase Estudiante con propiedades como nombre, edad, carrera, y promedio. 
 * Agrega métodos para mostrar detalles, calcular si está aprobado o reprobado, etc.
 * @author JonayKB
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private float promedio;
    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return this.carrera;
    }


    public float getPromedio() {
        return this.promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }


    public Estudiante(){}

    /**
     * Constructor
     * @param nombre del estudiante
     * @param edad del estudiante
     * @param carrera del estudiante
     * @param promedio del estudiante
     */
    public Estudiante(String nombre, int edad, String carrera, float promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    /**
     * Función para calcular si el alumno esta aprobado o no
     * @return
     */
    public boolean verificarAprobado(){
        boolean resultado = false;
        if(promedio>=5f){
            resultado = true;
        }
        return resultado;
    }

    /**
     * Función para mostrar todos los detalles del alumno
     * @return
     */
    public String mostrarDetalles(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nCarrera: "+carrera+"\nPromedio: "+promedio;
    }

}
