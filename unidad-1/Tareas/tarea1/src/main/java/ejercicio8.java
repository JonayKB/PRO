import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero ocho
 */
public class ejercicio8 {
    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0
     * @param args
     */ 

        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int N;
        float suma = 0;

        System.out.println("¿Cuantas notas va a introducir?: ");
        N = input.nextInt();
        int numero = N;
        for(N = N-1; N>=0; N--){
            System.out.println("Introduzca la nota "+(numero-N));
            suma+=input.nextFloat();
            
        }

        System.out.println("La media es: "+suma/numero);
    }
}