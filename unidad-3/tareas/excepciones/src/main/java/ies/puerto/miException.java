package ies.puerto;

public class miException extends Exception{
    private int codigoError;

    public miException(){}

    public miException(int codigo){
        this.codigoError = codigo;
    }

    public miException(String mensaje){
        super(mensaje);
        
    }
    
    public miException(int codigo, String mensaje){
        super(mensaje);
        this.codigoError = codigo;
        

    }

    
}
