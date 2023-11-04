package ies.puerto;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private float promedio;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return this.promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Estudiante(){}
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante(String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public Estudiante(String nombre, int edad, String carrera, float promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }


    public boolean calcularPromedio(float promedio){
        boolean resultado = false;
        if(promedio>=5f){
            resultado = true;
        }
        return resultado;
    }
    public String mostrarDetalles(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nCarrera: "+carrera+"\nPromedio: "+promedio;
    }

}
