package es.ies.puerto.DTO;

import java.util.Objects;

import es.ies.puerto.modelo.db.entidades.Personaje;

public class AliasDTO {
    String id;
    String descripcion;


    public AliasDTO() {
    }

    public AliasDTO(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AliasDTO)) {
            return false;
        }
        AliasDTO aliasDTO = (AliasDTO) o;
        return Objects.equals(id, aliasDTO.id);
     }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
