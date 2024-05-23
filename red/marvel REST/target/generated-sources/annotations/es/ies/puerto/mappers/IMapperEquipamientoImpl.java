package es.ies.puerto.mappers;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T21:08:27+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.20.1 (Ubuntu)"
)
public class IMapperEquipamientoImpl implements IMapperEquipamiento {

    @Override
    public Equipamiento equipamientoDTOTOEquipamiento(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO) {
        if ( equipamientoDTO == null && personajeDTO == null ) {
            return null;
        }

        Equipamiento equipamiento = new Equipamiento();

        if ( equipamientoDTO != null ) {
            equipamiento.setId( equipamientoDTO.getId() );
            equipamiento.setNombre( equipamientoDTO.getNombre() );
            equipamiento.setDescripcion( equipamientoDTO.getDescripcion() );
        }
        equipamiento.setPersonaje( personajeDTOToPersonaje( personajeDTO ) );

        return equipamiento;
    }

    @Override
    public EquipamientoDTO equipamientoTOEquipamientoDTO(Equipamiento equipamiento) {
        if ( equipamiento == null ) {
            return null;
        }

        EquipamientoDTO equipamientoDTO = new EquipamientoDTO();

        equipamientoDTO.setId( equipamiento.getId() );
        equipamientoDTO.setNombre( equipamiento.getNombre() );
        equipamientoDTO.setDescripcion( equipamiento.getDescripcion() );

        return equipamientoDTO;
    }

    protected Alias aliasDTOToAlias(AliasDTO aliasDTO) {
        if ( aliasDTO == null ) {
            return null;
        }

        Alias alias = new Alias();

        alias.setId( aliasDTO.getId() );
        alias.setDescripcion( aliasDTO.getDescripcion() );

        return alias;
    }

    protected Equipamiento equipamientoDTOToEquipamiento(EquipamientoDTO equipamientoDTO) {
        if ( equipamientoDTO == null ) {
            return null;
        }

        Equipamiento equipamiento = new Equipamiento();

        equipamiento.setId( equipamientoDTO.getId() );
        equipamiento.setNombre( equipamientoDTO.getNombre() );
        equipamiento.setDescripcion( equipamientoDTO.getDescripcion() );

        return equipamiento;
    }

    protected Set<Equipamiento> equipamientoDTOSetToEquipamientoSet(Set<EquipamientoDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Equipamiento> set1 = new LinkedHashSet<Equipamiento>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( EquipamientoDTO equipamientoDTO : set ) {
            set1.add( equipamientoDTOToEquipamiento( equipamientoDTO ) );
        }

        return set1;
    }

    protected Poder poderDTOToPoder(PoderDTO poderDTO) {
        if ( poderDTO == null ) {
            return null;
        }

        Poder poder = new Poder();

        poder.setId( poderDTO.getId() );
        poder.setNombre( poderDTO.getNombre() );

        return poder;
    }

    protected Set<Poder> poderDTOSetToPoderSet(Set<PoderDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Poder> set1 = new LinkedHashSet<Poder>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PoderDTO poderDTO : set ) {
            set1.add( poderDTOToPoder( poderDTO ) );
        }

        return set1;
    }

    protected Personaje personajeDTOToPersonaje(PersonajeDTO personajeDTO) {
        if ( personajeDTO == null ) {
            return null;
        }

        Personaje personaje = new Personaje();

        personaje.setId( personajeDTO.getId() );
        personaje.setNombre( personajeDTO.getNombre() );
        personaje.setGenero( personajeDTO.getGenero() );
        personaje.setAlias( aliasDTOToAlias( personajeDTO.getAlias() ) );
        personaje.setEquipamientos( equipamientoDTOSetToEquipamientoSet( personajeDTO.getEquipamientos() ) );
        personaje.setPoderes( poderDTOSetToPoderSet( personajeDTO.getPoderes() ) );

        return personaje;
    }
}
