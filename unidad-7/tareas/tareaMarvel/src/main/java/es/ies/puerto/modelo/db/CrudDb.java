package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Personaje;

public class CrudDb extends Conexion{
    public CrudDb() throws UsuarioException {}
    public void ejecutar(String sql) throws UsuarioException{
        Statement statement = null;
        try {
            statement = getConnection().createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }finally{
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                cerrar();
            } catch (Exception e) {
                throw new UsuarioException(sql, e);
            }
        }
    }
    public Set<Personaje> obtener(String sql) throws UsuarioException{
        Set<Personaje> personajes = null;
        Set<String> poderes = null;

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(sql);
            personajes = new HashSet<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String alias = resultSet.getString("alias");
                String genero = resultSet.getString("genero");
                poderes = obtenerPoderes(id);
                Personaje personajeNuevo = new Personaje(id, nombre, alias, genero, poderes);
                personajes.add(personajeNuevo);
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }finally{
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                cerrar();
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (Exception e) {
                throw new UsuarioException(sql, e);
            }
        }
        return personajes;
    }
	public void agregarPersonaje(Personaje personaje) throws UsuarioException{
        String sql = "INSERT INTO Personajes (id,nombre,alias,genero) "+
        "VALUES ("+personaje.getId()+",'"+personaje.getNombre()+"','"+personaje.getAlias()+"','"+personaje.getGenero()+"')";
        ejecutar(sql);
    }
    public void eliminarPersonaje(Personaje personaje)throws UsuarioException{
        String sql = "DELETE FROM Personajes WHERE id="+personaje.getId();
        ejecutar(sql);
    }
    public void modificarPersonaje(Personaje personaje)throws UsuarioException{
        String sql = "UPDATE FROM Personajes SET id="+personaje.getId()+",nombre='"+
        personaje.getNombre()+"',alias='"+personaje.getAlias()+"',genero='"+personaje.getGenero()+"' WHERE id="+personaje.getId();
        ejecutar(sql);
    }
    public Set<String> obtenerPoderes(int id)throws UsuarioException{
        Set<String> poderes = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = getConnection().createStatement();
            String sql = "SELECT poder FROM poderes WHERE personaje_id="+id;
            resultSet = statement.executeQuery(sql);
            poderes = new HashSet<>();

            while (resultSet.next()) {
                
                poderes.add(resultSet.getString("poder"));
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }finally{
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                cerrar();
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (Exception e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return poderes;
    }
    public Personaje obtenerPersonaje(Personaje personaje)throws UsuarioException{
        return obtener("SELECT id,nombre,alias,genero from Personajes WHERE id="+personaje.getId()).iterator().next();
    }
    public Set<Personaje> obtenerPersonajes()throws UsuarioException{
        Set<Personaje> personajes= obtener("SELECT id,nombre,alias,genero from Personajes");
        return personajes;
    }
}
