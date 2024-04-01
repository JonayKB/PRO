package es.ies.puerto.modelo.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConexionTest {
    private static final String URL = "src/main/resources/usuarios.db";
    Conexion conexion;
    
    @BeforeEach
    public void beforeEach(){
        conexion = new Conexion(URL);
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
