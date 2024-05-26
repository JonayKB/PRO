package es.ies.puerto.services;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import es.ies.puerto.DTO.AliasDTO;
import es.ies.puerto.DTO.EquipamientoDTO;
import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.negocio.MarvelNegocio;

public class MarvelServiceTest {

    MarvelService marvelService;
    @Mock
    MarvelNegocio marvelNegocioMock;

    @BeforeEach
    public void beforeEach() {
        marvelService = new MarvelService();
        MockitoAnnotations.initMocks(this);
        marvelService = new MarvelService(marvelNegocioMock);
    }

    @Test
    void getPersonajeByIdTestOk() {
        when(marvelNegocioMock.obtenerPersonajeById(anyString())).thenReturn(new PersonajeDTO());

        Response response = marvelService.obtenerPersonajeById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getPersonajeByIdTestNotFound() {
        when(marvelNegocioMock.obtenerPersonajeById(anyString())).thenReturn(null);

        Response response = marvelService.obtenerPersonajeById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getPersonajesTestOk() {
        when(marvelNegocioMock.obtenerPersonajes()).thenReturn(new ArrayList<>());

        Response response = marvelService.obtenerPersonajes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getPersonajesTestNotFound() {
        when(marvelNegocioMock.obtenerPersonajes()).thenReturn(null);

        Response response = marvelService.obtenerPersonajes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getpoderByIdTestOk() {
        when(marvelNegocioMock.obtenerPoderById(anyString())).thenReturn(new PoderDTO());

        Response response = marvelService.obtenerPoderById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getPoderByIdTestNotFound() {
        when(marvelNegocioMock.obtenerPoderById(anyString())).thenReturn(null);

        Response response = marvelService.obtenerPoderById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getPoderesTestOk() {
        when(marvelNegocioMock.obtenerPoderes()).thenReturn(new ArrayList<>());

        Response response = marvelService.obtenerPoderes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getPoderesTestNotFound() {
        when(marvelNegocioMock.obtenerPoderes()).thenReturn(null);

        Response response = marvelService.obtenerPoderes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getAliasByIdTestOk() {
        when(marvelNegocioMock.obtenerAliasById(anyString())).thenReturn(new AliasDTO());

        Response response = marvelService.obtenerAliasById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getAliasByIdTestNotFound() {
        when(marvelNegocioMock.obtenerAliasById(anyString())).thenReturn(null);

        Response response = marvelService.obtenerAliasById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getAliasTestOk() {
        when(marvelNegocioMock.obtenerAlias()).thenReturn(new ArrayList<>());

        Response response = marvelService.obtenerAlias();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getAliasTestNotFound() {
        when(marvelNegocioMock.obtenerAlias()).thenReturn(null);

        Response response = marvelService.obtenerAlias();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getEquipamientoByIdTestOk() {
        when(marvelNegocioMock.obtenerEquipamientoById(anyString())).thenReturn(new EquipamientoDTO());

        Response response = marvelService.obtenerEquipamientoById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getEquipamientoByIdTestNotFound() {
        when(marvelNegocioMock.obtenerEquipamientoById(anyString())).thenReturn(null);

        Response response = marvelService.obtenerEquipamientoById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getEquipamientosTestOk() {
        when(marvelNegocioMock.obtenerEquipamientos()).thenReturn(new ArrayList<>());

        Response response = marvelService.obtenerEquipamientos();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void getEquipamientosTestNotFound() {
        when(marvelNegocioMock.obtenerEquipamientos()).thenReturn(null);

        Response response = marvelService.obtenerEquipamientos();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void agregarPersonajeTestOk() {
        when(marvelNegocioMock.agregarPersonaje(any(PersonajeDTO.class))).thenReturn(true);

        Response response = marvelService.agregarPersonaje(any(PersonajeDTO.class));

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    void agregarPoderTestOk() {
        when(marvelNegocioMock.agregarPoder(any(PoderDTO.class), anySet())).thenReturn(true);

        Response response = marvelService.agregarPoder(any(PoderDTO.class), new ArrayList<String>(Arrays.asList("1")));

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    void agregarAliasTestOk() {
        when(marvelNegocioMock.agregarAlias(any(AliasDTO.class), any(PersonajeDTO.class))).thenReturn(true);

        Response response = marvelService.agregarAlias(any(AliasDTO.class), anyString());

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    void agregarEquipamientoTestOk() {
        when(marvelNegocioMock.agregarEquipamiento(any(EquipamientoDTO.class), any(PersonajeDTO.class)))
                .thenReturn(true);

        Response response = marvelService.agregarEquipamiento(any(EquipamientoDTO.class), anyString());

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    void eliminarPersonajeTestOk() {
        when(marvelNegocioMock.eliminarPersonaje(any(PersonajeDTO.class))).thenReturn(true);

        Response response = marvelService.eliminarPersonaje(any(PersonajeDTO.class));

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
    @Test
    void eliminarPoderTestOk() {
        when(marvelNegocioMock.eliminarPoder(any(PoderDTO.class), anySet())).thenReturn(true);

        Response response = marvelService.eliminarPoder(any(PoderDTO.class), new ArrayList<String>(Arrays.asList("1")));

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
    @Test
    void eliminarAliasTestOk() {
        when(marvelNegocioMock.eliminarAlias(any(AliasDTO.class), any(PersonajeDTO.class))).thenReturn(true);

        Response response = marvelService.eliminarAlias(any(AliasDTO.class), anyString());

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
    @Test
    void eliminarEquipamientoTestOk() {
        when(marvelNegocioMock.eliminarEquipamiento(any(EquipamientoDTO.class), any(PersonajeDTO.class)))
                .thenReturn(true);

        Response response = marvelService.eliminarEquipamiento(any(EquipamientoDTO.class), anyString());

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
    

}
