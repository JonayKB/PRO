package es.ies.puerto.modelo.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import es.ies.puerto.modelo.db.entidades.Personaje;

public class Db {
    EntityManagerFactory emf;
    EntityManager em;
    public Db(){
        emf = Persistence.createEntityManagerFactory("sqlite");
        em = emf.createEntityManager();
    }

    public void agregarPersonaje(Personaje personaje){
        em.getTransaction().begin();
        em.persist(personaje);
        em.getTransaction().commit();
    }

    public Personaje obtenerPersonaje(Personaje personaje){
        em.getTransaction().begin();
        Personaje personajeObtenido = em.find(Personaje.class, personaje.getId());
        em.getTransaction().commit();
        return personajeObtenido;
    }

    public List<Personaje> obtenerPersonajes(){
        em.getTransaction().begin();
        List<Personaje> personajesObtenidos = em.createQuery("SELECT p Personaje AS p").getResultList();
        em.getTransaction().commit();
        return personajesObtenidos;
    }

    public void eliminarPersonaje(Personaje personaje){
        em.getTransaction().begin();
        em.remove(em.contains(personaje) ? personaje : em.merge(personaje));
        em.getTransaction().commit();
    }
}
