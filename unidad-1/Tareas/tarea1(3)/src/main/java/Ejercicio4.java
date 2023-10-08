import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero cuatro
 */
public class Ejercicio4 {
    /**
     * Descripcion del algoritmo
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    static int n,resto,resultado,contador;
    public static void main(String[] args) {
    System.out.println("Escribe el número");
    n = input.nextInt();
    contador=n;
    //Vamos a extraer el ultimo valor y añadilo a un nuevo numero
        while(contador>0){
            resto=contador%10;
            resultado = resultado*10 + resto;
            contador= contador/10;

        }
    
        if(resultado==n){
            System.out.println(n+" es palíndromo");
        }
        else{
            System.out.println(n+" no es palíndromo");
        }
    }
}