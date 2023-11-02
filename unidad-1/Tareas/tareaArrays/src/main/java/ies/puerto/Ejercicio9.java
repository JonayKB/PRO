package ies.puerto;
/**
 * Combina dos arrays ordenados en uno solo manteniendo el orden.
 * @author JonayKB
 */
public class Ejercicio9 {
    /**
     * Función para combinar arrays
     * @param array primer array
     * @param array2 segunod array
     * @return arrays juntos
     */
    public int[] combinarArrays(int[] array, int[] array2){
        
        int[] resultado = new int[array.length+array2.length];
        int i = 0;
        
        while (i<array.length) {
                resultado[i] = array[i];
            i++;
        }
        while (i<resultado.length) {
            resultado[i] = array2[i-array.length];
            i++;
        }

        return resultado;
    }

}
