package ies.puerto;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero siete
 */
public class Ejercicio7 {
    /**
     * Descripcion del algoritmo
     * 7. Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
     * El día a verificar se debe de pedir por teclado.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Escriba el número de la semana: ");
        int entrada = input.nextInt();

        switch(entrada){
            case 1:
            System.out.println("Lunes");
            break;

            case 2:
            System.out.println("Martes");
            break;

            case 3:
            System.out.println("Miércoles");
            break;

            case 4:
            System.out.println("Jueves");
            break;

            case 5:
            System.out.println("Viernes");
            break;

            case 6:
            System.out.println("Sábado");
            break;

            case 7:
            System.out.println("Domingo");
            break;

            default:
            System.out.println("El número"+entrada+" no existe como día de la semana ");

        }
    }
}