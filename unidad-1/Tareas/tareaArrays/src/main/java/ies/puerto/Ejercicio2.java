package ies.puerto;
/**
 * Calcula el promedio de los elementos en un array de números en punto flotante.
 * @author JonayKB
 */

public class Ejercicio2 {
    /**
     * Función para calcular el promedio de un array
     * @param numeros array de floats
     * @return devolvemos un float con el promedio
     */
    public float calcularPromedio(float[] numeros){
        float resultado = 0;
        for (float numero : numeros) {
            resultado += numero;  
        }



        return resultado/numeros.length;
    }
    
}
