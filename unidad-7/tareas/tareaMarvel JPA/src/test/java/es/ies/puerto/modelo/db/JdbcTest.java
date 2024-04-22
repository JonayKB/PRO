package es.ies.puerto.modelo.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Alias;
import es.ies.puerto.modelo.impl.Personaje;

public class JdbcTest {
    Crud crud;
    @BeforeEach
    public void beforeEach(){
        crud = new Crud();
    }

    @Test
    public void obtenerPoderes() throws UsuarioException{
        Assertions.assertEquals(3, crud.obtenerPoderes(1).size());
    }
    @Test
    public void obtenerAlias() throws UsuarioException{
        Alias aliasObtener = crud.obtenerAlias(1);
        Alias alias = new Alias(1, new Personaje(1), "Tony Stark");
        Assertions.assertEquals(alias, aliasObtener);
        Assertions.assertEquals(alias.getAlias(), aliasObtener.getAlias());
        Assertions.assertEquals(alias.getPersonaje(), aliasObtener.getPersonaje());
    }
    @Test
    public void obtenerPersonajes()throws UsuarioException{
        Assertions.assertEquals(2, crud.obtenerPersonajes().size());
    }
}
