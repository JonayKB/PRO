import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author JonayKB
 * Ejercicio numero dos
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. 
 * El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. 
 * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
 * @param args
 */
public class Ejercicio2Array {
    //Creamos un escaner
    static Scanner input= new Scanner (System.in);


    //Declaramos variables
    static int valorA,valorB,valorC;

    static List<Integer> valores = new ArrayList<Integer>();

    //Funcion que pide valores
    static public int PedirYGuardar(List<Integer> lista){
        System.out.println("Inserte el valor: ");
        int valor=input.nextInt();
        lista.add(valor);
        return valor;
    }

    public static void main(String[] args) {
        //Pedimos los valores
        while(true){
            valorA=PedirYGuardar(valores);
            valorB=PedirYGuardar(valores);
            valorC=PedirYGuardar(valores);




            if((valorA == valorB) || (valorB == valorC) || (valorA == valorC)){               //Si los alguno de ellos son iguales
                    System.out.println("Todos los valores han de ser distintos");
            }
            else {                                                                            //Si todos son distintos
                break;
            }
        }
        //Cerramos el escaner
        input.close();


        //Comparamos e imprimimos el resultado por pantalla
        valores.sort(null);
        System.out.println("El menor valor es "+valores.get(0));
        System.out.println("El mayor valor es "+valores.get(valores.size()-1));
    }

}