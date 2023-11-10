package ies.puerto;
/**
 * Implementa el algoritmo de búsqueda binaria para encontrar la posición de un elemento en un array ordenado.
 * @author JonayKB
 */
public class Ejercicio1 {
    
    public Ejercicio1(){};

    /**
     * Función que usa la busqueda binaria para encontrar un valor en un array
     * @param array donde buscamos el valor
     * @param valor el valor
     * @return la posición del valor
     */
    public int busquedaBinaria( int[] array, int valor){
        int inicio = 0;
        int fin = array.length-1;
        int resultado = 0;
        
        boolean encontrado = false;
        while ((encontrado==false)) {
            int mediano = (inicio+fin)/2;
        if(array[mediano]==valor){
            resultado = mediano;
            encontrado = true;
        }
        else if(array[mediano]<valor){
            inicio = mediano+1;
        }
        else {
            fin = mediano;
        }
     }
            
        return resultado;
    }
}