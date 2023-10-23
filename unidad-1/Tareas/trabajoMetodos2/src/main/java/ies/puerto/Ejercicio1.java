package ies.puerto;
/**
 * Realizar un programa que calcule el sueldo de un trabajador, 
 * el programa debe de tener un método que reciba el numero de horas que has trabajado en un mes, 
 * las horas se pagan a 10€.
 */
public class Ejercicio1 {


    /**
     * Función que calcula el sueldo que obtiene en función de las horas
     * @param numeroHoras el númeor de horas que realiza
     * @return devuelve el sueldo
     */
    public int calcularSueldoHoras(int numeroHoras){
        int sueldo = numeroHoras*10;
        return sueldo;
    }
}