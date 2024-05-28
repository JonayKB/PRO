package es.ies.puerto.DTO;

import java.util.Set;

import es.ies.puerto.modelo.db.entidades.Personaje;
import java.util.Objects;

public class PoderDTO {
    String id;
    String nombre;

    public PoderDTO() {
    }

    public PoderDTO(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PoderDTO)) {
            return false;
        }
        PoderDTO poderDTO = (PoderDTO) o;
        return Objects.equals(id, poderDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
