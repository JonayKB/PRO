package ies.puerto;
/**
 * Escribe un programa que encuentre el primer número negativo en un array, utilizando break.
 */
public class Break4 {
    
    public boolean buscarNegativo(int[] array){
        boolean resultado = false;
        for (int i : array) {
            if(i<0){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
}
