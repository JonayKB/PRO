package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author
 */
public class Ejercicio1 {
    public static void main(String[] args) {

    }
    /**
     * Función para calcular el factorial de un número
     * @param numero Número del que se quiere obtener el factorial 
     * @return resultado de la operación factorial
     */
    public int calculoFactorial(int numero) {
        int resultado = 1;

        for (int i = 2; i<=numero; i++){
            resultado *= i;
        }


        return resultado;
    }

}