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

    /**
     * Función que alamacena los números en un array
     * @param numero1 valor que introducimos para ser almacenado
     * @param numero2 valor que introducimos para ser almacenado
     * @param numero3 valor que introducimos para ser almacenado
     * @param numero4 valor que introducimos para ser almacenado
     * @param numero5 valor que introducimos para ser almacenado
     * @return arrayList que incluye estos valores
     */
    public ArrayList<Integer> pedirYMostrarValores (int numero1, int numero2, int numero3, int numero4, int numero5){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(numero1);
        numeros.add(numero2);
        numeros.add(numero3);
        numeros.add(numero4);
        numeros.add(numero5);

        return numeros;
    }
    /**
     * Función que realiza la suma entre todos los valores del array
     * @param numeros lista que hemos almacenado anteriormente
     * @return resultado de la suma
     */
    public int calcularSuma (ArrayList<Integer> numeros){
        int suma = 0;
        for (int i=0; i<numeros.size();i++) {
            suma +=  numeros.get(i);
        }
        return suma;
    }

    /**
     * Función que ordena el array en orden creciente
     * @param numeros array que introducimos
     * @return el array pero ordenado
     */
    public ArrayList<Integer> ordenarCreciente(ArrayList<Integer> numeros){
        numeros.sort(Comparator.naturalOrder());

        return numeros;
    }
    /**
     * Función que ordena el array en orden decreciente
     * @param numeros array que introducimos
     * @return el array pero ordenado
     */
    public ArrayList<Integer> ordenarDecreciente(ArrayList<Integer> numeros){
        numeros.sort(Comparator.reverseOrder());

        return numeros;
    }

}
