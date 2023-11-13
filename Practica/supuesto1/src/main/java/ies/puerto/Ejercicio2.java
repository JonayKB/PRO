package ies.puerto;
/**
 * Implementa el algoritmo de ordenamiento de burbuja para ordenar un array de números enteros.
 * @author JonayKB
 */
public class Ejercicio2 {

    public Ejercicio2(){};
    
    /**
     * Función que ordena mediante el algoritmo bubblesort
     * @param array el cual ordenamos
     * @return array ordenado
     */
    public int[] bubbleSort(int[] array){
        for(int i= 0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
}
