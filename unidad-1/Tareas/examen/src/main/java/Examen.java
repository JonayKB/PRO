//Librerias de las listas
import java.util.ArrayList;
import java.util.Liscdt;
/**
 * @author JonayKB
 * Examen ETS

 * Descripcion del algoritmo
 * @param args
 */
public class Examen {

    public static void main(String[] args) {
        //Inicializamos las listas de divisores y el resultado (numerosPrimos)
        List divisores = new ArrayList<Integer>();
        List numerosPrimos = new ArrayList<Integer>();
        //Realizamos para cada uno de los numeros del 1 al 100
        for (int i=1; i<=100; i++){

            //Comprobamos de cada numero i, los numeros n, que llegan hasta la mitad del numero i (un numero no puede ser dividido por mas de su mitad)
            for (int n=1 ; n<=i/2 ; n++){
                //Comprobamos si el resto es cero, si lo es, es un divisor y lo añadimos a una lista
                if (i%n==0){
                    divisores.add(n);

                }

            }
            //Comprobamos si la lista es de 1(1), significa que es primo
            if (divisores.size()==1){
                numerosPrimos.add(i);
            }
            //Limpiamos la lista para continuar con el siguiente numero de i
            divisores.clear();
        }


        //Enseñamos los resultados
        System.out.println(numerosPrimos);

    }
}