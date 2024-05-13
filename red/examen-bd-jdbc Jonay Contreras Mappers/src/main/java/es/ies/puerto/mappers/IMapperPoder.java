package es.ies.puerto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;

@Mapper(uses = IMapperPersonaje.class)
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper(IMapperPoder.class);
    Poder poderDTOTOpoder(PoderDTO poderDTO);
    
    PoderDTO poderTOpoderDTO(Poder poder);

}
