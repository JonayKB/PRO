package es.ies.puerto.modelo.impl;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Alias")
public class Alias implements Serializable{

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @JoinColumn(name = "personaje_id")
    @OneToOne()
    Personaje personaje;
    @Column(name = "alias")
    String alias;


    public Alias(Integer id, Personaje personaje, String alias) {
        this.id = id;
        this.personaje = personaje;
        this.alias = alias;
    }

    public Alias() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Personaje getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", personaje='" + personaje.getId() + "'" +
            ", alias='" + alias + "'" +
            "}";
    }


    

}
