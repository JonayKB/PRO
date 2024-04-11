package es.ies.puerto;

public class Ejercicio5 {
    int resultado = 1;

    public int factorialTradicional(int numero){
        for (int i = 1; i <=numero; i++) {
            resultado *=i;
        }
        return resultado;
    }
    public int factorial(int numero){
        if (numero<=0) {
            return 1;
        }
        
        return numero * factorial(numero-1);
    }
}
