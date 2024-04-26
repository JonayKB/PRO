package es.ies.puerto;

public class Ejercicio6 {
    public int potencia(int n, int potencia){
        if (potencia ==0) {
            return 1;
        }
        if (potencia ==1) {
            return n;
        }
        return potencia(n,potencia-1)*n;
    }
}
