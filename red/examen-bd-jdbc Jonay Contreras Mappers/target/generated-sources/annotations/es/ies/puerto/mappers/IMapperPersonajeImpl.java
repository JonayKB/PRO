package es.ies.puerto.mappers;

import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-13T14:53:02+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.9 (Private Build)"
)
public class IMapperPersonajeImpl implements IMapperPersonaje {

    private final IMapperAlias iMapperAlias = IMapperAlias.INSTANCE;
    private final IMapperPoder iMapperPoder = IMapperPoder.INSTANCE;

    @Override
    public Personaje personajeDTOTOPersonaje(PersonajeDTO personajeDTODTO) {
        if ( personajeDTODTO == null ) {
            return null;
        }

        Personaje personaje = new Personaje();

        personaje.setAlias( iMapperAlias.aliasDTOTOAlias( personajeDTODTO.getAlias() ) );
        personaje.setGenero( personajeDTODTO.getGenero() );
        personaje.setId( personajeDTODTO.getId() );
        personaje.setNombre( personajeDTODTO.getNombre() );
        personaje.setPoderes( poderDTOSetToPoderSet( personajeDTODTO.getPoderes() ) );

        return personaje;
    }

    @Override
    public PersonajeDTO personajeTOPersonajeDTO(Personaje personaje) {
        if ( personaje == null ) {
            return null;
        }

        PersonajeDTO personajeDTO = new PersonajeDTO();

        personajeDTO.setAlias( iMapperAlias.aliasTOAliasDTO( personaje.getAlias() ) );
        personajeDTO.setGenero( personaje.getGenero() );
        personajeDTO.setId( personaje.getId() );
        personajeDTO.setNombre( personaje.getNombre() );
        personajeDTO.setPoderes( poderSetToPoderDTOSet( personaje.getPoderes() ) );

        return personajeDTO;
    }

    protected Set<Poder> poderDTOSetToPoderSet(Set<PoderDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Poder> set1 = new LinkedHashSet<Poder>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PoderDTO poderDTO : set ) {
            set1.add( iMapperPoder.poderDTOTOpoder( poderDTO ) );
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
}
