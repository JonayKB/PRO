package ies.puerto;
/**
 * Imprime los números pares de un array de enteros
 * @author JonayKB
 */
public class Ejercicio4 {
    /**
     * Función para calcular los numeros pares
     * @param numeros array de int
     * @return devuelve un array con los pares
     */
    public int[] calcularPares(int[] numeros){
        int i = 0;
        int[] temp = new int[numeros.length];
        for (int numero : numeros) {
            if (numero%2==0){
                temp[i]=numero;
                i++;
            }
        }


        int[] resultado = new int[i];
        for(int j = 0; j<i; j++){
            resultado[j]=temp[j];
        }
        return resultado;
    }
}
