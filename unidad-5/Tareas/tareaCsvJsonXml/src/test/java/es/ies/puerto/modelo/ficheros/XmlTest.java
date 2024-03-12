package es.ies.puerto.modelo.ficheros;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.ficheros.impl.Xml;
import es.ies.puerto.modelo.impl.Personaje;

public class XmlTest {
    private static final String NOMBRE = "Nombre";
    private static final String ALIAS = "Alias";
    private static final String GENERO = "Genero";

    Xml xml;
    List<Personaje> personajes;
    Personaje personajeEscribir;
    @BeforeEach
    public void beforeEach(){
        xml = new Xml();
        personajes = xml.leer();
        List<String> poderes = Arrays.asList("poder1,poder2,poder3".split(Ficheros.SEPARADOR));
        personajeEscribir = new Personaje(NOMBRE, ALIAS, GENERO, poderes);
        List<Personaje> personajesEscribir = Arrays.asList(personajeEscribir);
        xml.eliminarEscribir(personajesEscribir);
    }
    @AfterEach
    public void afterEach(){
        xml.eliminarEscribir(personajes);
    }
    @Test
    public void XmlNotNull(){
        Assertions.assertNotNull(xml);
    }
    @Test
    public void XmlLeerEscribir(){
        Assertions.assertEquals("a",xml.leer().toString() );
    }
}
