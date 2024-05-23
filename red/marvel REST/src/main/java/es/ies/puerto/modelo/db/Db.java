package es.ies.puerto.modelo.db;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.mappers.IMapperPersonaje;
import es.ies.puerto.mappers.IMapperPoder;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.db.interfaces.IGuardado;

public class Db implements IGuardado {
    EntityManagerFactory emf;
    EntityManager em;
    public Db(){
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            e.printStackTrace();
        }
        emf = Persistence.createEntityManagerFactory("sqlite");
        em = emf.createEntityManager();
    }

    public void agregarPersonaje(Personaje personaje){
        em.getTransaction().begin();
        em.persist(personaje);
        em.getTransaction().commit();
    }

    public void agregarPoder(Poder poder){
        em.getTransaction().begin();
        em.persist(poder);
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
    public Set<PersonajeDTO> obtenerPersonajesByPoderDTO(PoderDTO poderDTO){
        em.getTransaction().begin();
        List<Personaje> personajesObtenidos = em.createQuery("SELECT pe Personaje AS p JOIN Personajes_Poderes AS pp ON pp.personaje_id=p.id WHERE pp.poderes_id='"+poderDTO.getId()+"'").getResultList();
        em.getTransaction().commit();
        Set<PersonajeDTO> personajesDTOSet= new HashSet<>();
        for (Personaje personaje : personajesObtenidos) {
            personajesDTOSet.add(IMapperPersonaje.INSTANCE.personajeTOPersonajeDTO(personaje));
        }
        return personajesDTOSet;
    }

    public Poder obtenerPoder(Poder poder){
        em.getTransaction().begin();
        Poder poderObtenido = em.find(Poder.class, poder.getId());
        em.getTransaction().commit();
        return poderObtenido;
    }

    public List<Poder> obtenerPoderes(){
        em.getTransaction().begin();
        List<Poder> personajesObtenidos = em.createQuery("SELECT p Poder AS p").getResultList();
        em.getTransaction().commit();
        return personajesObtenidos;
    }

    public void eliminarPersonaje(Personaje personaje){
        em.getTransaction().begin();
        em.remove(em.contains(personaje) ? personaje : em.merge(personaje));
        em.getTransaction().commit();
    }

    public void eliminarPoder(Poder poder){
        em.getTransaction().begin();
        em.remove(em.contains(poder) ? poder : em.merge(poder));
        em.getTransaction().commit();
    }
}
