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

        int entrada,numero=1,suma=0;

        System.out.println("Introduza el numero");
        entrada = input.nextInt();
        do {
            if(numero%2==0){
                suma += numero;
            }
            numero++;
        }while(numero<entrada);


        System.out.println(suma);
    }
}