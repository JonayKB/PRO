package ies.puerto;

import java.util.Arrays;

/**
 * Elimina elementos duplicados de un array, y muestra finalmente los valores iniciales del array y el resultado final.
 * @author JonayKB
 */
public class Ejercicio8 {
    /**
     * Función para eliminar duplicados
     * @param array que eliminamos duplicados
     * @return array sin duplicados
     */
    public int[] revisarDuplicados(int[] array){
        
        Arrays.sort(array);
        int longitud = array.length+1;
        for(int i=0; i<array.length; i++){
            for(int j = i; j<array.length-1; j++){
                if( (array[i] == array[j+1]) && array[i]!=0){
                    longitud--;
                    array[j+1] = 0;
                }
                else{
                    break;
                }
            }
         
        }

        int[] resultado = new int[longitud-1];

        int k = 0;
        for (int i : array) {
            if(i!=0){
                resultado[k] = i;
                k++;
            }
            
        }

        return resultado;

        
    }

    
    
}
