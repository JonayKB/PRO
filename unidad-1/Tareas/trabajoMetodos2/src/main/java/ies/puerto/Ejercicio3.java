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

        for (int elemento : numeros){
            suma+= elemento;
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



/** 

    public int calcularMayor(int valorA, int valorB){
        int resultado = valorA;
        if (valorB>valorA){
            resultado = valorB;
        }
        return resultado;
    }
    public int calcularMenor(int valorA, int valorB){
        int resultado = valorA;
        if (valorB<valorA){
            resultado = valorB;
        }
        return resultado;
    }

    public int calcularMayor(int valorA, int valorB, int valorC){
        int resultado = calcularMayor(calcularMayor(valorA, valorB), valorC);
        return resultado;
    }
    public int calcularMenor(int valorA, int valorB, int valorC){
        int resultado = calcularMenor(calcularMenor(valorA, valorB), valorC);
        return resultado;
    }
    
    public int calcularMayor(int valorA, int valorB, int valorC, int valorD){
        int resultado = calcularMayor(calcularMayor(valorA, valorB, valorC), valorD);
        return resultado;
    }
    public int calcularMenor(int valorA, int valorB, int valorC, int valorD){
        int resultado = calcularMenor(calcularMenor(valorA, valorB, valorC), valorD);
        return resultado;
    }

    public int calcularMayor(int valorA, int valorB, int valorC, int valorD, int valorE){
        int resultado = calcularMayor(calcularMayor(valorA, valorB, valorC, valorD), valorE);
        return resultado;
    }
    public int calcularMenor(int valorA, int valorB, int valorC, int valorD, int valorE){
        int resultado = calcularMenor(calcularMenor(valorA, valorB, valorC, valorD), valorE);
        return resultado;
    }


    public int intermedio(int valorA, int valorB, int valorC){
        int mayor = calcularMayor(valorA, valorB, valorC);
        int menor = calcularMenor(valorA, valorB, valorC);
        int intermedio = (valorA+valorB+valorC)-menor-mayor;

        return intermedio;
    }
    public int mostrar4(int valorA, int valorB, int valorC, int valorD){

        int intermedio = intermedio(valorA, valorB, valorC);
        

        
    }
    



    
*/
}
