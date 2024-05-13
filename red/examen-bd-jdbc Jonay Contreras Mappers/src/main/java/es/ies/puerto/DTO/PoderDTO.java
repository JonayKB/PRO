package es.ies.puerto.DTO;

import java.util.Set;

import es.ies.puerto.modelo.db.entidades.Personaje;

public class PoderDTO {
    String id;
    String nombre;
    Set<PersonajeDTO> personajes;


    public PoderDTO() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String idK) {
        this.id = idK;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<PersonajeDTO> getPersonajes() {
        return this.personajes;
    }

    public void setPersonajes(Set<PersonajeDTO> personajes) {
        this.personajes = personajes;
    }

}
