package ies.puerto.acceso;

import java.util.regex.Pattern;

import ies.puerto.excepciones.ValidationException;

public class Autenticacion {
    private String regex = "[0-9]{8}[A-Z]";
    private String dni;

    public Autenticacion() {}

    public Autenticacion(String dni) {
        this.dni = dni;
    }




    public void validar() throws ValidationException{
        Pattern pattern = Pattern.compile(regex);

        if (!pattern.matches(regex,dni)) {
            throw new ValidationException("El dni: "+dni+" no es correcto");
        }
    }
}
