package es.ies.puerto.modelo.db;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.mappers.IMapperPersonaje;
import es.ies.puerto.mappers.IMapperPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.db.interfaces.IGuardado;

public class Db implements IGuardado {
    EntityManagerFactory emf;
    EntityManager em;

    public Db() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            e.printStackTrace();
        }
        emf = Persistence.createEntityManagerFactory("sqlite");
        em = emf.createEntityManager();
    }

    public boolean agregarPersonaje(Personaje personaje) {
        em.getTransaction().begin();
        em.merge(personaje);
        em.getTransaction().commit();
        return true;
    }

    public boolean agregarPoder(Poder poder) {
        em.getTransaction().begin();
        em.merge(poder);
        em.getTransaction().commit();
        return true;
    }

    public boolean agregarAlias(Alias alias) {
        em.getTransaction().begin();
        em.merge(alias);
        em.getTransaction().commit();
        return true;
    }

    public boolean agregarEquipamiento(Equipamiento equipamiento) {
        em.getTransaction().begin();
        em.merge(equipamiento);
        em.getTransaction().commit();
        return true;
    }

    public Personaje obtenerPersonaje(Personaje personaje) {
        em.getTransaction().begin();
        Personaje personajeObtenido = em.find(Personaje.class, personaje.getId());
        em.getTransaction().commit();
        return personajeObtenido;
    }

    public List<Personaje> obtenerPersonajes() {
        em.getTransaction().begin();
        List<Personaje> personajesObtenidos = em.createQuery("SELECT p FROM Personaje AS p", Personaje.class)
                .getResultList();
        em.getTransaction().commit();
        return personajesObtenidos;
    }

    public Poder obtenerPoder(Poder poder) {
        em.getTransaction().begin();
        Poder poderObtenido = em.find(Poder.class, poder.getId());
        em.getTransaction().commit();
        return poderObtenido;
    }

    public List<Poder> obtenerPoderes() {
        em.getTransaction().begin();
        List<Poder> personajesObtenidos = em.createQuery("SELECT p FROM Poder AS p", Poder.class).getResultList();
        em.getTransaction().commit();
        return personajesObtenidos;
    }

    public Alias obtenerAlias(Alias alias) {
        em.getTransaction().begin();
        Alias aliasObtenido = em.find(Alias.class, alias.getId());
        em.getTransaction().commit();
        return aliasObtenido;
    }

    public List<Alias> obtenerAliasPlural() {
        em.getTransaction().begin();
        List<Alias> personajesObtenidos = em.createQuery("SELECT p FROM Alias AS p", Alias.class).getResultList();
        em.getTransaction().commit();
        return personajesObtenidos;
    }

    public Equipamiento obtenerEquipamiento(Equipamiento equipamiento) {
        em.getTransaction().begin();
        Equipamiento equipamientoObtenido = em.find(Equipamiento.class, equipamiento.getId());
        em.getTransaction().commit();
        return equipamientoObtenido;
    }

    public List<Equipamiento> obtenerEquipamientos() {
        em.getTransaction().begin();
        List<Equipamiento> personajesObtenidos = em.createQuery("SELECT p FROM Equipamiento AS p", Equipamiento.class)
                .getResultList();
        em.getTransaction().commit();
        return personajesObtenidos;
    }

    public boolean eliminarPersonaje(Personaje personaje) {
        em.getTransaction().begin();
        em.remove(em.contains(personaje) ? personaje : em.merge(personaje));
        em.getTransaction().commit();
        return true;

    }

    public boolean eliminarPoder(Poder poder) {
        em.getTransaction().begin();
        em.remove(em.contains(poder) ? poder : em.merge(poder));
        em.getTransaction().commit();
        return true;

    }


    public boolean eliminarAlias(Alias alias) {
        em.getTransaction().begin();
        em.remove(em.contains(alias) ? alias : em.merge(alias));
        em.getTransaction().commit();
        return true;
    }

    public boolean eliminarEquipamiento(Equipamiento equipamiento) {
        em.getTransaction().begin();
        em.remove(em.contains(equipamiento) ? equipamiento : em.merge(equipamiento));
        em.getTransaction().commit();
        return true;

    }

}
