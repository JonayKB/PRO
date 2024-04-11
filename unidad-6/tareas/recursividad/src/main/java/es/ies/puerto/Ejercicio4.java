package es.ies.puerto;

public class Ejercicio4 {
    public int fibonacciTradiciona(int n){
        int valor =1;
        int valorAnterior=0;
        int i =0;
        while (i<n-1) {
            valorAnterior= valor-valorAnterior;
            valor = valor+valorAnterior;
            i++;
        }
            
        return valorAnterior;
    }
    public int fibonacci(int n){
        if (n==0) {
            return 0;
        }
        return fibonacci(n-1) ;
    }
}
