package ies.puerto;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero nueve
 */
public class Ejercicio10 {
    /**
     * Descripcion del algoritmo
     * 10. Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int valor,i=1,suma=0;

        System.out.println("Introduza el numero");
        valor = input.nextInt();
        do {
            if(i%2==0){
                suma += i;



            }
            i++;
        }while(i<valor);


        System.out.println(suma);
    }
}