package ies.puerto;
/**
 * Clase que tiene como objetivo realizar el calculo del factorial
 * @author JonayKB
 * 
 */
public class CalculoFactorial {
    
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Calculando el factorial de "+numero+", resultado: "+calcularFactorial(numero));
    }
/**
 * Método para calcular un factorial
 * @param numero Valor del que se realiza el factorial
 * @return Factorial del número dado
 */
public static int calcularFactorial(int numero){
    int resultado = 1;
    for (int i = 2 ; i<=numero ; i++ ){
        resultado *= i;
    }
    return resultado;
}
}