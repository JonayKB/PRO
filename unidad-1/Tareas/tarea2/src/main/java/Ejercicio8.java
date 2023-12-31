import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero ocho
 */
public class Ejercicio8 {
    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0
     * @param args
     */ 
        //Creamos el Scanner
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Declaramos variables
        int numero;
        float suma = 0;

        //Pedimos la cantidad de notas
        System.out.println("¿Cuantas notas va a introducir?: ");
        numero = input.nextInt();

        //For hasta que N sea 0
        for(int N = numero-1; N>=0; N--){
            System.out.println("Introduzca la nota "+(numero-N));
            suma+=input.nextFloat();
            
        }

        //Enseñamos resultado
        System.out.println("La media es: "+suma/numero);
    }
}