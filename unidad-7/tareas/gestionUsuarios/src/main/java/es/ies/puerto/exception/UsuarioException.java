package es.ies.puerto.exception;

public class UsuarioException extends Exception {
    public UsuarioException (String mensaje){
        super(mensaje);
    }
    public UsuarioException (String mensaje, Throwable tipo){
        super(mensaje,tipo);
    }
}
