package es.ies.puerto.negocio;

import java.util.Arrays;
import java.util.HashSet;

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
    public static void beforeAll(){
        marvelNegocio = new MarvelNegocio();
    }

    @BeforeEach
    public void beforeEach(){
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
    public void afterEach(){
        marvelNegocio.eliminarPersonaje(personajeDTO);
        Assertions.assertNull(marvelNegocio.obtenerPersonajeById(ID));
    }

    @Test
    void obtenerPersonajeByIdTest(){
        marvelNegocio.obtenerPersonajeById(ID);
    }




}
