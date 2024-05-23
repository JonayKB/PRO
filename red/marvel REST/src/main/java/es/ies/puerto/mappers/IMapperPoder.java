package es.ies.puerto.mappers;

import java.util.Set;

import javax.ws.rs.core.Context;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;

@Mapper
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper(IMapperPoder.class);
    @Mapping(source = "personajes", target = "personaje")
    Poder poderDTOTOpoder(PoderDTO poderDTO,@Context Set<PersonajeDTO> personajes);
    
    PoderDTO poderTOpoderDTO(Poder poder);

}
