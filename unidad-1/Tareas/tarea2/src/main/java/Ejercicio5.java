import java.util.Scanner;
/**
 * @author JonayKB
 * Ejercicio numero cinco
 */
public class Ejercicio5 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si es el caso
     * @param args
     */
    //Creamos un escaner
    static Scanner input = new Scanner(System.in);

    //Declaramos dos variables que seran rellenadas por el usuario
    static int valorA,valorB;
    public static void main(String[ ] args){//VERSION DE DOS

        //Pedimos y añadimos a valorA y valorB lo que responda el usuario
        System.out.println("Incluya el primer valor: ");
        valorA=input.nextInt();
        System.out.println("Incluya el segundo valor: ");
        valorB=input.nextInt();

        if(valorA>valorB){ //Si el valorA es mayor que el valorB
            System.out.println("El valor "+valorA+" es mayor que el valor "+valorB); //Decimos que valorA es mayor que valorB
        }
        else if(valorB>valorA){//Si el valorB es mayor que el valorA
            System.out.println("El valor "+valorB+" es mayor que el valor "+valorA); //Decimos que valorB es mayor que valorA
        }
        else{//Si no los valores son iguales
            System.out.println("Los valores son iguales");
        }
    }
}