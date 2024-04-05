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
    Usuario usuario;
    @BeforeEach
    public void beforeEach(){
        crudDb = new CrudDb();
        usuario = new Usuario("11","pepe",20,"MiCiudad");

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
        try {
            int originalSize = crudDb.obtenerUsuarios().size();
            crudDb.insertarUsuario(usuario);
            Usuario usuarioObtenido = crudDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario,usuarioObtenido);
            crudDb.eliminarUsuario(usuarioObtenido);
            Assertions.assertEquals(originalSize, crudDb.obtenerUsuarios().size());
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
    @Test
    public void actualizarUsuarioTest(){
        String nombreUpdate="Pepe Juan";
        int edadUpdate=22;
        String ciudadUpdate = "Miami";
        try {
            crudDb.insertarUsuario(usuario);
            usuario.setNombre(nombreUpdate);
            usuario.setEdad(edadUpdate);
            usuario.setCiudad(ciudadUpdate);
            crudDb.actualizarUsuario(usuario);
            Usuario usuarioEncontrado = crudDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuarioEncontrado.getNombre(), nombreUpdate);
            Assertions.assertEquals(usuarioEncontrado.getCiudad(), ciudadUpdate);
            Assertions.assertEquals(usuarioEncontrado.getEdad(), edadUpdate);
            Assertions.assertEquals(usuario, usuarioEncontrado);
            crudDb.eliminarUsuario(usuarioEncontrado);
        } catch (Exception e) {
            Assertions.fail();
        }
    }
}
