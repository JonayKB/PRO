import java.util.Scanner;
/**
 * @author JonayKB
 * Ejercio numero dos

 * Descripcion del algoritmo
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
            if (valorA == valorB && valorA == valorC){                  //Si todos son iguales
                System.out.println("Escriba numeros distintos");
            }
            else {
                if(valorA == valorB || valorB == valorC){               //Si los primeros son iguales
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