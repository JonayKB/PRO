package es.ies.puerto.services;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import es.ies.puerto.DTO.PersonajeDTO;
import es.ies.puerto.DTO.PoderDTO;
import es.ies.puerto.negocio.MarvelNegocio;

public class MarvelServiceTest {

    MarvelService marvelService;
    @Mock
    MarvelNegocio marvelNegocioMock;

    @BeforeEach
    public void beforeEach(){
        MockitoAnnotations.initMocks(this);
        marvelService = new MarvelService(marvelNegocioMock);
    }

    @Test
    void getPersonajeByIdTestOk(){
        when(marvelNegocioMock.obtenerPersonajeById(anyString())).thenReturn(new PersonajeDTO());

        Response response = marvelService.obtenerPersonajeById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }
    @Test
    void getPersonajeByIdTestNotFound(){
        when(marvelNegocioMock.obtenerPersonajeById(anyString())).thenReturn(null);

        Response response = marvelService.obtenerPersonajeById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getPersonajesTestOk(){
        when(marvelNegocioMock.obtenerPersonajes()).thenReturn(new ArrayList<>());

        Response response = marvelService.obtenerPersonajes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }
    @Test
    void getPersonajesTestNotFound(){
        when(marvelNegocioMock.obtenerPersonajes()).thenReturn(null);

        Response response = marvelService.obtenerPersonajes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }




    @Test
    void getpoderByIdTestOk(){
        when(marvelNegocioMock.obtenerPoderById(anyString())).thenReturn(new PoderDTO());

        Response response = marvelService.obtenerPoderById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }
    @Test
    void getPoderByIdTestNotFound(){
        when(marvelNegocioMock.obtenerPoderById(anyString())).thenReturn(null);

        Response response = marvelService.obtenerPoderById("idTest");

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    void getPoderesTestOk(){
        when(marvelNegocioMock.obtenerPoderes()).thenReturn(new ArrayList<>());

        Response response = marvelService.obtenerPoderes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }
    @Test
    void getPoderesTestNotFound(){
        when(marvelNegocioMock.obtenerPoderes()).thenReturn(null);

        Response response = marvelService.obtenerPoderes();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }
}
