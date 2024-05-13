package es.ies.puerto.DTO;

import java.util.Set;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;

public class PersonajeDTO {
    String id;
    String nombre;
    String genero;
    AliasDTO alias;
    Set<PoderDTO> poderes;
    Set<EquipamientoDTO> equipamientos;



    public PersonajeDTO() {
    }

    public PersonajeDTO(String id, String nombre, String genero, AliasDTO alias, Set<PoderDTO> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.poderes = poderes;
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

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public AliasDTO getAlias() {
        return this.alias;
    }

    public void setAlias(AliasDTO alias) {
        this.alias = alias;
    }

    public Set<PoderDTO> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<PoderDTO> poderes) {
        this.poderes = poderes;
    }

}
