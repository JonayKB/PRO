package es.ies.puerto.excepcion;
public class UsuarioException extends Exception {

    public UsuarioException(String message, Throwable e) {
        super(message,e);
    }
    
}
