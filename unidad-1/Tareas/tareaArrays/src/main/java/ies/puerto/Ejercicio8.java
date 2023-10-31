package ies.puerto;

import java.util.Arrays;

/**
 * Elimina elementos duplicados de un array, y muestra finalmente los valores iniciales del array y el resultado final.
 */
public class Ejercicio8 {
    public int[] eliminarDuplicados(int[] array){
        int k = 0;
        Arrays.sort(array);
        int longitud = array.length;
        for(int i=0; i<array.length; i++){
            for(int j = i; j<array.length-1; j++){
                if( array[i] == array[j+1]){
                    longitud--;
                    array[j+1] = 0;
                }
                else{
                    break;
                }
            }
        }
        

        int[] resultado = new int[longitud];

        for (int i : array) {
            if(i!=0){
                resultado[k] = i;
                k++;
            }
            
        }
        return resultado;

        
    }

    
    
}
