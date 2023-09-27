import java.util.Scanner;
/**
 * @author JonayKB
 * Ejercicio numero dos

 * Descripcion del algoritmo
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
 * @param args
 */
public class Ejercicio2 {
    //Creamos un escaner
    static Scanner input= new Scanner (System.in);

    //Declaramos variables
    static int valorA,valorB,valorC;

    //Funcion que pide valores
    public static int PedirValor() {
        System.out.println("Ingrese el valor:");
        int valor= input.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        //Pedimos valores
        while(true){
            valorA = PedirValor();
            valorB = PedirValor();
            valorC = PedirValor();

            //Cerramos el escaner
            input.close();
            if (valorA == valorB && valorA == valorC){                  //Si todos son iguales
                System.out.println("Escriba numeros distintos");
            }
            else {
                if(valorA == valorB || valorB == valorC){               //Si los alguno de ellos son iguales
                    System.out.println("Todos los valores han de ser distintos");
                }
                else {                                                  //Si todos son distintos
                    break;
                }
            }

        }
        //Comparamos e imprimimos el resultado por pantalla

        if (valorA > valorB && valorA > valorC) {            //Si A es el mayor
            System.out.println("El valor "+valorA+" es el mayor");
        }
        else {
            if(valorB > valorA && valorB > valorC){          //Si B es el mayor
                System.out.println("El valor "+valorB+" es el mayor");
            }
            else{                                           //Si C es el mayor
                System.out.println("El valor "+valorC+" es el mayor");
            }
        }
    }
}