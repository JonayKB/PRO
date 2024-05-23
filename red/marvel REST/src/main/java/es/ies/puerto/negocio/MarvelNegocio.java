package es.ies.puerto.negocio;

import java.util.List;

import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.mappers.IMapperPersonaje;
import es.ies.puerto.modelo.db.Db;

public class MarvelNegocio {
    Db db;
    public MarvelNegocio(){
        db = new Db();
    }

    public PersonajeDTO obtenerPersonaje(PersonajeDTO personajeDTO){
        return IMapperPersonaje.INSTANCE.personajeTOPersonajeDTO(db.obtenerPersonaje(IMapperPersonaje.INSTANCE.personajeDTOTOPersonaje(personajeDTO)));
    }
}
