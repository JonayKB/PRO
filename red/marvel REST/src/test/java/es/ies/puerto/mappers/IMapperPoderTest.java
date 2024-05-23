package es.ies.puerto.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Poder;

public class IMapperPoderTest extends MapperUtils {
    @Test
    public void poderDTOTOPoderTest(){
        Poder poderObtenido = IMapperPoder.INSTANCE.poderDTOTOpoder(poderDTO);
        Assertions.assertEquals(poderObtenido, poder);
        Assertions.assertEquals(poderObtenido.getNombre(), poder.getNombre());
        //Assertions.assertEquals(poderObtenido.getPersonaje(), poder.getPersonaje());

    }

    @Test
    public void poderTOPoderDTOTest(){
        PoderDTO poderDTOObtenido = IMapperPoder.INSTANCE.poderTOpoderDTO(poder);
        Assertions.assertEquals(poderDTOObtenido, poderDTO);
        Assertions.assertEquals(poderDTOObtenido.getNombre(), poderDTO.getNombre());
    }
}
