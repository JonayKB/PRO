package es.ies.puerto.mappers;

import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-13T14:53:03+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.9 (Private Build)"
)
public class IMapperPoderImpl implements IMapperPoder {

    @Override
    public Poder poderDTOTOpoder(PoderDTO poderDTO) {
        if ( poderDTO == null ) {
            return null;
        }

        Poder poder = new Poder();

        poder.setId( poderDTO.getId() );
        poder.setNombre( poderDTO.getNombre() );

        return poder;
    }

    @Override
    public PoderDTO poderTOpoderDTO(Poder poder) {
        if ( poder == null ) {
            return null;
        }

        PoderDTO poderDTO = new PoderDTO();

        poderDTO.setId( poder.getId() );
        poderDTO.setNombre( poder.getNombre() );

        return poderDTO;
    }
}
