package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import es.ies.puerto.modelo.impl.Personaje;

public class CrudHibernate {
    EntityManagerFactory emf;

    public CrudHibernate() {
        emf = Persistence.createEntityManagerFactory("sqlite-jpa");
    }
    public void actualizarPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(personaje);
        em.getTransaction().commit();
    }
    public void agregarPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(personaje);
        em.getTransaction().commit();
    }
    public void eliminarPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(personaje) ? personaje : em.merge(personaje));
        em.getTransaction().commit();
    }
    public Personaje buscarPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        return em.find(Personaje.class, personaje.getId());
    }
      public List<Personaje> obtenerPersonajes(){
      EntityManager em = emf.createEntityManager();
        List<Personaje> lista= ((List<Personaje>)em.createQuery("SELECT p FROM personajes as p").getResultList());
        return lista;
    }
}
