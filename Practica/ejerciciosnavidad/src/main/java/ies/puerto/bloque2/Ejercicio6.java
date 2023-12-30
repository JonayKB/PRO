package ies.puerto.bloque2;
import java.util.Scanner;
/**
 * Escribe un programa que pida al usuario dos números y luego muestre los dos números y su suma.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba los dos números que desea sumar");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }
}
