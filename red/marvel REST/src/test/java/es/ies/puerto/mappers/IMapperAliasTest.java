package es.ies.puerto.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;

public class IMapperAliasTest extends MapperUtils{
    @Test
    public void aliasDTOTOAliasTest(){
        Alias aliasObtenido = IMapperAlias.INSTANCE.aliasDTOTOAlias(aliasDTO);
        Assertions.assertEquals(aliasObtenido, alias);
        Assertions.assertEquals(aliasObtenido.getDescripcion(), alias.getDescripcion());
        //Assertions.assertEquals(aliasObtenido.getPersonaje(), alias.getPersonaje());
    }

    @Test
    public void aliasTOAliasDTOTest(){
        AliasDTO aliasDTOOBtenido = IMapperAlias.INSTANCE.aliasTOAliasDTO(alias);
        Assertions.assertEquals(aliasDTOOBtenido, aliasDTO);
        Assertions.assertEquals(aliasDTOOBtenido.getDescripcion(), aliasDTO.getDescripcion());
    }
}
