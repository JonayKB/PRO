package ies.puerto;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Realiza un programa que contenga los suficientes métodos para: 
 * pedir 5 números 
 * mostrar los 5 números 
 * muestra la suma 
 * y los muestra en orden creciente 
 * y en orden decreciente.
 */
public class Ejercicio3 {


    public ArrayList<Integer> pedirYMostrarValores (int numero1, int numero2, int numero3, int numero4, int numero5){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(numero1);
        numeros.add(numero2);
        numeros.add(numero3);
        numeros.add(numero4);
        numeros.add(numero5);
        System.out.println(numeros.toString());

        return numeros;
    }
    public int calcularSuma (ArrayList<Integer> numeros){
        int suma = 0;
        for (Integer integer : numeros) {
            suma =+ integer;
        }
        return suma;
    }
    public ArrayList<Integer> ordenarCreciente(ArrayList<Integer> numeros){
        numeros.sort(Comparator.naturalOrder());

        return numeros;
    }
    public ArrayList<Integer> ordenarDecreciente(ArrayList<Integer> numeros){
        numeros.sort(Comparator.reverseOrder());

        return numeros;
    }

}
