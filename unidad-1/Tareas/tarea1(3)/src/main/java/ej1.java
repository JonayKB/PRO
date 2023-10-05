/**
 * @author JonayKB
 * Ejercicio numero uno
 */
public class ej1 {
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
        int numero=1;
        int cantidad=1;
        for(int i = 0; i<=3; i++){
            for(cantidad = 0 ; cantidad <= i ; cantidad++){
                System.out.print(numero+" ");
                numero++;
            }
            System.out.println();
        }




        }
}