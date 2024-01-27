package ies.puerto.parteUno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TecladoOrdenado {
    static private ArrayList<String> arrayList= new ArrayList<>();
    static String entrada="";
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        añadirNombresYOrdenar();
        System.out.println(arrayList);
    }


    public static void añadirNombresYOrdenar(){
        do {
            System.out.println("Escriba siguiente nombre");
            String entrada = scanner.nextLine();
            if (!entrada.endsWith("!")) {
                arrayList.add(entrada);
            }
            else{
                break;
            }
            
        } while (true);//Esto es una basura, pero por alguna razon no me reconoce el !entrada.endsWith("!") aquí

        Collections.sort(arrayList);
    }

}
