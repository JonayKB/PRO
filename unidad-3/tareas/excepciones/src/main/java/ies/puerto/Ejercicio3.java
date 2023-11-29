package ies.puerto;

public class Ejercicio3 {
    

    public static void main(String[] args) {
        int[] array = new int[3];

        try {
            int a = array[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El array sale de numero");
        }
    }
}