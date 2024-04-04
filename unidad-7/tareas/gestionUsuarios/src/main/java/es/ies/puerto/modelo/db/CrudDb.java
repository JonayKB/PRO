package es.ies.puerto.modelo.db;


import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.impl.Usuario;

public class CrudDb extends Conexion{

    public CrudDb(String url) {
        super(url);
    }

    public Set<Usuario> obtenerUsuarios() throws UsuarioException{
        String sql = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios as u";     
        return obtener(sql);
    }
    private void  actualizar(String sql) throws UsuarioException{
        Statement statement = null;
        try {
            statement = getConnection().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new UsuarioException(e.getMessage(),e);
        }finally{
            try {
                if(statement != null && !statement.isClosed()){
                    statement.close();
                }
                if (getConnection() != null && !getConnection().isClosed()) {
                    getConnection().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(),e);
            }

        }
    }

    private Set<Usuario> obtener(String sql) throws UsuarioException{
        Set<Usuario> usuarios = new HashSet<>();
        Statement statement = null;
        ResultSet resulSet = null;
        try {
            statement = getConnection().createStatement();
            resulSet=statement.executeQuery(sql);
            while (resulSet.next()) {
                String id = resulSet.getString("id");
                String nombre = resulSet.getString("nombre");
                int edad = resulSet.getInt("edad");
                String ciudad = resulSet.getString("ciudad");
                Usuario usuario = new Usuario(id, nombre, edad, ciudad);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            throw new UsuarioException(e.getMessage(),e);
        }finally{
            try {
                if(resulSet != null && !resulSet.isClosed()){
                    resulSet.close();
                }
                if(statement != null && !statement.isClosed()){
                    statement.close();
                }
                if (getConnection() != null && !getConnection().isClosed()) {
                    getConnection().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(),e);
            }

        }
        return usuarios;
    }

    public Usuario obtenerUsuario(Usuario usuario)throws UsuarioException{
        String sql = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios as u WHERE u.id='"+usuario.getId()+"'";     
        Set<Usuario> usuarios = obtener(sql);
        if(usuarios.isEmpty()){
            return null;
        }
        return obtener(sql).iterator().next();
    }

    public void insertarUsuario(Usuario usuario)throws UsuarioException{
        String sql = "INSERT INTO usuarios (nombre,edad,ciudad) VALUES ('"+usuario.getNombre()+"',"+usuario.getEdad()+",'"+usuario.getCiudad()+"')";
        actualizar(sql);
    }

    public void actualizarUsuario(Usuario usuario){

    }

    public void eliminarUsuario(Usuario usuario){

    }
}
