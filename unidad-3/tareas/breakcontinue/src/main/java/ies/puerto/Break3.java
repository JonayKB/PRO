package ies.puerto;
/**
 * Escribe un programa que busque el número 7 en un array, utilizando break.
 */
public class Break3 {
    public boolean buscarEnArray(int[] array){
        boolean resultado = false;
        for (int buscador : array) {
           if (buscador == 7) {
                resultado = true;
                break;
           } 
        }
        return resultado;
    }
}
