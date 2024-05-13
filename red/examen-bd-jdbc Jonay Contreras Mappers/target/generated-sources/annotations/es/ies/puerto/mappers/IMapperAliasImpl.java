package es.ies.puerto.mappers;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-13T18:12:07+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.9 (Private Build)"
)
public class IMapperAliasImpl implements IMapperAlias {

    @Override
    public Alias aliasDTOTOAlias(AliasDTO aliasDTO) {
        if ( aliasDTO == null ) {
            return null;
        }

        Alias alias = new Alias();

        alias.setDescripcion( aliasDTO.getDescripcion() );
        alias.setId( aliasDTO.getId() );

        return alias;
    }

    @Override
    public AliasDTO aliasTOAliasDTO(Alias alias) {
        if ( alias == null ) {
            return null;
        }

        AliasDTO aliasDTO = new AliasDTO();

        aliasDTO.setDescripcion( alias.getDescripcion() );
        aliasDTO.setId( alias.getId() );

        return aliasDTO;
    }
}
