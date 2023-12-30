package ies.puerto.bloque1;

import java.util.Scanner;

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