package es.ies.puerto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

@Mapper
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);
    Equipamiento equipamientoDTOTOEquipamiento(EquipamientoDTO equipamientoDTO);
    
    EquipamientoDTO equipamientoTOEquipamientoDTO(Equipamiento equipamiento);
}
