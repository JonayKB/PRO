package es.ies.puerto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
@Mapper(uses = IMapperPersonaje.class)
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);
    Alias aliasDTOTOAlias(AliasDTO aliasDTO);

    AliasDTO aliasTOAliasDTO(Alias alias);

}
