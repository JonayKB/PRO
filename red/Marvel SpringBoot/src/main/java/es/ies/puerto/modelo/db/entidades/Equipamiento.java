package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "Equipamientos")
public class Equipamiento implements Serializable {
    @Id

    String id;
    String nombre;
    String descripcion;
    @ManyToOne
    Personaje personaje;

    public Equipamiento() {
    }

    public Equipamiento(String id) {
        this.id = id;
    }

    public Equipamiento(String id, String nombre, String descripcion, Personaje personaje) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personaje = personaje;
    }

    public Personaje getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Equipamiento)) {
            return false;
        }
        Equipamiento equipamiento = (Equipamiento) o;
        return Objects.equals(id, equipamiento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
