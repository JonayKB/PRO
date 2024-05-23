package es.ies.puerto.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class IMapperPersonajeTest extends MapperUtils{
    @Test
    public void personajeDTOTOPersonajeTest(){
        Personaje personajeObtenido = IMapperPersonaje.INSTANCE.personajeDTOTOPersonaje(personajeDTO);
        Assertions.assertEquals(personajeObtenido, personaje);
        Assertions.assertEquals(personajeObtenido.getNombre(), personaje.getNombre());
        Assertions.assertEquals(personajeObtenido.getGenero(), personaje.getGenero());
        Assertions.assertEquals(personajeObtenido.getAlias(), personaje.getAlias());
        Assertions.assertEquals(personajeObtenido.getPoderes(), personaje.getPoderes());
        Assertions.assertEquals(personajeObtenido.getEquipamientos(), personaje.getEquipamientos());
    }

    @Test
    public void personajeTOPersonajeDTOTest(){
        PersonajeDTO personajeDTOObtenido = IMapperPersonaje.INSTANCE.personajeTOPersonajeDTO(personaje);
        Assertions.assertEquals(personajeDTOObtenido, personajeDTO);
        Assertions.assertEquals(personajeDTOObtenido.getNombre(), personajeDTO.getNombre());
        Assertions.assertEquals(personajeDTOObtenido.getGenero(), personajeDTO.getGenero());
        Assertions.assertEquals(personajeDTOObtenido.getAlias(), personajeDTO.getAlias());
        Assertions.assertEquals(personajeDTOObtenido.getPoderes(), personajeDTO.getPoderes());
        Assertions.assertEquals(personajeDTOObtenido.getEquipamientos(), personajeDTO.getEquipamientos());
    }
}
