package ies.puerto.excepciones;

public class ValidationException extends Exception{
    public ValidationException(String mensaje){
        super(mensaje);
    }
}
