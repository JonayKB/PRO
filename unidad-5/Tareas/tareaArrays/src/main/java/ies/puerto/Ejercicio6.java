package ies.puerto;
/**
 * Dada una matriz cuadrada, encuentra su transpuesta.
 * @author JonayKB
 */
public class Ejercicio6 {
    /**
     * Función para calcular la matriz traspuesta
     * @param matriz matriz que introducimos
     * @return matriz traspuesta
     */
    public int[][] matrizTraspuesta(int[][] matriz){
        int [][] resultado = new int[matriz.length][matriz.length];

        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                resultado[i][j] = matriz[j][i];
            }
        }
        return resultado;
    }
}
