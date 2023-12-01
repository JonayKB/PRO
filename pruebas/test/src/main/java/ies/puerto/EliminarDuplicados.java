package ies.puerto;

import java.util.Arrays;

public class EliminarDuplicados {

    public int[] revisarDuplicados(int[] array){
        
        Arrays.sort(array);
        int longitud = array.length;
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

        int[] resultado = new int[longitud];

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
    