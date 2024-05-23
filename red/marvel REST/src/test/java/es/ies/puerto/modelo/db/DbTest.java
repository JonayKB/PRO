package es.ies.puerto.modelo.db;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public class DbTest {
    static Db db;
    Alias alias;
    Personaje personaje;
    Poder poder;
    Equipamiento equipamiento;
    @BeforeAll
    public static void beforeAll(){
        db = new Db();
    }

    @BeforeEach
    public void beforeEach(){
        alias = new Alias("idAlias", "descripcion", null);
        personaje = new Personaje("idPersonaje", "nombrePersonaje", "generoPersonaje", null, null, null);
        poder = new Poder("idPoder", "nombrePoder", null);
        equipamiento = new Equipamiento("idEquipamiento", "nombreEquipamiento", "descripcionEquipamiento", null);

        personaje.setAlias(alias);
        personaje.setEquipamientos(new HashSet<>(Arrays.asList(equipamiento)));
        personaje.setPoderes(new HashSet<>(Arrays.asList(poder)));

        poder.setPersonaje(new HashSet<>(Arrays.asList(personaje)));

        alias.setPersonaje(personaje);

        equipamiento.setPersonaje(personaje);

        db.agregarPersonaje(personaje);
    }

    @Test
    public void obtenerPersonaje(){
        Assertions.assertEquals(personaje, db.obtenerPersonaje(personaje));
    }

    @AfterEach
    void afterEach(){
        db.eliminarPersonaje(personaje);
    }
}
