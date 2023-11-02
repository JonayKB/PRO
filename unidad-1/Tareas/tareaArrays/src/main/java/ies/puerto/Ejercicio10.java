package ies.puerto;
/**
 * Comprueba si una matriz es diagonal (todos los elementos fuera de la diagonal principal son cero).
 */
public class Ejercicio10 {
    /**
     * Función par confirmar que una matriz es diagonal
     * @param matriz matriz que introducimos
     * @return
     */
    public boolean comprobarDiagonal(int[][]matriz){
    boolean resultado= true;
    int j = 0;
        for (int[] fila : matriz) {
            for(int i = 0; i<fila.length; i++){
                
                if ((fila[i]!=0) && (i!=j)) {
                    resultado=false;     
                }

                
            }
            j++;
        }

        


    return resultado;
    }
}
