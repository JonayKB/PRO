package es.ies.puerto.mappers;


import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Personaje;

@Mapper(uses =  IMapperPersonaje.class)
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);

    @Mapping(source = "aliasDTO.id", target = "id")
    @Mapping( source = "personajeDTO", target = "personaje")
    Alias aliasDTOTOAlias(AliasDTO aliasDTO, PersonajeDTO personajeDTO);
    
    AliasDTO aliasTOAliasDTO(Alias alias);

}
