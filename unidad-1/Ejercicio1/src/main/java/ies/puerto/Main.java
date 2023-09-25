package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza el ejercicio-1 de la tarea.
 */
public class Main {
    public static void main(String[] args) {

        int valorA,valorB;
        Scanner input = new Scanner (System.in);

        //Bloque 2: Verifica si los valores son iguales
        do {
            //Bloque 1: Pedir valores por pantalla y los asigna
            System.out.println("Ingrese el valor de la variable A: ");
            valorA=input.nextInt();
            System.out.println("Valor de la variable A: "+valorA);

            System.out.println("Ingrese el valor de la variable B: ");
            valorB=input.nextInt();
            System.out.println("Valor de la variable A: "+valorB);
            if (valorA == valorB){
                System.out.println("Los valores son iguales");
            }
            else {
                continue;
            }
        }while(valorA == valorB);

        //Bloque 3: Verifica si A > B
         if (valorA > valorB) {
            System.out.println("El valor de A es mayor");
        }

        //Bloque 4: Muetras por pantalla el valor mayor
        else{
            System.out.println("El valor de B es mayor");
        }
    }
}