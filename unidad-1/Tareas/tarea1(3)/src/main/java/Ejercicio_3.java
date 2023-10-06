import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero tres
 */
public class Ejercicio_3 {
    /**
     * Descripcion del algoritmo
     * 3. Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    static int n,valorAnterior=0,valor=1;
    public static void main(String[] args) {
    System.out.println("Escribe la posición: ");
    n = input.nextInt();


    for (int i = 1; i<n; i++){
        
        //La escala de fibonnaci es el valor anterior mas el actual
        valor = valorAnterior + valor;
        valorAnterior= valor-valorAnterior;
    }

    System.out.println(valor);
    
    }
}