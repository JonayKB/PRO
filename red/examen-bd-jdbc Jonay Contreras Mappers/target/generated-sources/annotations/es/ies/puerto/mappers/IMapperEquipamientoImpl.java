package es.ies.puerto.mappers;

import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-13T14:52:59+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.9 (Private Build)"
)
public class IMapperEquipamientoImpl implements IMapperEquipamiento {

    private final IMapperPersonaje iMapperPersonaje = IMapperPersonaje.INSTANCE;

    @Override
    public Equipamiento equipamientoDTOTOEquipamiento(EquipamientoDTO equipamientoDTO) {
        if ( equipamientoDTO == null ) {
            return null;
        }

        Equipamiento equipamiento = new Equipamiento();

        equipamiento.setDescripcion( equipamientoDTO.getDescripcion() );
        equipamiento.setId( equipamientoDTO.getId() );
        equipamiento.setNombre( equipamientoDTO.getNombre() );
        equipamiento.setPersonaje( iMapperPersonaje.personajeDTOTOPersonaje( equipamientoDTO.getPersonaje() ) );

        return equipamiento;
    }

    @Override
    public EquipamientoDTO equipamientoTOEquipamientoDTO(Equipamiento equipamiento) {
        if ( equipamiento == null ) {
            return null;
        }

        EquipamientoDTO equipamientoDTO = new EquipamientoDTO();

        equipamientoDTO.setDescripcion( equipamiento.getDescripcion() );
        equipamientoDTO.setId( equipamiento.getId() );
        equipamientoDTO.setNombre( equipamiento.getNombre() );
        equipamientoDTO.setPersonaje( iMapperPersonaje.personajeTOPersonajeDTO( equipamiento.getPersonaje() ) );

        return equipamientoDTO;
    }
}
