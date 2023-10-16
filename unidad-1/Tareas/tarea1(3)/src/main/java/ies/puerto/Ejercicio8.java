package ies.puerto;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero ocho
 */
public class Ejercicio8 {
    /**
     * Descripcion del algoritmo
     * 8. Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.
     */ 
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Incluya el rango: ");
        int suma=0,entrada = input.nextInt();
            for(int numero = 1 ; numero<=entrada ; numero++ ){

                for(int i=1 ; i<=numero/2; i++){
                    if(numero%i == 0){
                        suma+= i;
                    }
                }

                if(suma==numero){
                    System.out.println(numero+" es un número perfecto");
                }
                suma=0;
    
        }
    }
}