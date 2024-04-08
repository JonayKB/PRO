package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Personaje;

public class CrudDb extends Conexion{
    public CrudDb() throws UsuarioException {}
    public Set obtener(String sql) throws UsuarioException{
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
	public void agregarPersonaje(Personaje personaje){}
    public void eliminarPersonaje(Personaje personaje){}
    public void modificarPersonaje(Personaje personaje){}
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
    public Personaje obtenerPersonaje(Personaje personaje){
        return new Personaje(0);
    }
    public Set<Personaje> obtenerPersonajes()throws UsuarioException{
        Set<Personaje> personajes= obtener("SELECT id,nombre,alias,genero from Personajes");
        return personajes;
    }
}
