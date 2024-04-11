package es.ies.puerto;

public class Ejercicio6 {
    public int potencia(int n, int potencia){
        if (potencia <=0) {
            return n;
        }
        if (potencia%2!=0) {
            return potencia(n,potencia-1)*n;
        }
        n=n*n;
        return potencia(n,potencia-2);
    }
}
