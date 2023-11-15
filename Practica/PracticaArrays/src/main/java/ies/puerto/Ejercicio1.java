package ies.puerto;
/**
 * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10), y almacenadas en un array. 
 * A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor
 */

import java.util.Scanner;

public class Ejercicio1 {
    int[] array = new int[5];
    String resultado = "";
    
    Scanner input = new Scanner(System.in);

    public Ejercicio1(){}

    public Ejercicio1(int[] array){
        this.array = array;
    }

    public int[] almacenarVariables(){
        for(int i = 0; i<array.length; i++){
            array[i] = input.nextInt();
        }
        return array;
    }

    public String imprimir(){
        for(int i = 0; i<array.length;i++){
            resultado += array[i]+" ";
        }
        return resultado;
    }
}
