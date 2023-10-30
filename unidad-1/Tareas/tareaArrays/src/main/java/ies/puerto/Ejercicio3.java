package ies.puerto;
/**
 * Encuentra el valor máximo 
 * y mínimo en un array de enteros.
 */

public class Ejercicio3 {
    /**
     * Función para calcular el valor mayor de un array
     * @param numeros array de int
     * @return devolvemos el valor mayor
     */
    public int calcularMayor(int[] numeros){
        int resultado = 0;
        for (int numero : numeros) {
            if (numero>resultado){
                resultado = numero;
            }
            
        }

        return resultado;

    }
    /**
     * Función para calcular el valor menor de un array
     * @param numeros array de int
     * @return devolvemos el valor menor
     */
    public int calcularMenor(int[] numeros){
        int resultado = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero<resultado){
                resultado = numero;
            }
            
        }

        return resultado;
    }
}
