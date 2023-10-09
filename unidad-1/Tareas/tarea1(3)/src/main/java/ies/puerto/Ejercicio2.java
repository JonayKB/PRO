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
     */ 


    /**
     * Método que imprime y calcula el resultado
     * @param valorMayor El valor que sea mas alto
     * @param valorMenor El vlaor que sea menor
     */
    public static void calcularResultado(int valorMayor, int valorMenor){
        for(int numero = valorMayor/2; numero>=0 ; numero--  ){
            
            if((valorMayor%numero==0)&&(valorMenor%numero==0)){
                System.out.println("El número "+numero+" es el MCD de "+valorMayor+" y "+valorMenor);
                break;
            }
        }
    }
    
    static Scanner input = new Scanner(System.in);
    static int valor1, valor2;
    public static void main(String[] args) {
        System.out.println("Introduzca el primer valor");
        valor1= input.nextInt();

        System.out.println("Introduzca el segundo valor");
        valor2= input.nextInt();

        
        if(valor1>valor2){
            calcularResultado(valor1, valor2);
        }

        else if(valor2>valor1){
            calcularResultado(valor2, valor1);
        }

        else{
            System.out.println("El MCM es "+valor1/2);
        }

    }
}