package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws NumeroNegativoException {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserta un numeor mayor o inferiorar a 0: ");
        int numero = input.nextInt();
        if(isPositivo(numero)){
            System.out.println("El número "+numero+" es positivo");
        }
    }

    public static boolean isPositivo(int numero) throws NumeroNegativoException{
        if(numero<0){
            throw new NumeroNegativoException("El numero "+numero+" es negativo");
        }
        return true;
    }
}
