package es.ies.puerto.modelo.ficheros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.ficheros.impl.Xml;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.PoderContainer;

public class XmlTest {
    private static final String NOMBRE = "Nombre";
    private static final String ALIAS = "Alias";
    private static final String GENERO = "Genero";

    Xml xml;
    List<Personaje> personajes;
    Personaje personajeEscribir;
    List<Personaje> personajesEscribir;
    @BeforeEach
    public void beforeEach(){
        xml = new Xml();
        personajes = xml.leer();
        List<String> poderes = Arrays.asList("Poder1","Poder2","Poder3");
        personajeEscribir = new Personaje(NOMBRE, ALIAS, GENERO, poderes);
        personajesEscribir = new ArrayList<>();
        personajesEscribir.add(personajeEscribir);
        xml.escribir(personajesEscribir);
    }
    @AfterEach
    public void afterEach(){
        xml.escribir(personajes);
    }
    @Test
    public void XmlNotNullTest(){
        Assertions.assertNotNull(xml);
    }
    @Test
    public void XmlLeerEscribirTest(){
        Assertions.assertEquals(personajesEscribir.toString(),xml.leer().toString());
    }
}
