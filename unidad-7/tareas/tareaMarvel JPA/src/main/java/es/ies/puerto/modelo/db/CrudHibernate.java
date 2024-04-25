package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.interfaces.ICrud;

public class CrudHibernate implements ICrud{
    EntityManagerFactory emf;

    public CrudHibernate() {
        emf = Persistence.createEntityManagerFactory("sqlite-jpa");
    }
    public void cerrarEntityManager(EntityManager em){
        if (em!=null) {
            em.close();
        }
    }
    public void actualizarPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(personaje);
        em.getTransaction().commit();
        cerrarEntityManager(em);
    }
    public void agregarPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(personaje);
        em.getTransaction().commit();
        cerrarEntityManager(em);
    }
    public void eliminarPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(personaje) ? personaje : em.merge(personaje));
        em.getTransaction().commit();
        cerrarEntityManager(em);
    }
    public Personaje obtenerPersonaje(Personaje personaje){
        EntityManager em = emf.createEntityManager();
        personaje = em.find(Personaje.class, personaje.getId());
        cerrarEntityManager(em);
        return personaje;
    }
    
    public Set<Personaje> obtenerPersonajes(){
        EntityManager em = emf.createEntityManager();
        List<Personaje> lista= (em.createQuery("SELECT p FROM Personaje as p").getResultList());
        cerrarEntityManager(em);
        Set<Personaje> resultado = new HashSet<>();
        for (Personaje personaje : lista) {
            resultado.add(personaje);
        }
        return resultado;
    }
}
