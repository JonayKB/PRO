package es.ies.puerto.negocio;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.negocio.impl.Negocio;

public class NegocioTest {
    private static final String GENERO = "Genero";
    private static final String ALIAS = "Alias";
    private static final String NOMBRE = "Nombre";
    Negocio negocio;
    List<Personaje> personajes;
    Personaje personajeNuevo;
    List<String> poderes;
    @BeforeEach
    public void beforeEach(){
        negocio = new Negocio();
        personajes = negocio.getPersonas();
        poderes = Arrays.asList("poder1","poder2","poder3");
        personajeNuevo = new Personaje(NOMBRE, ALIAS, GENERO, poderes);
        negocio.agregarPersona(personajeNuevo);
    }
    @AfterEach
    public  void afterEach(){
        negocio.setPersonas(personajes);
    }

    @Test
    public void NegocioNotNull(){
        Assertions.assertNotNull(negocio);
    }
    @Test
    public void agregarPersona(){
        Assertions.assertEquals(negocio.obtenerPersonaje(ALIAS),personajeNuevo);
    }
    @Test
    public void actualizarPersona(){
        Personaje personajeActualizar = new Personaje("Nombre2", ALIAS, "Genero2", poderes);
        negocio.actualizarPersona(personajeActualizar);
        Assertions.assertNotEquals(negocio.obtenerPersonaje(ALIAS).getNombre(),personajeNuevo.getNombre());
        Assertions.assertEquals(negocio.obtenerPersonaje(ALIAS).getAlias(),personajeNuevo.getAlias());
        Assertions.assertNotEquals(negocio.obtenerPersonaje(ALIAS).getGenero(),personajeNuevo.getGenero());
        Assertions.assertEquals(negocio.obtenerPersonaje(ALIAS).getPoderes(),personajeNuevo.getPoderes());
    }
    @Test
    public void actualizarPersonaNoExiste(){
        Personaje personajeActualizar = new Personaje(NOMBRE, "Alias2", GENERO, poderes);
        
        Assertions.assertFalse(negocio.actualizarPersona(personajeActualizar));
    }
    @Test
    public void eliminarPersonaNoExiste(){
        Assertions.assertTrue(negocio.eliminarPersona("Alias2"));
    }
    @Test
    public void obtenerPersonajeNull(){
        Assertions.assertNull(negocio.obtenerPersonaje("Alias2"));

    }
    @Test
    public void eliminarPersona(){
        negocio.eliminarPersona(ALIAS);
        Assertions.assertFalse(negocio.obtenerPersonajes().contains(personajeNuevo));
    }
    @Test
    public void NegocioMostrarPersonajesTodosFormatosTest(){
        Assertions.assertTrue(negocio.mostrarPersonajesTodosFormatos().contains("Iron Man"));
    }
}
