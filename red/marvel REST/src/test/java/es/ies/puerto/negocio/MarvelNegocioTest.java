package es.ies.puerto.negocio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;

public class MarvelNegocioTest {
    private static final String DESCRIPCION = "descripcion";
    private static final String NOMBRE_EQUI = "nombreEqui";
    private static final String ID_EQUI = "idEqui";
    private static final String DESCRIPCION_ALIAS = "descripcionAlias";
    private static final String ID_ALIAS = "idAlias";
    private static final String NOMBRE_PODER = "nombrePoder";
    private static final String ID_PODER = "idPoder";
    private static final String GENERO = "genero";
    private static final String NOMBRE = "nombre";
    private static final String ID = "id";
    static MarvelNegocio marvelNegocio;
    PersonajeDTO personajeDTO;
    PoderDTO poderDTO;
    AliasDTO aliasDTO;
    EquipamientoDTO equipamientoDTO;

    @BeforeAll
    public static void beforeAll() {
        marvelNegocio = new MarvelNegocio();
    }

    @BeforeEach
    public void beforeEach() {
        personajeDTO = new PersonajeDTO(ID, NOMBRE, GENERO, null, null, null);
        poderDTO = new PoderDTO(ID_PODER, NOMBRE_PODER);
        aliasDTO = new AliasDTO(ID_ALIAS, DESCRIPCION_ALIAS);
        equipamientoDTO = new EquipamientoDTO(ID_EQUI, NOMBRE_EQUI, DESCRIPCION);

        personajeDTO.setAlias(aliasDTO);
        personajeDTO.setEquipamientos(new HashSet<>(Arrays.asList(equipamientoDTO)));
        personajeDTO.setPoderes(new HashSet<>(Arrays.asList(poderDTO)));

        marvelNegocio.agregarPersonaje(personajeDTO);
    }

    @AfterEach
    public void afterEach() {
        marvelNegocio.eliminarPersonaje(personajeDTO);
        Assertions.assertNull(marvelNegocio.obtenerPersonajeById(ID));
    }

    @Test
    void obtenerPersonajeByIdTest() {
        Assertions.assertEquals(personajeDTO, marvelNegocio.obtenerPersonajeById(ID));
    }

    @Test
    void obtenerPersonajesTest() {
        Assertions.assertNotNull(marvelNegocio.obtenerPersonajes());
    }

    @Test
    void obtenerAliasByIdTest() {
        Assertions.assertEquals(aliasDTO, marvelNegocio.obtenerAliasById(ID_ALIAS));
    }

    @Test
    void obtenerAliasTest() {
        Assertions.assertNotNull(marvelNegocio.obtenerAlias());
    }

    @Test
    void obtenerEquipamientoByIdTest() {
        Assertions.assertEquals(equipamientoDTO, marvelNegocio.obtenerEquipamientoById(ID_EQUI));
    }

    @Test
    void obtenerEquipamientosTest() {
        Assertions.assertNotNull(marvelNegocio.obtenerEquipamientos());
    }

    @Test
    void obtenerPoderByIdTest() {
        Assertions.assertEquals(poderDTO, marvelNegocio.obtenerPoderById(ID_PODER));
    }

    @Test
    void obtenerPoderesTest() {
        Assertions.assertNotNull(marvelNegocio.obtenerPoderes());
    }

    @Test
    void agregarEliminarAliasTest() {
        AliasDTO aliasDTOAgregar = new AliasDTO(ID_ALIAS + "2", DESCRIPCION_ALIAS + "2");
        Assertions.assertTrue(marvelNegocio.agregarAlias(aliasDTOAgregar, new PersonajeDTO(ID)));
        Assertions.assertEquals(aliasDTOAgregar, marvelNegocio.obtenerAliasById(ID_ALIAS + "2"));
        marvelNegocio.eliminarAlias(aliasDTOAgregar, personajeDTO);
        Assertions.assertNull(marvelNegocio.obtenerAliasById(ID_ALIAS + "2"));
    }

    @Test
    void agregarEliminarEquipamientoTest() {
        EquipamientoDTO equipamientoDTOaAgregar = new EquipamientoDTO(ID_EQUI + "2", NOMBRE_EQUI + "2",
                DESCRIPCION + "2");
        Assertions.assertTrue(marvelNegocio.agregarEquipamiento(equipamientoDTOaAgregar, new PersonajeDTO(ID)));
        Assertions.assertEquals(equipamientoDTOaAgregar, marvelNegocio.obtenerEquipamientoById(ID_EQUI + "2"));
        marvelNegocio.eliminarEquipamiento(equipamientoDTOaAgregar, personajeDTO);
        Assertions.assertNull(marvelNegocio.obtenerEquipamientoById(ID_EQUI + "2"));
    }

    @Test
    void agregarEliminarpoderTest() {
        PoderDTO poderDTOAgregar = new PoderDTO(ID_PODER + "2", NOMBRE_PODER + "2");
        Set<PersonajeDTO> personajeDTOs = new HashSet<>(Arrays.asList(new PersonajeDTO(ID)));
        Assertions.assertTrue(marvelNegocio.agregarPoder(poderDTOAgregar, personajeDTOs));
        Assertions.assertEquals(poderDTOAgregar, marvelNegocio.obtenerPoderById(ID_PODER + "2"));
        marvelNegocio.eliminarPoder(poderDTOAgregar, personajeDTOs);
        Assertions.assertNull(marvelNegocio.obtenerPoderById(ID_PODER + "2"));
    }
}
