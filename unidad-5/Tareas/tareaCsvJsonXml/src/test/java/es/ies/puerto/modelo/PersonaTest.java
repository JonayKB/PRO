package es.ies.puerto.modelo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.PoderContainer;

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
    @Test
    public void getSetTest(){
        List<String> poderesUpdate = Arrays.asList("Poder4,Poder5,Poder6");
        String generoUpdate = "generoUpdate";
        String aliasUpdate = "aliasUpdate";
        String nombreUpdate = "nombreUpdate";
        persona.setPoderes(poderesUpdate);
        persona.setGenero(generoUpdate);
        persona.setAlias(aliasUpdate);
        persona.setNombre(nombreUpdate);
        Assertions.assertEquals(persona.getPoderes(), poderesUpdate);
        Assertions.assertEquals(persona.getGenero(), generoUpdate);
        Assertions.assertEquals(persona.getAlias(), aliasUpdate);
        Assertions.assertEquals(persona.getNombre(), nombreUpdate);
    }
    @Test
    public void hashCodeTest(){
        Assertions.assertEquals(Objects.hash(ALIAS), persona.hashCode());
    }
}
