package es.ies.puerto.modelo.db;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Alias;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.Poder;


public class HibernateTest {
    CrudHibernate crudHibernate;
    @BeforeEach
    public void beforeEach(){
        crudHibernate = new CrudHibernate();
    }
    @Test
    public void agregarObtenerActualizarEliminarPersonajeTest(){
        Personaje personaje = new Personaje();
        Alias alias = new Alias();
        Poder poder = new Poder();

        alias.setPersonaje(personaje);
        alias.setAlias("AliasTest");

        //poder.setPersonaje(new HashSet<>(Arrays.asList(personaje)));
        poder.setPoder("PoderTest");

        personaje.setNombre("NombreTest");
        personaje.setAlias(alias);
        personaje.setGenero("GeneroTest");
        personaje.setPoderes(new HashSet<>(Arrays.asList(poder)));

        crudHibernate.agregarPersonaje(personaje);
        personaje.setNombre("nombreUpdate");
        crudHibernate.actualizarPersonaje(personaje);

        Personaje personajeObtener= crudHibernate.buscarPersonaje(personaje);

        crudHibernate.eliminarPersonaje(personaje);

        Assertions.assertEquals(personaje, personajeObtener);
        Assertions.assertEquals(personaje.getNombre(), personajeObtener.getNombre());
    }

    @Test
    public void obtenerPersonajes(){
        Assertions.assertEquals(2, crudHibernate.obtenerPersonajes().size());
    }

}
