import java.util.ArrayList;

/**
 * @author JonayKB
 * Ejercicio numero dos
 */
public class ejercicio2 {
    /**
     * Descripcion del algoritmo
     * Un número perfecto es aquel que es igual a la suma de sus divisores propios (excluyendo él mismo). Por ejemplo, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3, y 1 + 2 + 3 = 6.
     * El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000).
     * @param args
     */ 


        static int suma;
    public static void main(String[] args) {
            //Cubrimos todos los numeros del 1 al 1000
            for(int i = 1 ; i<=1000 ; i++ ){
                //Buscamos los divisores
                for(int n=1 ; n<=i/2; n++){
                    if(i%n == 0){
                        suma+= n;
                    }
                }
                //Sumamos todos los divisores entre ellos
                if(suma==i){
                    System.out.println(i+" es un numero perfecto");
                }
                suma=0;

            }
    }
}