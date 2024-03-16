package es.ies.puerto.modelo.ficheros;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.ficheros.impl.Json;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.PoderContainer;

public class JsonTest {
    Json json;
    List<Personaje> personajes;
    Personaje personajeEscribir;
    List<Personaje> personajesEscribir;

    @BeforeEach
    public void beforeEach(){
        json = new Json();
        personajes = json.leer();
        personajeEscribir = new Personaje("nombre", "alias", "genero", Arrays.asList("Poder1","Poder2","Poder3"));
        personajesEscribir = Arrays.asList(personajeEscribir);
        json.escribir(personajesEscribir);
    }
    @AfterEach
    public void afterEach(){
        json.escribir(personajes);
    }
    @Test
    public void JsonNotNullTest(){
        Assertions.assertNotNull(json);
    }
    @Test
    public void JsonLeerEscribirTest(){
        Assertions.assertEquals(personajesEscribir,json.leer());
    }
    @Test
    public void JsonActualizarTest(){
        json.actualizar(personajes);
        Assertions.assertEquals(personajes, json.leer());
    }
    @Test
    public void JsonModificarTest(){
        json.modificar(personajes);
        Assertions.assertEquals(personajes, json.leer());
    }
    
}
