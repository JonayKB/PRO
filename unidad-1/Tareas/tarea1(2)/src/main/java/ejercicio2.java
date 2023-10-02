
import java.util.ArrayList;

/**
 * @author JonayKB
 * Ejercicio numero ocho
 */
public class ejercicio2 {
    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0
     * @param args
     */ 


        static int suma;
    public static void main(String[] args) {
            //Cubrimos todos los numeros del 1 al 1000
            for(int i = 1 ; i<1000 ; i++ ){
                //Buscamos los divisores
                for(int n=1 ; n<=i/2; n++){
                    if(i%n == 0){
                        suma+= n;
                    }
                }
                //Sumamos todos los divisores entre ellos
                if(suma==i){
                    System.out.println(i+" es numero perfecto");
                }
                suma=0;

            }
    }
}