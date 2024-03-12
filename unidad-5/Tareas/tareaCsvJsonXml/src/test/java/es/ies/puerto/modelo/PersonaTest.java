package es.ies.puerto.modelo;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.impl.Personaje;

public class PersonaTest {
    private static final String PODERES = "poder1,poder2,poder3";
    private static final String GENERO = "genero";
    private static final String ALIAS = "alias";
    private static final String NOMBRE = "nombre";
    Personaje persona;
    @BeforeEach
    public void beforeEach(){
        persona = new Personaje(NOMBRE, ALIAS, GENERO, Arrays.asList(PODERES.split(Ficheros.SEPARADOR)));
    }
    @Test
    public void personaNotNull(){
        Assertions.assertNotNull(persona);
    }
    @Test
    public void personaToCsv(){
        String resultadoOk=NOMBRE+Ficheros.SEPARADOR+ALIAS+Ficheros.SEPARADOR+GENERO+Ficheros.SEPARADOR+PODERES;
        Assertions.assertEquals(resultadoOk, persona.toCsv());
    }
}
