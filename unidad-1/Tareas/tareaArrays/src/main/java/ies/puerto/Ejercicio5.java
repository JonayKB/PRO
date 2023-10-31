package ies.puerto;
/**
 * Dado un valor específico, encuentra su posición en el array o indica si no está presente
 * @author JonayKB
 */
public class Ejercicio5 {
    /**
     * Función para encontrar un valor en un array
     * @param numeros array que introducimos
     * @param valor valor qu buscamos
     * @return index donde esta el valor
     */
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
