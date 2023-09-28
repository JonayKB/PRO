import java.util.Scanner;
/**
 * @author JonayKB
 * Ejercicio numero dos
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. 
 * El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. 
 * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
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
        return input.nextInt();
    }

    public static void main(String[] args) {
        //Pedimos los valores
        while(true){
            valorA = PedirValor();
            valorB = PedirValor();
            valorC = PedirValor();



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
        if ((valorA > valorB) && (valorA > valorC)) {            //Si A es el mayor
            System.out.println("El valor "+valorA+" es el mayor");
            if (valorC < valorB){                           //Si C es menor que B
                System.out.println("El valor "+valorC+" es el menor");
            }
            else{                                          //Sino
                System.out.println("El valor "+valorB+" es el menor");
            }
        }
        else if((valorB > valorA) && (valorB > valorC)){         //Si B es el mayor
                System.out.println("El valor "+valorB+" es el mayor");
                if (valorC < valorA){                        //Si C es menor que A
                System.out.println("El valor "+valorC+" es el menor");
                }
                else{                                        //Sino
                System.out.println("El valor "+valorA+" es el menor");
                }
            }
            else{                                           //Si C es el mayor
                System.out.println("El valor "+valorC+" es el mayor");
                if (valorA < valorB){                       //Si A es menor que B
                System.out.println("El valor "+valorA+" es el menor");
            }
            else{                                           //Sino
                System.out.println("El valor "+valorB+" es el menor");
            }
            }
        }
    }