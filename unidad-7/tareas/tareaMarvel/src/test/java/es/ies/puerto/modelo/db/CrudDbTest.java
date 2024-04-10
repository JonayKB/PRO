package es.ies.puerto.modelo.db;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Personaje;

public class CrudDbTest {
    CrudDb crudDb;
    Personaje personajeAgregarEliminar;
    @BeforeEach
    public void beforeEach()throws UsuarioException{
        crudDb = new CrudDb();
        personajeAgregarEliminar = new Personaje(10);
    }
    @Test
    public void obtenerPersonajesTest()throws UsuarioException{
        Set<Personaje> personajes = crudDb.obtenerPersonajes();
        Assertions.assertEquals(2, personajes.size());
    }
    @Test
    public void agregarEliminarObtenerPersonajeTest()throws UsuarioException{
        Set<Personaje> personajesInicial = crudDb.obtenerPersonajes();

        crudDb.agregarPersonaje(personajeAgregarEliminar);
        Personaje personajeObtenido = crudDb.obtenerPersonaje(personajeAgregarEliminar);
        Assertions.assertEquals(personajeAgregarEliminar, personajeObtenido);
        crudDb.eliminarPersonaje(personajeAgregarEliminar);

        Set<Personaje> personajesFinal = crudDb.obtenerPersonajes();
        
        Assertions.assertEquals(personajesInicial.size(), personajesFinal.size());
    }
}
