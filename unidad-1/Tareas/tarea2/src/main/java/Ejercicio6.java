import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero seis
 */
public class Ejercicio6 {
    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no
     * @param args
     */

    //Escaner para pedir el numero
    static Scanner input= new Scanner(System.in);
    //Declaracion de variables
    static int numero;
    static ArrayList<Integer> divisores = new ArrayList<Integer>();
    public static void main(String[] args) {
        System.out.println("Introduzca el numero: ");
        numero= input.nextInt();

        //Comprobamos todos los numeros de la mitad del numero
        for(int i=1; i<=numero/2;i++){
            if(numero%i==0){
                divisores.add(i);
                
                //Evitamos comprobar mas numeros porque ya sabemos que no es primo
                if(divisores.size()>2){
                    System.out.println("break");
                    break;
                }
                
            }

        }   
        if(divisores.size()<=2){
            System.out.println(numero+" es primo");
        }
        else{
            System.out.println(numero+" no es primo");
        }
        System.out.println(divisores.toString());
    }
}