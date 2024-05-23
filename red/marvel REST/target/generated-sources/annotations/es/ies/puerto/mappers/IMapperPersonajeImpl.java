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
public class IMapperPersonajeImpl implements IMapperPersonaje {

    private final IMapperAlias iMapperAlias = IMapperAlias.INSTANCE;
    private final IMapperEquipamiento iMapperEquipamiento = IMapperEquipamiento.INSTANCE;
    private final IMapperPoder iMapperPoder = IMapperPoder.INSTANCE;

    @Override
    public Personaje personajeDTOTOPersonaje(PersonajeDTO personajeDTODTO) {
        if ( personajeDTODTO == null ) {
            return null;
        }

        Personaje personaje = new Personaje();

        personaje.setId( personajeDTODTO.getId() );
        personaje.setNombre( personajeDTODTO.getNombre() );
        personaje.setGenero( personajeDTODTO.getGenero() );
        personaje.setAlias( aliasDTOToAlias( personajeDTODTO.getAlias() ) );
        personaje.setEquipamientos( equipamientoDTOSetToEquipamientoSet( personajeDTODTO.getEquipamientos() ) );
        personaje.setPoderes( poderDTOSetToPoderSet( personajeDTODTO.getPoderes() ) );

        return personaje;
    }

    @Override
    public PersonajeDTO personajeTOPersonajeDTO(Personaje personaje) {
        if ( personaje == null ) {
            return null;
        }

        PersonajeDTO personajeDTO = new PersonajeDTO();

        personajeDTO.setId( personaje.getId() );
        personajeDTO.setNombre( personaje.getNombre() );
        personajeDTO.setGenero( personaje.getGenero() );
        personajeDTO.setAlias( iMapperAlias.aliasTOAliasDTO( personaje.getAlias() ) );
        personajeDTO.setPoderes( poderSetToPoderDTOSet( personaje.getPoderes() ) );
        personajeDTO.setEquipamientos( equipamientoSetToEquipamientoDTOSet( personaje.getEquipamientos() ) );

        return personajeDTO;
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

    protected Set<PoderDTO> poderSetToPoderDTOSet(Set<Poder> set) {
        if ( set == null ) {
            return null;
        }

        Set<PoderDTO> set1 = new LinkedHashSet<PoderDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Poder poder : set ) {
            set1.add( iMapperPoder.poderTOpoderDTO( poder ) );
        }

        return set1;
    }

    protected Set<EquipamientoDTO> equipamientoSetToEquipamientoDTOSet(Set<Equipamiento> set) {
        if ( set == null ) {
            return null;
        }

        Set<EquipamientoDTO> set1 = new LinkedHashSet<EquipamientoDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Equipamiento equipamiento : set ) {
            set1.add( iMapperEquipamiento.equipamientoTOEquipamientoDTO( equipamiento ) );
        }

        return set1;
    }
}
