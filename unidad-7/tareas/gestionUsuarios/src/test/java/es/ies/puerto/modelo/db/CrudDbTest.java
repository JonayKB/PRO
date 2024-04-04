package es.ies.puerto.modelo.db;

import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.impl.Usuario;

public class CrudDbTest {
    CrudDb crudDb;
    @BeforeEach
    public void beforeEach(){
        crudDb = new CrudDb("src/main/resources/usuarios.db");
    }
    @Test
    public void CrudDbNotNullTest(){
        Assertions.assertNotNull(crudDb);
    }
    @Test
    public void obtenerUsuarioTest(){
        Usuario usuario = new Usuario("5");
        try {
            usuario = crudDb.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario);
            Assertions.assertNotNull(usuario.getId());
            Assertions.assertNotNull(usuario.getNombre());
            Assertions.assertNotNull(usuario.getEdad());
            Assertions.assertNotNull(usuario.getCiudad());

        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void InsertarEliminarUsuarioTest(){
        Usuario usuario = new Usuario("12","pepe",20,"MiCiudad");
        try {
            crudDb.insertarUsuario(usuario);
            Usuario usuarioObtenido = crudDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario,usuarioObtenido);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void obtenerUsuariosTest(){
        try {
            Set<Usuario> usuarios = crudDb.obtenerUsuarios();
            Assertions.assertEquals(10,usuarios.size() );
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
}
