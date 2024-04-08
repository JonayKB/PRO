package es.ies.puerto.modelo.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.excepcion.UsuarioException;

public class ConexionTest {
    Conexion conexion;
    @BeforeEach
    public void beforeEach()throws UsuarioException{
        conexion = new Conexion();
    }

    @Test
    public void conexionNotNullTest(){
        Assertions.assertNotNull(conexion);
    }
    @Test
    public void getConnectionTest(){
        try {
            conexion.getConnection();
        } catch (UsuarioException e) {
            Assertions.fail();
        }
    }
}
