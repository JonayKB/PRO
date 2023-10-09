package ies.puerto;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero dos
 */
public class Ejercicio2 {
    /**
     * Descripcion del algoritmo
     * 2. Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    static int valor1, valor2;
    public static void main(String[] args) {
        System.out.println("Introduzca el primer valor");
        valor1= input.nextInt();

        System.out.println("Introduzca el segundo valor");
        valor2= input.nextInt();

        
        if(valor1>valor2){
            for(int i = valor1/2; i>=0 ; i--  ){
                
                if((valor1%i==0)&&(valor2%i==0)){
                    System.out.println(i+" es el MCD de "+valor1+" y "+valor2);
                    break;
                }
            }
        }

        else if(valor2>valor1){
            
            for(int i = valor2/2; i>=0 ; i--  ){

                if((valor1%i==0)&&(valor2%i==0)){
                    System.out.println(i+" es el MCD de "+valor1+" y "+valor2);
                    break;
                }
            }
        }

        else{
            System.out.println("El MCM es "+valor1/2);
        }

    }
}