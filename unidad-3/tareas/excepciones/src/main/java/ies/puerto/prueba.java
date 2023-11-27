package ies.puerto;

public class prueba {

    public static void main(String[] args) throws miException {
        boolean verdadero = true;

        metodoConCondicion(verdadero);
        
    }

    public static void metodoConCondicion(boolean verdadero)throws miException{
        
        if(verdadero){
            throw new miException(1,"MiException lanza un mensaje");
        }
    }
}
