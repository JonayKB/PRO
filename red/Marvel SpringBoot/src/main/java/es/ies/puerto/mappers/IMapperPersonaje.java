package es.ies.puerto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;

@Mapper(uses = { IMapperAlias.class, IMapperEquipamiento.class, IMapperPoder.class })
public interface IMapperPersonaje {
    IMapperPersonaje INSTANCE = Mappers.getMapper(IMapperPersonaje.class);

    Personaje personajeDTOTOPersonaje(PersonajeDTO personajeDTO);

    PersonajeDTO personajeTOPersonajeDTO(Personaje personaje);

}
