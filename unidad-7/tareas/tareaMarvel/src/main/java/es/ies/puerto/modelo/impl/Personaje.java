package es.ies.puerto.modelo.impl;

import java.util.Set;
import java.util.Objects;

public class Personaje {
    private int id;
    private String nombre;
    private String alias;
    private String genero;
    private Set<String> poderes;


    public Personaje(int id, String nombre, String alias, String genero, Set<String> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }


    public Personaje(int id) {
        this.id=id;
    }


    public int getId() {
        return this.id;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<String> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Personaje)) {
            return false;
        }
        Personaje personaje = (Personaje) o;
        return id == personaje.id;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", alias='" + getAlias() + "'" +
            ", genero='" + getGenero() + "'" +
            ", poderes='" + getPoderes() + "'" +
            "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, alias, genero, poderes);
    }
    
}
