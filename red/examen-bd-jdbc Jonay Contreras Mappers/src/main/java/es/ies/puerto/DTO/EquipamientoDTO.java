package es.ies.puerto.DTO;

import es.ies.puerto.modelo.db.entidades.Personaje;

public class EquipamientoDTO {
    String id;
    String nombre;
    String descripcion;
    PersonajeDTO personaje;


    public EquipamientoDTO() {
    }

    public EquipamientoDTO(String id, String nombre, String descripcion, PersonajeDTO personaje) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personaje = personaje;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
