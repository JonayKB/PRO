package ies.puerto;
/**
 * Dado un valor específico, encuentra su posición en el array o indica si no está presente
 */
public class Ejercicio5 {
    public int encontrarValor(int[] numeros, int valor){
        int resultado = -1;
        
        for(int i = 0; i < numeros.length; i++){
            if (valor == numeros[i]){
                resultado = i;
                return resultado;
            }
        }
        return resultado;
        
    }
}
