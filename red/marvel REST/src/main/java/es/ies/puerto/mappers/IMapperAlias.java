package es.ies.puerto.mappers;

import javax.ws.rs.core.Context;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Personaje;
@Mapper
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);
    @Mapping(source = "aliasDTO.id",target = "id")
    @Mapping(source = "personajeDTO",target = "personaje")
    Alias aliasDTOTOAlias(AliasDTO aliasDTO,@Context PersonajeDTO personajeDTO);

    AliasDTO aliasTOAliasDTO(Alias alias);

}
