package ies.puerto;
/**
 * @author JonayKB
 * Ejercicio numero uno
 */
public class Ejercicio1 {
    /**
     * Descripcion del algoritmo
     * 1. Escribe un programa en Java que imprima el patrón siguiente:
     * 1 
     * 2 3 
     * 4 5 6 
     * 7 8 9 10 
     * @param args
     */ 


    public static void main(String[] args) {
        int numero = 1;
        int cantidad = 1;
        for(int fila = 0; fila <= 3; fila++){
            for(cantidad = 0 ; cantidad <= fila ; cantidad++){
                System.out.print(numero+" ");
                numero++;
            }
            System.out.println();
        }




        }
}