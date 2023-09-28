import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author JonayKB
 * Ejercicio numero cinco VERSION EXTENSIBLE
 */
public class Ejercicio5Array {
    /**
     * Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si es el caso
     * @param args
     */
    //Creamos un escaner
    static Scanner input = new Scanner(System.in);

    //Declaramos variables
    static List<Integer> valores= new ArrayList<Integer>();

    //Funcion que pide un valor por pantalla y lo añade a una lista
    static public void PedirYGuardar(List<Integer> lista){
        System.out.println("Inserte el valor: ");
        int valor=input.nextInt();
        lista.add(valor);
    }
    public static void main(String[] args) { //VERSION EXPANSIBLE

        //Repetible para una cantidad indefinidad de valores (en este caso dos)
        PedirYGuardar(valores);
        PedirYGuardar(valores);
        valores.sort(null);
        for ( int i = 0 ; i<valores.size() ; i++){ //For dependiendo de la longitud de la lista
            
            if (i==valores.size()-1){// Si es el ultimo valor
                System.out.println(valores.get(i)); //Imprimimos el numero sin ">"
            }
            else{//Sino lo es
            System.out.printf(valores.get(i)+ " > ");//Imprimimos el numero mas el ">"
            }
        }
    }
}