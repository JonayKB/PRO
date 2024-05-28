package es.ies.puerto.mappers;

import static org.mockito.ArgumentMatchers.nullable;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MapperUtils {
    private static final String GENERO = "genero";
    private static final String NOMBRE_PERSONAJE = "nombrePersonaje";
    private static final String ID_PERSONAJE = "idPersonaje";
    private static final String NOMBRE_PODER = "nombrePoder";
    private static final String ID_PODER = "idPoder";
    private static final String DESCRIPCION_EQUI = "descripcionEqui";
    private static final String NOMBRE_EQUI = "nombreEqui";
    private static final String ID_EQUI = "idEqui";
    private static final String DESCRIPCION_ALIAS = "descripcionAlias";
    private static final String ID_ALIAS = "idAlias";
    Alias alias;
    Equipamiento equipamiento;
    Personaje personaje;
    Poder poder;

    AliasDTO aliasDTO;
    EquipamientoDTO equipamientoDTO;
    PersonajeDTO personajeDTO;
    PoderDTO poderDTO;

    @BeforeEach
    public void beforeEach() {
        alias = new Alias(ID_ALIAS, DESCRIPCION_ALIAS, null);
        aliasDTO = new AliasDTO(ID_ALIAS, DESCRIPCION_ALIAS);

        equipamiento = new Equipamiento(ID_EQUI, NOMBRE_EQUI, DESCRIPCION_EQUI, null);
        equipamientoDTO = new EquipamientoDTO(ID_EQUI, NOMBRE_EQUI, DESCRIPCION_EQUI);

        poder = new Poder(ID_PODER, NOMBRE_PODER, null);
        poderDTO = new PoderDTO(ID_PODER, NOMBRE_PODER);

        personaje = new Personaje(ID_PERSONAJE, NOMBRE_PERSONAJE, GENERO, null, null, null);
        personajeDTO = new PersonajeDTO(ID_PERSONAJE, NOMBRE_PERSONAJE, GENERO, null, null, null);

        alias.setPersonaje(personaje);

        equipamiento.setPersonaje(personaje);

        poder.setPersonaje(new HashSet<>(Arrays.asList(personaje)));

        personaje.setAlias(alias);
        personajeDTO.setAlias(aliasDTO);
    }
}
