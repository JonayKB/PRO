package es.ies.puerto.modelo.impl;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;




@Entity
@Table(name = "Poderes")
public class Poder implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    String poder;
    @ManyToMany(mappedBy = "poderes",cascade = CascadeType.ALL)
    Set<Personaje> personaje;


    public Poder() {
    }

    public Poder(Integer id, String poder, Set<Personaje> personaje) {
        this.id = id;
        this.poder = poder;
        this.personaje = personaje;
    }

    public Set<Personaje> getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Set<Personaje> personaje) {
        this.personaje = personaje;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }





}
