package es.ies.puerto.negocio;

import java.util.List;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.negocio.impl.Negocio;

public class NegocioTest {
    Negocio negocio;
    List<Personaje> personajes;
    @BeforeEach
    public void beforeEach(){
        negocio = new Negocio();
        personajes = negocio.getPersonas();
    }
    @AfterEach
    public  void afterEach(){
        negocio.setPersonas(personajes);
    }

    @Test
    public void NegocioNotNull(){
        Assertions.assertNotNull(negocio);
    }
    @Test
    public void NegocioMostrarPersonajesTodosFormatosTest(){
        Assertions.assertTrue(negocio.mostrarPersonajesTodosFormatos().contains("Iron Man"));
    }
}
