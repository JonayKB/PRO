package es.ies.puerto.mappers;

import javax.ws.rs.core.Context;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

@Mapper
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);
    @Mapping(source = "equipamientoDTO.id",target = "id")
    @Mapping(source = "equipamientoDTO.nombre",target = "nombre")
    @Mapping(source = "personajeDTO",target = "personaje")
    Equipamiento equipamientoDTOTOEquipamiento(EquipamientoDTO equipamientoDTO,@Context PersonajeDTO personajeDTO);
    
    EquipamientoDTO equipamientoTOEquipamientoDTO(Equipamiento equipamiento);
}
