package es.ies.puerto;

public class Ejercicio2 {
    int suma =0;
    public int sumaNaturales(int n){
        if (n<=0) {
            return 0;
        }
        suma = n + sumaNaturales(n-1);
        return suma;
    }
}
