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
     */ 
    
    /**
     * Método que enseña el día que es
     * @param dia String que incluye el día
     */
    public static void enseñarDia(String dia){
        System.out.println(dia);
    } 
    static Scanner input = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        System.out.println("Escriba el número de la semana: ");
        int entrada = input.nextInt();

        switch(entrada){
            case 1:
            enseñarDia("Lunes");
            break;

            case 2:
            enseñarDia("Martes");
            break;

            case 3:
            enseñarDia("Miércoles");
            break;

            case 4:
            enseñarDia("Jueves");
            break;

            case 5:
            enseñarDia("Viernes");
            break;

            case 6:
            enseñarDia("Sábado");
            break;

            case 7:
            enseñarDia("Domingo");
            break;

            default:
            System.out.println("El número"+entrada+" no existe como día de la semana ");

        }
    }
}