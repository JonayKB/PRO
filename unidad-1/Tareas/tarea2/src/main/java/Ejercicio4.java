import java.util.Scanner;
/**
 * @author JonayKB
 * Ejercicio numero cuatro
 */
public class Ejercicio4 {

    /**
     * Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es par o impar
     * @param args
     */

    //Creamos el escaner para pedir las variables por la pantalla
    static Scanner input = new Scanner(System.in);
    
    static int valor;
    public static void main(String[] args) {
        System.out.println("Introduzca el numero: ");
        int valor = input.nextInt();
        //Comprobamos si el resto al ser dividido entre dos es cero
        if (valor%2==0){
            //Si es 0, imprimimos por pantalla que es par
            System.out.println(valor+" es par");
        }
        else{
            //Sino que es impar
            System.out.println(valor+" es impar");
        }


    }
}