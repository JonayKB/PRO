package ies.puerto.parteDos;

import java.text.ParseException;
import java.util.ArrayList;

public class Colegio {
    private String nombre;
    private String dirreccion;
    private String ubicacion;
    private ArrayList<Aula> aulas;


    public Colegio(String nombre, String dirreccion, String ubicacion, ArrayList<Aula> aulas) {
        this.nombre = nombre;
        this.dirreccion = dirreccion;
        this.ubicacion = ubicacion;
        this.aulas = aulas;
    }
    /**
     * Calcula la nota media de notas de un colegio
     * @return nota media del colegio
     */
    public float notaMedia(){
        float suma=0;
        int cantidad=0;
        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                for (Nota nota : alumno.getNotas()) {
                    suma+= nota.getValor();
                    cantidad++;
                }
            }
        }
        return suma/cantidad;
    }
    /**
     * Calcula la nota mas alta de un colegio
     * @return nota mas alta
     */
    public float notaMaxima(){
        float notaMaxima=0;
        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                for (Nota nota : alumno.getNotas()) {
                    if (notaMaxima<nota.getValor()) {
                        notaMaxima=nota.getValor();
                    }
                }
            }
        }
        return notaMaxima;
    }
    /**
     * Calcula el salario medio de todos los profesores
     * @return salario medio de los profesores
     */
    public float salarioMedio(){
        float suma = 0f;
        int cantidad = 0;
        for (Aula aula : aulas) {
            suma += aula.getProfesor().getSalario();
            cantidad++;
        }
        return suma/cantidad;
    }
    /**
     * Salario mas alto del colegio
     * @return el salario que es
     */
    public float salarioMaximo(){
        float salarioMaximo = 0;
        for (Aula aula : aulas) {
            if (salarioMaximo<aula.getProfesor().getSalario()) {
                salarioMaximo= aula.getProfesor().getSalario();
            }
        }
        return salarioMaximo;
    }
    /**
     * Salario mas bajo del colegio
     * @return el salario que es
     */
    public float salarioMinimo(){
        float salarioMaximo = Float.MAX_VALUE;
        for (Aula aula : aulas) {
            if (salarioMaximo>aula.getProfesor().getSalario()) {
                salarioMaximo= aula.getProfesor().getSalario();
            }
        }
        return salarioMaximo;
    }
    /**
     * Busca una persona por su dni
     * @param dniBuscado de la persona a buscar
     * @return el toString de la persona
     */
    public String busquedaPorDni(String dniBuscado){
        
        for (Aula aula : aulas) {
            if (aula.getProfesor().getDni()==dniBuscado) {
                return aula.getProfesor().toString();
            }
            else{
                for (Alumno alumno : aula.getAlumnos()) {
                    if (alumno.getDni()==dniBuscado) {
                        return alumno.toString();
                    }
                }
            }
        }
        return "No encontrado";
    }
    /**
     * Calcula la edad media de profesor y alumnos juntos
     * @return la edad 
     * @throws ParseException
     */
    public float edadMediaTodos()throws ParseException{
        int cantidad = 0;
        int suma=0;
        for (Aula aula : aulas) {
            suma += aula.getProfesor().anios();
            cantidad++;
            for (Alumno alumno : aula.getAlumnos()) {
                suma += alumno.anios();
                cantidad++;
            }

        }
        return suma/cantidad;
    }
    public float edadMediaAlumnos() throws ParseException{
        int cantidad = 0;
        int suma = 0;
        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                suma += alumno.anios();
                cantidad++;
            }
        }
        return suma/cantidad;
    }
    @Override
    public String toString() {
        return "Soy un colegio\nNombre: "+nombre+"\nDireccion: "+dirreccion+"\nUbicacion: "+ubicacion+"\nAulas: "+aulas;
    }
}
