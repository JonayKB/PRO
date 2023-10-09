package ies.puerto;
import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero cuatro
 */
public class Ejercicio4 {
    /**
     * Descripcion del algoritmo
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
     */ 
    static Scanner input = new Scanner(System.in);
    static int entrada,resto,resultado,contador;
    public static void main(String[] args) {
    System.out.println("Escribe el número");
    entrada = input.nextInt();
    contador=entrada;
    //Vamos a extraer el ultimo valor y añadilo a un nuevo numero
        while(contador>0){
            resto=contador%10;
            resultado = resultado*10 + resto;
            contador= contador/10;

        }
    
        if(resultado==entrada){
            System.out.println(entrada+" es palíndromo");
        }
        else{
            System.out.println(entrada+" no es palíndromo");
        }
    }
}

