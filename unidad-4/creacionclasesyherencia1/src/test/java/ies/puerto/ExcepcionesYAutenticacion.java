package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcepcionesYAutenticacion {
    static Persona persona;


    @Test
    public void autenticacionTestERROR(){
        persona = new Persona(20, "Roberto", "3123123123213J");
        Assertions.assertTrue(persona.dniError);
    }
    @Test
    public void autenticacionTestOK(){
        persona = new Persona(20, "Roberto", "12345678A");
        Assertions.assertFalse(persona.dniError);
    }
    //Se que no es correcto pero desconozco la manera de hacerlo(me refiero a saber si da una exception)
}
