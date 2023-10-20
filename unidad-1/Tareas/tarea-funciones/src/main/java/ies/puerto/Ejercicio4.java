package ies.puerto;
/**
 * Crea una función que tome dos parámetros numéricos y calcule el máximo de los dos números. 
 * Crear una nueva función con el mismo nombre, que tome tres parámetros, y calcule el máximo de los tres números. 
 * Esta segunda función debe hacer uso de la primera.
 * @author JonayKB
 */
public class Ejercicio4 {
    /**
     * Función para detectar el mayor de dos números
     * @param valorA primer valor
     * @param valorB segundo valor
     * @return devolvemos el valor mayor
     */
    public int maximoDeDos(int valorA, int valorB){
        int resultado = valorB;
        if (valorA > valorB){
            resultado = valorA;
        }


        return resultado;
    }

    /**
     * Función para detectar el mayor de dos números
     * @param valorA primer valor
     * @param valorB segundo valor
     * @param valorC tercero valor
     * @return
     */
    public int maximoDeDos(int valorA, int valorB, int valorC){
        int resultado = valorC;
        resultado = maximoDeDos(maximoDeDos(valorA, valorB), valorC);
        return resultado;
    }
}