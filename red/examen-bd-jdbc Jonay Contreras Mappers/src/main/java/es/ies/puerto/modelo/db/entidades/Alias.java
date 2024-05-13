package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Alias")
public class Alias implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String descripcion;
    @OneToOne(mappedBy = "alias")
    Personaje personaje;

    public Alias() {}

    public Alias(String id) {
        this.id = id;
    }


    public Alias(String id, String descripcion, Personaje personaje) {
        this.id = id;
        this.descripcion = descripcion;
        this.personaje = personaje;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Personaje getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alias)) {
            return false;
        }
        Alias alias = (Alias) o;
        return Objects.equals(id, alias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
