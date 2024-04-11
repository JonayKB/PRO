package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
        int valor =1;
        int valorAnterior=0;
        int i =0;
        List<Integer> list= new ArrayList<>();
    public int fibonacciTradiciona(int n){
        
        while (i<n-1) {
            valorAnterior= valor-valorAnterior;
            valor = valor+valorAnterior;
            i++;
        }
            
        return valorAnterior;
    }
    public int fibonacci(int n){
        if (n==1) {
            return valorAnterior;
        }
            valorAnterior= valor-valorAnterior;
            valor = valor+valorAnterior;
        return fibonacci(n-1);
    }
}
