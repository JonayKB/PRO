package ies.puerto;
/**
 * Sumar todos los números de un array
 * @author JonayKB
 */
public class Ejercicio1 {
    /**
     * Función que calcula la suma de todos los numeros de un array
     * @param numeros array de int
     * @return devuelve la suma
     */
    public int calcularSuma(int[] numeros){
        
        int resultado = 0;
 
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
