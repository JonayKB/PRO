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
     */ 
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int entrada;

        System.out.println("Introduza el numero");
        entrada = input.nextInt();

        for(int multiplicador = 0; multiplicador<=10; multiplicador++){
            System.out.println(entrada+" * "+multiplicador+" = "+entrada*multiplicador);
        }
    }
}