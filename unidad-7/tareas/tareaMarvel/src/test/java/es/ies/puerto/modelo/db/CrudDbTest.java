package es.ies.puerto.modelo.db;

import java.util.Arrays;
import java.util.HashSet;
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
    public void beforeEach(){
        try {
            crudDb = new CrudDb();
            personajeAgregarEliminar = new Personaje(10);  
        } catch (UsuarioException e) {
            Assertions.fail();
        }
        
    }
    @Test
    public void obtenerPersonajeTest(){
        try {
            Personaje personajeObtener = new Personaje(1);
            personajeObtener = crudDb.obtenerPersonaje(personajeObtener);
            Assertions.assertEquals("Iron Man", personajeObtener.getNombre());
            Assertions.assertEquals("Tony Stark", personajeObtener.getAlias());
            Assertions.assertEquals("Masculino", personajeObtener.getGenero());
            Assertions.assertEquals(new HashSet<String>(Arrays.asList("Armadura tecnológica avanzada", "Rayos láser", "Vuelo")), personajeObtener.getPoderes());
        } catch (UsuarioException e) {
            Assertions.fail();
        }

    }
    @Test
    public void obtenerPersonajesTest(){
        try {
            Set<Personaje> personajes = crudDb.obtenerPersonajes();
            Assertions.assertEquals(2, personajes.size());
        } catch (UsuarioException e) {
            Assertions.fail();
        }
        
    }
    @Test
    public void agregarEliminarPersonajeTest(){
        try {
            Set<Personaje> personajesInicial = crudDb.obtenerPersonajes();

            crudDb.agregarPersonaje(personajeAgregarEliminar);
            Personaje personajeObtenido = crudDb.obtenerPersonaje(personajeAgregarEliminar);
            Assertions.assertEquals(personajeAgregarEliminar, personajeObtenido);
            crudDb.eliminarPersonaje(personajeAgregarEliminar);

            Set<Personaje> personajesFinal = crudDb.obtenerPersonajes();
            
            Assertions.assertEquals(personajesInicial.size(), personajesFinal.size());
        } catch (UsuarioException e) {
            Assertions.fail();
        }
    }
    @Test
    public void agregarEliminarPoderTest(){
        try {
            Personaje personajeAgregarEliminarPoder = new Personaje(20);
            crudDb.agregarPoder(personajeAgregarEliminarPoder, "poderTest");
            Assertions.assertNotNull(crudDb.obtenerPoderes(personajeAgregarEliminarPoder.getId()));
            crudDb.eliminarPoder("poderTest");
            Assertions.assertEquals(new HashSet<>(),crudDb.obtenerPoderes(personajeAgregarEliminarPoder.getId()));
        } catch (UsuarioException e) {
            Assertions.fail();
        }
    }
    @Test
    public void actualizarPersonajeTest(){
        Personaje personajeActualizar= new Personaje(20);
        String aliasUpdate = "AliasUpdate";
        String generoUpdate = "GeneroUpdate";
        String nombreUpdate = "NombreUpdate";
        Set<String> poderesUpdate = new HashSet<>(Arrays.asList("PoderTest1","PoderTest2"));
        try {
            crudDb.agregarPersonaje(personajeActualizar);
            personajeActualizar.setAlias(aliasUpdate);
            personajeActualizar.setGenero(generoUpdate);
            personajeActualizar.setNombre(nombreUpdate);
            personajeActualizar.setPoderes(poderesUpdate);
            crudDb.modificarPersonaje(personajeActualizar);
            personajeActualizar = crudDb.obtenerPersonaje(personajeActualizar);
            Assertions.assertEquals(aliasUpdate, personajeActualizar.getAlias());
            Assertions.assertEquals(generoUpdate, personajeActualizar.getGenero());
            Assertions.assertEquals(nombreUpdate, personajeActualizar.getNombre());
            Assertions.assertEquals(poderesUpdate, personajeActualizar.getPoderes());
        } catch (UsuarioException e) {
            Assertions.fail();
        }finally{
            try {
            crudDb.eliminarPersonaje(personajeActualizar);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
