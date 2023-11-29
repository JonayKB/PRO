package ies.puerto;
/**
 * Crea una excepción personalizada llamada NombreInvalidoException que se lance cuando un método reciba un nombre nulo o vacío como argumento. 
 * Implementa una clase que contenga un método que acepte un nombre y lance esta excepción si es inválido.
 */
public class Ejercicio10 {
    public static void main(String[] args) throws NombreInvalidoException{
        String nombre = null;

    if(nombre==null){
        throw new NombreInvalidoException("El "+nombre+" es invalido");
    }
}

    }
    
