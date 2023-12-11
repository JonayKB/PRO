package ies.puerto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CorreoElectronico {
    private String correo;
    public CorreoElectronico(){}

/**
 * Constructor
 * @param correo del usuario
 */
    public CorreoElectronico(String correo)throws CorreoInvalidoException{
        this.correo = correo;
        validar();
   }
   
   public static void main(String[] args)throws CorreoInvalidoException {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Inserte su correo");
        CorreoElectronico correoElectronico = new CorreoElectronico(scanner.nextLine());
}

   /**
    * Función que verificar la validez del correo
    * @throws CorreoInvalidoException
    */
    public void validar() throws CorreoInvalidoException{
        String regex= "^[a-zA-Z-%$\"!?¿()&ñ]+@[a-zA-Z-%$\"!?¿()&ñ]+\\.\\w{2,3}$";
        Pattern pattern = Pattern.compile(regex);

        if (pattern.matches(regex, correo)) {
            System.out.println("El correo "+correo+" es correcto");
        }else{
            throw new CorreoInvalidoException("El correo "+correo+" es invalido");
        }
        
   }
}