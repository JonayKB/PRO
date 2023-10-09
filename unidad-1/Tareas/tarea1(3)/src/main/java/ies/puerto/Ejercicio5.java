package ies.puerto;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero cinco
 */
public class Ejercicio5 {
    /**
     * Descripcion del algoritmo
     * 5. Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    static int n,valorAnterior=0,valor=1;
    public static void main(String[] args) {
    System.out.println("Escribe la posición: ");
    n = input.nextInt();


    for (int i = 0; i<n; i++){
        System.out.println(valor);
        //La escala de fibonnaci es el valor anterior mas el actual
        valor = valorAnterior + valor;
        valorAnterior= valor-valorAnterior;
    }

    
    
    }
}