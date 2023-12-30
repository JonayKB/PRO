package ies.puerto.bloque1;

import java.util.Scanner;
/**
 * Escribe un programa que muestre tu nombre, tu edad y tu hobby favorito en 
 * líneas separadas, similar a un perfil básico.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su hobby favorito");
        String hobby = scanner.nextLine();

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        
        scanner.close();
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nHobby: "+hobby);
    }
}