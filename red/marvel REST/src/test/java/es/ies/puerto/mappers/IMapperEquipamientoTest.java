package es.ies.puerto.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

public class IMapperEquipamientoTest extends MapperUtils {
    @Test
    public void equipamientoDTOTOEquipamientoTest() {
        Equipamiento equipamientoObtenido = IMapperEquipamiento.INSTANCE.equipamientoDTOTOEquipamiento(equipamientoDTO,
                personajeDTO);
        Assertions.assertEquals(equipamientoObtenido, equipamiento);
        Assertions.assertEquals(equipamientoObtenido.getNombre(), equipamiento.getNombre());
        Assertions.assertEquals(equipamientoObtenido.getDescripcion(), equipamiento.getDescripcion());
        Assertions.assertEquals(equipamientoObtenido.getPersonaje(), equipamiento.getPersonaje());

    }

    @Test
    public void equipamientoTOEquipamientoDTOTest() {
        EquipamientoDTO equipamientoDTOObtenido = IMapperEquipamiento.INSTANCE
                .equipamientoTOEquipamientoDTO(equipamiento);
        Assertions.assertEquals(equipamientoDTOObtenido, equipamientoDTO);
        Assertions.assertEquals(equipamientoDTOObtenido.getNombre(), equipamientoDTO.getNombre());
        Assertions.assertEquals(equipamientoDTOObtenido.getDescripcion(), equipamientoDTO.getDescripcion());
    }

}
