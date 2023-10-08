import java.util.Scanner;

/**
 * @author JonayKB
 * Ejercicio numero ocho
 */
public class Ejercicio8 {
    /**
     * Descripcion del algoritmo
     * 8. Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.
     * @param args
     */ 
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Incluya el rango: ");
        int suma=0,entrada = input.nextInt();
            for(int i = 1 ; i<=entrada ; i++ ){
                //Buscamos los divisores
                for(int n=1 ; n<=i/2; n++){
                    if(i%n == 0){
                        suma+= n;
                    }
                }

                if(suma==i){
                    System.out.println(i+" es un número perfecto");
                }
                suma=0;
    
        }
    }
}