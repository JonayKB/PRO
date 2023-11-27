package ies.puerto;

/**
 * Crea un programa que intente acceder a un método de un objeto que es null. 
 * Por ejemplo un String. Maneja la excepción NullPointerException.
 */
public class Ejercicio4 {
    

    public static void main(String[] args) {
        
        String vacio = null;
        try {
            int comprobar = vacio.length();
            } catch (NullPointerException e) {
            System.out.println("ESTA DEATH");
        }
    }
    
}