package es.ies.puerto;

public class Ejercicio8 {
    int suma=0;
    public int sumaDigitos(Integer numero){
        if (numero<=1) {
            return suma;
        }
        String numeroString = String.valueOf(numero);
        double primerDigito = Integer.valueOf(String.valueOf(numeroString.charAt(0)));
        suma+=primerDigito;
        numero = (int)(numero-(Integer.valueOf(String.valueOf(numeroString.charAt(0))))*(Math.pow(10, numeroString.length()-1)));
        return sumaDigitos(numero);
    }
}
