package es.ies.puerto.modelo.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConexionTest {
    Conexion conexion;
    
    @BeforeEach
    public void beforeEach(){
        conexion = new Conexion();
    }

    @Test
    public void ConexionNotNull(){
        Assertions.assertNotNull(conexion);
    }

    @Test
    public void conectarTest(){
        try {
            conexion.getConnection();
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
