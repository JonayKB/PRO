package es.ies.puerto.DTO;

import es.ies.puerto.modelo.db.entidades.Personaje;

public class AliasDTO {
    String id;
    String descripcion;
    PersonajeDTO personaje;


    public AliasDTO() {
    }

    public AliasDTO(String id, String descripcion, PersonajeDTO personaje) {
        this.id = id;
        this.descripcion = descripcion;
        this.personaje = personaje;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PersonajeDTO getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(PersonajeDTO personaje) {
        this.personaje = personaje;
    }

}
