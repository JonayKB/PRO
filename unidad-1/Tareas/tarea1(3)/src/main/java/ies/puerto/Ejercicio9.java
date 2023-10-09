package ies.puerto;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero nueve
 */
public class Ejercicio9 {
    /**
     * Descripcion del algoritmo
     * 9. Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int valor;

        System.out.println("Introduza el numero");
        valor = input.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(valor*i);
        }
    }
}