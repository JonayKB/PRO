package ies.puerto;

/**
 * @author JonayKB
 * Ejercicio numero seis
 */
    /**
     * Descripcion del algoritmo
     * 6. Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
     */ 

     

public class Ejercicio6 {
    /**
     * Función que realiza el calculo para contar los digitos de un número
     * @param contador
     * @return digitos que contiene un numero
     */

    public static int calcularDigitos(int numero){

        int digitos = 0;

        while(numero>0){
                numero= numero/10;
                digitos++;

            }
        return digitos;
    }




    /**
     * Función para calcular el exponente de un número
     * @param digitos Cantidad de digitos que tiene el número
     * @param numExponentado El número mientras y despues de multiplicarse con el mismo
     * @param inicial El número inicial suministrado por le usuario (sin modificaciones)
     * @return
     */
    public static int calcularExponente(int digitos, int numExponentado, int inicial){
        for (int contadorExponente = digitos; contadorExponente>0; contadorExponente--){
                numExponentado = numExponentado*(inicial%10);
                    
            }
            return numExponentado;
    }


    


    public static void main(String[] args) {

        int resultado=0,digitos=0,inicial,contador,numExponentado=1;
        for(int numero=1; numero<=1000;numero++){
            inicial = numero;
            resultado=0;
            digitos=0;

            digitos = calcularDigitos(numero);

            contador = digitos;    

            while(contador>0){
                resultado += calcularExponente(digitos, numExponentado, inicial);

                inicial=inicial/10;
                contador--;
                numExponentado=1;
            }


            if(numero==resultado){
            System.out.println("Es un número Armstrong "+resultado);
        
            }
        }
    }
}